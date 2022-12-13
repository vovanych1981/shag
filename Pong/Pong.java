package Pong;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Pong extends Application {

    private static final int width = 800;
    private static final int height = 600;
    private static final int PLAYER_HEIGHT = 100;
    private static final int PLAYER_WIDTH = 15;
    private static final double BALL_RADIUS = 15;
    // для мяча
    private int ballYSpeed = 1;
    private int ballXSpeed = 1;
    private double leftPlayerYPos = height / 2;
    private double rightPlayerYPos = height / 2;
    // для мяча начальная позиция
    private double ballXPos = width / 2;
    private double ballYPos = height / 2;
    private int leftScore = 0; //p1
    private int rightScore = 0;  //p2
    private static Random random;
    private boolean gameStarted;
    private int leftPlayerXPos = 0;  //   playerOneXPos
    private double rightPlayerXPos = width - PLAYER_WIDTH - 10;  // playerTwoXPos

    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(width, height);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10), e -> run(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
        canvas.setOnMouseMoved(e -> leftPlayerYPos = e.getY());
        canvas.setOnMouseClicked(e -> gameStarted = true);
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }

    private void run(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, width, height);
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font(25));
        if (gameStarted) {

            // движение мяча

            ballXPos += ballXSpeed;
            ballYPos += ballYSpeed;

            // проверяем выход мяча за пределы поля

            if (ballXPos < leftPlayerXPos) {
                rightScore++;
                gameStarted = false;
            }
            if (ballYPos > rightPlayerXPos) {
                leftScore++;
                gameStarted = false;
            }
            if(ballYPos<0 || ballYPos>height){
                ballYSpeed=-ballYSpeed;
            }

            // типа ИИ для правого игрока

            if (ballXPos < 3 * width / 4) {
                rightPlayerYPos = ballYPos - height / 2;
            } else {
                rightPlayerYPos = ballYPos > rightPlayerYPos + height / 2 ?
                        rightPlayerYPos += 1 : rightPlayerYPos - 1;
                gc.fillOval(ballXPos, ballYPos, BALL_RADIUS, BALL_RADIUS);

            }


            if (ballXPos < width - width / 4) {
                rightPlayerYPos = ballYPos - PLAYER_HEIGHT / 2;
            } else {
                rightPlayerYPos = ballYPos > rightPlayerYPos + PLAYER_HEIGHT / 2 ? rightPlayerYPos += 1 : rightPlayerYPos - 1;
            }
            gc.fillOval(ballXPos, ballYPos, BALL_RADIUS, BALL_RADIUS);

            // игра не началась

        } else {
            gc.setStroke(Color.YELLOW);
            gc.setTextAlign(TextAlignment.CENTER);
            gc.strokeText("Click to Start", width / 2, height / 2);
            ballXPos = width / 2;
            ballYPos = height / 2;
            if (random.nextInt(2) == 0) {
                ballXSpeed = 1;
            } else {
                ballXSpeed = -1;
            }
            if (random.nextInt(2) == 0) {
                ballYSpeed = 1;
            } else {
                ballYSpeed = -1;
            }


        }

       if (ballYPos > height || ballYPos < 0) ballYSpeed *= -1;
        if (ballXPos < leftPlayerXPos - PLAYER_WIDTH) {
            rightScore++;
            gameStarted = false;
        }
        if (ballXPos > rightPlayerXPos + PLAYER_WIDTH) {
            leftScore++;
            gameStarted = false;
        }

        // отбивание мяча от ракеток

        if (((ballXPos + BALL_RADIUS > rightPlayerXPos) &&
                ballYPos >= rightPlayerYPos && ballYPos <= rightPlayerYPos + PLAYER_HEIGHT) ||
                ((ballXPos < leftPlayerXPos + PLAYER_WIDTH)
                        && ballYPos >= leftPlayerYPos && ballYPos <= leftPlayerYPos + PLAYER_HEIGHT)) {
            ballYSpeed += 1 * Math.signum(ballYSpeed);
            ballXSpeed += 1 * Math.signum(ballXSpeed);
            ballXSpeed *= -1;
            ballYSpeed *= -1;
        }
        gc.fillText(leftScore + "\t\t\t\t\t\t\t\t" + rightScore, width / 2, 100);
        gc.fillRect(rightPlayerXPos, rightPlayerYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
        gc.fillRect(leftPlayerXPos, leftPlayerYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
    }

}

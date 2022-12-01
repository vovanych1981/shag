package Lesson35;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example4 {
    static String lineSeparator = System.getProperty("line.separator");

    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("lines1251.txt");
                InputStreamReader isr = new InputStreamReader(fis, "windows-1251");
                FileOutputStream fos = new FileOutputStream("lines3.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                BufferedWriter bw = new BufferedWriter(osw);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line + lineSeparator);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

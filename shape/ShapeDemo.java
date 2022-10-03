package hw.OOP.shape;

public  class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        Circle c1 = new Circle("красный", 2,3,44);
        Circle c2 = new Circle("белый", 4,5,55);
        Circle c3 = new Circle("белый", 4,5,55);
        Rectangle r1 = new Rectangle("синий", 4,5,4,5);
        Rectangle r2 = new Rectangle("желтый", 5,8,5,8);

        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = r1;
        shapes[3] = r2;

        for(Shape shape: shapes){
            shape.draw();
            //System.out.println(shape);
        }
        System.out.println(c1.equals(c2));
        System.out.println(c2 == c3);
        System.out.println(r1.equals(r2));
        System.out.println(c2.equals(c3));
    }
}

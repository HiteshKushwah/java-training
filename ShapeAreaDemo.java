public class ShapeAreaDemo {

    static class Shape {
        public void calculateArea() {
            System.out.println("Area calculation not defined for Shape.");
        }
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + area);
        }
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public void calculateArea() {
            double area = length * width;
            System.out.println("Area of Rectangle: " + area);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Shape();
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(4, 6);

        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }
}

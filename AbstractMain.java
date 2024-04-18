abstract class Shape {
    protected int side1;
    protected int side2;
    
    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    
    public void printArea() {
        int area = side1 * side2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }
    
    public void printArea() {
        double area = 0.5 * side1 * side2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }
    
    public void printArea() {
        double area = Math.PI * side1 * side1;
        System.out.println("Area of Circle: " + area);
    }
}

class AbstractMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.printArea();

        Triangle triangle = new Triangle(3, 6);
        triangle.printArea();

        Circle circle = new Circle(2);
        circle.printArea();
    }
}


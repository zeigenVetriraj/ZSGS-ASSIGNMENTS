
/*
 
5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
 */

public class Shapes{
   
    public static void main(String[] args) {
        Shape s = new Shape();
        s.print();  // This is a shape

        Polygon p = new Polygon();
        p.print();  // Polygon is a shape

        Rectangle r = new Rectangle();
        r.print();  // Rectangle is a polygon

        Triangle t = new Triangle();
        t.print();  // Triangle is a polygon

        Square sq = new Square();
        sq.print();  // Square is a rectangle
    }

}

class Shape{
    void print(){
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape{
    void print(){
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon{    
    void print(){
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon{
    void print(){
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle{
    void print(){
        System.out.println("Square is a rectangle");
    }
}


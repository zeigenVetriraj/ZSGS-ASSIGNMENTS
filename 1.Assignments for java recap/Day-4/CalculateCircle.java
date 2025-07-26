import java.util.Scanner;

/*
3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14
*/
public class CalculateCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the x Value : ");
		int x = sc.nextInt();
		System.out.print("Enter the y Value : ");
		int y = sc.nextInt();
		System.out.print("Enter the radius : ");
		int radius = sc.nextInt();
		
		Circle circle = new Circle();
		circle.setPoint(x, y);
		circle.setRadius(radius);
		
		circle.printPoint();
		System.out.println("Radius is "+circle.getRadius());
		System.out.println("Area is "+circle.area());
	}
}
class Point{
	private int x;
	private int y;
	
	public Point(){
		x=0;
		y=0;
	}
	void setPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	void printPoint(){
		System.out.println("Circle center is (" + getX() + "," + getY() + ")");
	}
}

class Circle extends Point{
	private int radius;
	
	public Circle(){
		super();
		radius = 1;
	}
	
	public void setRadius(int r){
		if(r>0)
			radius = r;
		else
			radius = 1;
	}
	
	public int getRadius(){
		return radius;
	}
	public double area(){
		return Math.PI * radius * radius;
	}
}

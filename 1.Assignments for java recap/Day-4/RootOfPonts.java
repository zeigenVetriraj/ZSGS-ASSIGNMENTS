

/*

2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"

*/

public class RootOfPonts{
	public static void main(String[] args){
		ThreeD point1 = new ThreeD(); // created default and add values
        point1.setX(1);
        point1.setY(2);
        point1.setZ(3);

        ThreeD point2 = new ThreeD(4, 5, 6); // cunstructed with the Parameter

        System.out.println("Distance between point1 and point2: " + point1.distance(point2));
	}
}

class TwoD{
	int x, y;
	
	public TwoD(){
		x = 0;
		y = 0;
	}
	
	public TwoD(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
}

class ThreeD extends TwoD{
	int z;
	
	public ThreeD(){
		super(); // calling parrent cunstructor
		z = 0;
	}
	public ThreeD(int x, int y, int z){
		super(x,y); // calling parameterized cunstructor
		this.z = z;
	}
	public void setZ(int z){
		this.z = z;
	}
	public int getZ(){
		return z;
	}
	
	public double distance(ThreeD other){
		int dx = other.getX() - this.x;
		int dy = other.getY() - this.y;
		int dz = other.getZ() - this.z;
		
		return Math.sqrt((dx*dx)+(dy*dy)+(dz+dz));
	}
}


/*
4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
*/
public class Problem4{
	public static void main(String[] args){
		Vehicle car1 = new Vehicle("Al123","Audi",123456.23);
		Vehicle car2 = new Vehicle("Z123C","Tata",123456.23);
		Vehicle car3 = new Vehicle("Al123","Benze",123456.23);
		Vehicle car4 = new Vehicle("Al123","Ford",123456.23);
		
		Vehicle.displayVehicle();
	}
}
class Vehicle{
	String vehicleId;
	String brandName;
	double price;
	private static int numberOfvehicles;
	
	public Vehicle(String vehicleId,String brandName, double price){
		this.vehicleId = vehicleId;
		this.brandName = brandName;
		this.price = price;
		numberOfvehicles++;
	}
	public static void displayVehicle(){
		System.out.println("Number of Vehicles : "+numberOfvehicles);
	}
}
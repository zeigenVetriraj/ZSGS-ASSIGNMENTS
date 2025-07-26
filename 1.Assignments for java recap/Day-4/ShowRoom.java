
/*
1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
*/
public class ShowRoom {
    public static void main(String[] args) {
        
        Audi audi = new Audi("A4", 300000, 4, 5, "Petrol", 15, 4500000);
        Ford ford = new Ford("EcoSport", 200000, 3, 5, "Diesel", 18, 950000);
        Bajaj bajaj = new Bajaj("Pulsar", 1, 5, "Air", "Alloys", 13, 50, 95000);
        TVS tvs = new TVS("Apache", 1, 5, "Oil", "Spokes", 12, 55, 85000);

        
        System.out.println("---- Car Details ----");
        audi.display();
        System.out.println();
        ford.display();

        System.out.println("\n---- Bike Details ----");
        bajaj.display();
        System.out.println();
        tvs.display();
    }
}
class Vehicle {
    int mileage;
    double price;

    public Vehicle(int mileage, double price) {
        this.mileage = mileage;
        this.price = price;
    }
}

class Car extends Vehicle {
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;

    public Car(double ownershipCost, int warranty, int seatingCapacity, String fuelType, int mileage, double price) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
}

class Bike extends Vehicle {
    int noOfCylinders;
    int noOfGears;
    String cooling;
    String wheelType;
    int fuelTankSize;

    public Bike(int noOfCylinders, int noOfGears, String cooling, String wheelType, int fuelTankSize, int mileage, double price) {
        super(mileage, price);
        this.noOfCylinders = noOfCylinders;
        this.noOfGears = noOfGears;
        this.cooling = cooling;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
    }
}

class Audi extends Car {
    String modelType;

    public Audi(String modelType, double ownershipCost, int warranty, int seatingCapacity, String fuelType, int mileage, double price) {
        super(ownershipCost, warranty, seatingCapacity, fuelType, mileage, price);
        this.modelType = modelType;
    }

    public void display() {
        System.out.println("Audi Car:");
        System.out.println("Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: ₹" + price);
    }
}

class Ford extends Car {
    String modelType;

    public Ford(String modelType, double ownershipCost, int warranty, int seatingCapacity, String fuelType, int mileage, double price) {
        super(ownershipCost, warranty, seatingCapacity, fuelType, mileage, price);
        this.modelType = modelType;
    }

    public void display() {
        System.out.println("Ford Car:");
        System.out.println("Model: " + modelType);
        System.out.println("Ownership Cost: " + ownershipCost);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: ₹" + price);
    }
}

class Bajaj extends Bike {
    String makeType;

    public Bajaj(String makeType, int noOfCylinders, int noOfGears, String cooling, String wheelType, int fuelTankSize, int mileage, double price) {
        super(noOfCylinders, noOfGears, cooling, wheelType, fuelTankSize, mileage, price);
        this.makeType = makeType;
    }

    public void display() {
        System.out.println("Bajaj Bike:");
        System.out.println("Make: " + makeType);
        System.out.println("Cylinders: " + noOfCylinders);
        System.out.println("Gears: " + noOfGears);
        System.out.println("Cooling: " + cooling);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: ₹" + price);
    }
}

class TVS extends Bike {
    String makeType;

    public TVS(String makeType, int noOfCylinders, int noOfGears, String cooling, String wheelType, int fuelTankSize, int mileage, double price) {
        super(noOfCylinders, noOfGears, cooling, wheelType, fuelTankSize, mileage, price);
        this.makeType = makeType;
    }

    public void display() {
        System.out.println("TVS Bike:");
        System.out.println("Make: " + makeType);
        System.out.println("Cylinders: " + noOfCylinders);
        System.out.println("Gears: " + noOfGears);
        System.out.println("Cooling: " + cooling);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Price: ₹" + price);
    }
}

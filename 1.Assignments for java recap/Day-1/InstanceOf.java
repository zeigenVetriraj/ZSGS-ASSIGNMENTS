

//10. Write a program to check whether the object is an instance of a particular class?

public class InstanceOf{
    public static void main(String[] args){
        Animal animal = new Dog();
        
        // Using instanceof keyword to check the relationship
        if (animal instanceof Dog) {
            System.out.println("The object 'animal' is an instance of Dog class.");
        } else {
            System.out.println("The object 'animal' is NOT an instance of Dog class.");
        }
    }
}

class Animal {
    // statements
}
class Dog extends Animal {
    // statements
}
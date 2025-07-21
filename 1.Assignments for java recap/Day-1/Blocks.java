
//5. Write a program that illustrate the execution order of static block and initializer block?
public class Blocks {
    static{ // called 1st when we run the program
        System.out.println("From 1st Static block");
    }
    { //called whenaver we create the object
        System.out.println("From Initializer block");
    }
    public static void main(String[] args) {
        System.out.println("Main block");
        Blocks block = new Blocks(); // Triggers initializer block 
    }
    static{ // called 2nd when we run the program
        System.out.println("From 2nd Static block");
    }
}

/*
Output: 
From 1st Static block
From 2nd Static block
Main block
From Initializer block
*/
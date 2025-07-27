
/*
2. Can we override private method, constructor, static method, final method? Illustrate with an example.
 */
public class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("----- Creating Child object -----");
        Child c = new Child();

        System.out.println("\n----- Method Calls -----");
        c.display();
        c.staticDisplay();
        c.callPrivate();

        System.out.println("\n----- Parent reference to Child object -----");
        Parent p = new Child();
        p.display();
        p.staticDisplay();
    }
}

class Parent {
    public Parent() {
        System.out.println("In Parent Constructor"); // Not overridden
    }

    public void display() {
        System.out.println("In Parent's display() method");
    }

    public static void staticDisplay() {
        System.out.println("In Parent's static method");
    }

    public final void finalMethod() {
        System.out.println("In Parent's final method");
    }

    private void privateDisplay() {
        System.out.println("In Parent's private method");
    }
}

class Child extends Parent {
    public Child() {
        super(); // Calls Parent constructor
        System.out.println("In Child Constructor");
    }

    @Override
    public void display() {
        System.out.println("In Child's overridden display() method");
    }

    // This hides the static method from Parent — NOT overriding
    public static void staticDisplay() {
        System.out.println("In Child's static method");
    }

    // This is a new method, not an override
    private void privateDisplay() {
        System.out.println("In Child's private method");
    }

    public void callPrivate() {
        privateDisplay(); // Only accesses Child's private method
    }

    // comment below will cause compile-time error: Cannot override final method
    /*
    @Override
    public void finalMethod() {
        System.out.println("Trying to override final method");
    }
    */
}

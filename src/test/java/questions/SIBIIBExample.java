package questions;

public class SIBIIBExample {
    // Static variable
    static int staticVar;

    // Static Initialization Block (SIB)
    static {
        staticVar = 42;
        System.out.println("Static block: " + staticVar);
    }

    int instanceVar;

    // Instance Initialization Block (IIB)
    {
        instanceVar = 10;
        System.out.println("Instance block: " + instanceVar);
    }

    public SIBIIBExample() {
        System.out.println("Constructor invoked");
    }

    public static void main(String[] args) {
        // Accessing the static variable
        System.out.println("Main method: " + staticVar);

        SIBIIBExample obj = new SIBIIBExample();
        System.out.println("Main method: " + obj.instanceVar);
    }
}


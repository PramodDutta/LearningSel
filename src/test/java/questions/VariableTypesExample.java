package questions;

public class VariableTypesExample {
    // Instance variable
    String instanceVar = "I am an instance variable";

    // Class variable (static variable)
    static int staticVar = 10;

    public void exampleMethod() {
        // Local variable
        int localVar = 5;

        System.out.println("This is the instance variable: " + instanceVar);
        System.out.println("This is the local variable: " + localVar);
        System.out.println("This is the static variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableTypesExample example = new VariableTypesExample();
        example.exampleMethod();
    }
}


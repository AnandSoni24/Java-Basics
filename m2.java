// Parent class
class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

// Child class inheriting from Calculator
class Adder extends Calculator {
    // Additional methods or overrides can be added here
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the child class
        Adder adder = new Adder();

        // Calling the add method from the parent class
        int result = adder.add(5, 7);

        // Displaying the result
        System.out.println("Sum: " + result);
    }
}

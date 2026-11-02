public class Calculator {

    //adding duplicate block
    public int add_duplicate(int a, int b) {
        return a + b;
    }

    public int subtract_duplicate(int a, int b) {
        return a - b;
    }
    //till here

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    //duplicate
    public int multiply_duplicate(int a, int b) {
        return a * b;
    }

    public int divide_duplicate(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public int calculateFirst(int a, int b) {
    int result = a + b;
    result = result * 2;
    result = result + 10;
    result = result - 5;
    result = result * 3;
    result = result + 20;
    result = result / 2;
    result = result + 15;
    result = result * 2;
    result = result - 10;
    result = result + 5;
    return result;
}

public int calculateSecond(int a, int b) {
    int result = a + b;
    result = result * 2;
    result = result + 10;
    result = result - 5;
    result = result * 3;
    result = result + 20;
    result = result / 2;
    result = result + 15;
    result = result * 2;
    result = result - 10;
    result = result + 5;
    return result;
}

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));

    }
}

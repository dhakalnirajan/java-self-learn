// WAP to perform Calculation Using OOP method

public class Calculator {

    public static void main(String[] args) {
        System.out.println("This is a calculation program.\n");
        int num1 = 10;
        int num2 = 20;

        Calculator cal = new Calculator();
        cal.sum(num1, num2);
        cal.diff(num1, num2);
        cal.mul(num1, num2);
        cal.div(num1, num2);
        cal.mod(num1, num2);
    }

    public void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The Sum is: \n" + sum);
    }

    public void diff(int num1, int num2) {
        int diff = num2 - num1;
        System.out.println("The Difference is:  \n" + diff);
    }

    public void mul(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("The Multiplication is: \n" + mul);
    }

    public void div(int num1, int num2) {
        int div = num2 / num1;
        System.out.println("The division is: " + div);
    }

    public void mod(int num1, int num2) {
        int mod = num2 % num1;
        System.out.println("The Modulus is: " + mod);
        // A Cool way to write System.out.println() method is: type, "sout" and press Enter key and it will automatically complete the method name.
    }
}

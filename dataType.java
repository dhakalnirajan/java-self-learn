
public class dataType {

    public static void main(String[] args) {
        byte num = 100;
        // byte num1 = 128;   // This line will give error because the value range of byte datatype is -127 to 127.
        short num2 = 5674;    // The value range of short datatype is -32768 to 32767.
        int num3 = 123456789; // The value range of int datatype is -2147483648 to 214748364
        long num4 = 1234L; // The value range of long datatype is -9223372036854775808 to 9223372036854775807.
        float num5 = 123.456F; // The value range of float datatype is 1.4E-45 to 3.4028235E38.
        double num6 = 123.45678; // The value range of double datatype is 4.9E-324 to 1.7976931348623157E308.
        char ch = 'A'; // The value range of char datatype is 0 to 65536 or 0 to 0xffff.Here, you can enter any character in single quotes from any langugage like English, Nepali, etc..
        boolean bol = true; // The values are two logical values: True or False.

        // Outputs of the program
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(ch);
        System.out.println(bol);
    }
}

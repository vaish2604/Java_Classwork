package JavaBasics;

public class Exception1 {

    public static void main(String[] args) {
  
        try {
            // Declare and initialize the array
            int a[] = new int[5];

            // Attempt to perform an arithmetic operation that causes an exception
            int c = 23 / 0; // This will throw an ArithmeticException

            // This line won't be executed because the above line throws an exception
            a[5] = 50 / 5; // This would throw an ArrayIndexOutOfBoundsException if executed
            System.out.println(a[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: " + e);
            System.out.println("You cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
            System.out.println("Array index is out of bounds.");
        }
    }
}

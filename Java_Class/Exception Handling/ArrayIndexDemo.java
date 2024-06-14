package JavaBasics;

public class ArrayIndexDemo {

    public static void main(String[] args) {
        try {
            // Declare and initialize the array
            int a[] = new int[5];
            
            // Assign values within the array bounds
            a[3] = 7;
            a[4] = 56;
            
            // Print the values at the valid indices
            System.out.println("Value at index 3: " + a[3]);
            System.out.println("Value at index 4: " + a[4]);
            
            // Attempt to access an invalid index
            a[8] = 67;
            System.out.println("Value at index 8: " + a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the specific exception and print a meaningful message
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}

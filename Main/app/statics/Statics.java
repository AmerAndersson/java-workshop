package statics;

public class Statics {
    /*
     * -----------------------------------
     * static method, which means that it can be
     * accessed without creating an object of the
     * class User info with multiple parameters
     * -----------------------------------
     */
    public static void multipleParameters(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // One parameters and return Value
    public static int oneOarameters(int x) {
        return x + 5;

    }

    // Two parameters and return values
    public static int twoParameters(int x, int y) {
        return x * y;

    }

    // Static method
    public static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Create a checkAge() method with Ini
    public static void checkAge(int age) {
        // If age is less than 18: access denied
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
            // If age is greater than, or equal to, 18: access granted
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // Two methods that add numbers of different type
    public static int plusMethodInt(int x, int y) {
        return x + y;
    }

    public static double plusMethodDouble(double x, double y) {
        return x + y;

    }

    // overload the plusMethod method to work for both int and double:
    public static int plusMethod(int x, int y) {
        return x + y;
    }

    public static double plusMethod(double x, double y) {
        return x + y;
    }

    // Use recursion to add all of the numbers up to 10
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }

    /*
     * 
     * Use recursion to add all of the numbers between 5 to 10
     * The halting condition for this
     * recursive function is when end is not greater than start:
     * ---------------------------------------------------------
     */
    public static int sums(int start, int end) {
        if (end > start) {
            return end + sums(start, end - 1);
        } else {
            return end;
        }
    }

}

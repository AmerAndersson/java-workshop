package maths;
/*
* The Java Math class has many methods that allows you to perform mathematical
* tasks on numbers. Math.max(x,y) Math.min(x,y),
* Math.sqrt(),Math.abs(x),Math.random()
* The Math.abs(x) method returns the absolute (positive) value of x:
* Math.random() returns a random number between 0.0 (inclusive), and 1.0
* (exclusive):
*/
public class MathClass {
   public static void myMath() {

        System.out.println("MAX-Value: " + Math.max(5, 10));
        System.out.println("MiN-Value: " + Math.min(5, 10));
        System.out.println("Square-Root: " + Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());
        // if you only want a random number between 0 and 100
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
        System.out.println("------------------------------");
    }
}

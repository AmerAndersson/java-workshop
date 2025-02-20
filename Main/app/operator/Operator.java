package operator;
public class Operator {
    public static void myOperator() {
        // Operators
        int sum1 = 100 + 50; // 150 (100 + 50)
        int sum2 = sum1 + 250; // 400 (150 + 250)
        int sum3 = sum2 + sum2; // 800 (400 + 400)
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2 + Sum1: " + sum2);
        System.out.println("Sum3 = Sum2 + Sum2: " + sum3);
        System.out.println("------------------------------");

        int c = 1;
        System.out.println(++c);
        System.out.println(c);
        System.out.println(++c);
        System.out.println("------------------------------");

        int d = 3;
        System.out.println(--d);
        System.out.println(d);
        System.out.println(--d);
        System.out.println("------------------------------");

        // addition assignmen operator (+=) adds a value to a variable:
        int m = 10;
        m += 5;
        System.out.println(m);
        System.out.println("------------------------------");

        /*
         * Comparison operators are used to compare
         * two values (or variables). This is important in programming,
         * because it helps us to find answers and make decisions.
         * greater than operator (>) to find out if 5 is greater than 3:
         */

        // returns true, because 5 is higher than 3
        int xs = 5;
        int ys = 3;
        System.out.println(xs > ys);
        System.out.println("------------------------------");
    }
}

package condition;

/*
* Conditions and If Statements
* Less than: a < b
* Less than or equal to: a <= b
* Greater than: a > b
* Greater than or equal to: a >= b
* Equal to a == b
* Not Equal to: a != b
* Use if to specify a block of code to be executed, if a specified condition is
* true
* Use else to specify a block of code to be executed, if the same condition is
* false
* Use else if to specify a new condition to test, if the first condition is
* false
* Use switch to specify many alternative blocks of code to be executed
*/
public class Condition {
    public static void myCondition() {

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        System.out.println("------------------------------");

        int f = 20;
        int e = 18;
        if (f > e) {
            System.out.println("f is greater than e");
        }
        System.out.println("------------------------------");

        // The else Statement
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        System.out.println("------------------------------");

        // The else if Statement
        // Use the else if statement to specify a new condition if the first condition
        // is false.

        int times = 22;
        if (times < 12) {
            System.out.println("Good morning.");
        } else if (times < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        System.out.println("------------------------------");

        // Short Hand If...Else
        // variable = (condition) ? expressionTrue : expressionFalse;
        int myTime = 20;
        String myResult = (myTime < 18) ? "Good day." : "Good evening.";
        System.out.println(myResult);

        System.out.println("------------------------------");
        // Switch Statements
        // Instead of writing many if..else statements,
        // you can use the switch statement.

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        System.out.println("------------------------------");

        // While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("------------------------------");

        /*
         * The do/while loop is a variant of the while loop.
         * This loop will execute the code block once, before
         * checking if the condition is true, then it will repeat
         * the loop as long as the condition is true.
         */

        int n = 0;
        do {
            System.out.println(n);
            n++;
        } while (n < 5);

        System.out.println("------------------------------");

        // For Loop When you know exactly
        // how many times you want to loop
        // through a block of code, use the for
        // loop instead of a while loop:
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        System.out.println("------------------------------");

        // This example will only print even values between 0 and 10:
        for (int even = 0; even <= 10; even = even + 2) {
            System.out.println(even);
        }
        System.out.println("------------------------------");

        /*
         * It is also possible to place a loop inside another loop.
         * This is called a nested loop. The "inner loop" will be
         * executed one time for each iteration of the "outer loop":
         */

        // Outer loop.
        for (int v = 1; v <= 2; v++) {
            System.out.println("Outer: " + v); // Executes 2 times

            // Inner loop
            for (int k = 1; k <= 3; k++) {
                System.out.println(" Inner: " + k); // Executes 6 times (2 * 3)
            }
        }
        System.out.println("------------------------------");

        /*
         * The continue statement breaks
         * one iteration (in the loop),
         * if a specified condition occurs, and continues
         * with the next iteration in the loop
         * This example skips the value of 4:
         */

        for (int c = 0; c < 10; c++) {
            if (c == 4) {
                continue;
            }
            System.out.println(c);
        }
        System.out.println("------------------------------");

        // Break and Continue in While Loop
        int o = 0;
        while (o < 10) {
            System.out.println(o);
            o++;
            if (o == 4) {
                break;
            }
        }
        System.out.println("------------------------------");

        // Continue Example
        int ms = 0;
        while (ms < 10) {
            if (ms == 4) {
                ms++;
                continue;
            }
            System.out.println(ms);
            ms++;
        }
        System.out.println("------------------------------");

        /*
         * Break and Continue
         * The break statement can
         * also be used to jump out of a loop
         * This example stops the loop when s is equal to 4
         */
        for (int s = 0; s < 10; s++) {
            if (s == 4) {
                break;
            }
            System.out.println(s);
        }

        System.out.println("------------------------------");

    }

}

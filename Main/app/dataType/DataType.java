package dataType;

/*
* A method is a block of code which only runs when it is called.
* You can pass data, known as parameters, into a method.
* Methods are used to perform certain actions, and they are also known as functions.
* Why use methods? To reuse code: define the code once, and use it many times
*/

public class DataType {

    public static void myDataType() {
        // Data types
        int x = 2, y = 3, z = 10;
        int result = x + y + z;
        System.out.println("The result: " + result);

        // Good
        int minutesPerHour = 60;
        System.out.println(minutesPerHour);

        // Unchangeable and read-only
        final int myConstan = 100;
        System.out.println(myConstan);
        System.out.println("------------------------------");

        // If you add two strings, the result will be a string concatenation
        String x1 = "10";
        String y2 = "20";
        String z3 = x1 + y2;
        System.out.println(z3);
        System.out.println("------------------------------");

        // The sequence \" inserts a double quote in a string:
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        // The sequence \' inserts a single quote in a string:
        String txts = "It\'s alright.";
        System.out.println(txts);
        System.out.println("------------------------------");

        // The sequence \\ inserts a single backslash in a string:
        String txtS = "The character \\ is called backslash.";
        System.out.println(txtS);
        System.out.println("------------------------------");

        // Data types
        byte mybyes = 127;
        short myShor = 5000;
        int myInts = 100000;
        long myLong = 15000000000L;
        float myFloats = 5.75f;
        double myDoubles = 19.99d;
        boolean myBoolean = true;

        System.out.println(mybyes);
        System.out.println(myShor);
        System.out.println(myInts);
        System.out.println(myLong);
        System.out.println(myFloats);
        System.out.println(myDoubles);
        System.out.println(myBoolean);
        System.out.println("------------------------------");

        // A floating point number can also be a scientific number
        // with an "e" to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("F1: " + f1);
        System.out.println("D1: " + d1);
        System.out.println("------------------------------");

        /*
         * Boolean Types
         * YES / NO
         * ON / OFF
         * TRUE / FALSE
         * Boolean values are mostly used for conditional testing
         */
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println("------------------------------");

        // Boolean Expression
        // returns true, because 10 is higher than 9
        int a = 10;
        int b = 9;
        boolean expression = a > b;
        System.out.println("Expression: " + expression);

        // equal to (==)
        // returns true, because the value of x is equal to 10
        int g = 10;
        boolean myReult = g == 10;
        System.out.println("Reult: " + myReult);

        // Real Life Example
        // we need to find out if a person is old enough to vote
        System.out.println("------------------------------");
        int myAge = 25;
        int votingAge = 18;
        boolean vote = myAge >= votingAge;
        System.out.println("Voting: " + vote);

        // Output "Old enough to vote!" if myAge is greater than or equal to 18.
        // Otherwise output "Not old enough to vote.":
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
        System.out.println("------------------------------");

    }
}

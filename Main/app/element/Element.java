package element;
/*
* Arrays are used to store multiple values
* in a single variable, instead of declaring
* separate variables for each value.
* String[] cars;
*/

public class Element {

    public static void myArray() {

        String[] myCars = { "Volvo", "BMW", "Ford", "Mazda" };
        // Change an Array Element
        myCars[0] = "Opel";
        System.out.println(myCars[0]);
        System.out.println(myCars.length); // length property:
        System.out.println("------------------------------");

        // To create an array of integers, you could write
        int[] myArray = { 10, 20, 30, 40 };

        // Change an Array Element
        myArray[0] = 5;
        System.out.println(myArray[0]);
        System.out.println(myArray.length); // length property:

        System.out.println("------------------------------");

        /*
         * There is also a "for-each" loop,
         * which is used exclusively to loop through
         * elements in an array
         */

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String c : cars) {
            System.out.println(c);
        }

        System.out.println("------------------------------");

        // You can loop through the array elements with the for loop,
        // and use the length property to specify how many times the loop should run.
        for (int q = 0; q < cars.length; q++) {
            System.out.println(cars[q]);
        }

        System.out.println("------------------------------");

        /*
         * Multi-Dimensional Arrays
         * A multidimensional array is an array of arrays.
         * Multidimensional arrays are useful when you want to store data as a tabular
         * form, like a table with rows and columns.
         * int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
         * myNumbers is now an array with two arrays as its elements.
         */

        // Access Elements
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println("Outputs 7: " + myNumbers[1][2]); // Outputs 7
        System.out.println("------------------------------");

        // Change Element Values
        myNumbers[1][2] = 9;
        System.out.println("Outputs 9: " + myNumbers[1][2]); // Outputs 9 instead of 7
        System.out.println("------------------------------");

        /*
         * Loop Through a Multi-Dimensional Array
         * We can also use a for loop inside another
         * for loop to get the elements of a two-dimensional
         * array (we still have to point to the two indexes):
         * 
         */
        int[][] myNumber = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int is = 0; is < myNumber.length; ++is) {
            for (int js = 0; js < myNumber[is].length; ++js) {
                System.out.println("Multi-Dimensional: " + myNumber[is][js]);
            }
        }
        System.out.println("------------------------------");

    }
}

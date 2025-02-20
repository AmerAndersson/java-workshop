package casting;

/*
* Type casting is when you assign
* a value of one primitive data
* type to another type
* automatically when passing a
* smaller size type to a larger size type
* 
*/
public class Casting {
    public static void myCasting() {
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Outpout 9
        System.out.println(myDouble); // Output 9.0
        System.out.println("------------------------------");

        // Narrowing casting must be done manually
        // by placing the type in parentheses in front of the value

        double narrowingDouble = 9.78d;
        int narrowingInt = (int) narrowingDouble; // Manual casting: double to int
        System.out.println(narrowingDouble); // Outpout 9.78
        System.out.println(narrowingInt); // Outpout 9
        System.out.println("------------------------------");

    }

}

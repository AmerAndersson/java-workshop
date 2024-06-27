package classes;

// Access Modifiers - controls the access level

// public: The code is accessible for all classes	
// private:	The code is only accessible within the declared class	
// default:	The code is only accessible in the same package. 
// This is used when you don't specify a modifier. 
// You will learn more about packages in the Packages chapter	
// protected:The code is accessible in the same package and subclasses.

/*
 * Access Modifiers For attributes,
 * methods and constructors
 */
public class AccessModifier {

    public String fname = "John";
    public String lname = "Doe";
    public String email = "john@doe.com";
    public int age = 24;

}
/*
 * public class InnerAccessModifier {
 * private String fname = "John";
 * private String lname = "Doe";
 * private String email = "john@doe.com";
 * private int age = 24;
 * 
 * }
 * 
 * class Person {
 * protected String fname = "John";
 * protected String lname = "Doe";
 * protected String email = "john@doe.com";
 * protected int age = 24;
 * }
 * 
 * class Student extends Person {
 * private int graduationYear = 2018;
 * 
 * Student myObj = new Student();
 * System.out.println("Name: " + myObj.fname + " " + myObj.lname);
 * System.out.println("Email: " + myObj.email);
 * System.out.println("Age: " + myObj.age);
 * System.out.println("Graduation Year: " + myObj.graduationYear);
 * 
 * }
 */

// Non-Access Modifiers - do not control access level,
// but provides other functionality
// For classes, you can use either final or abstract:
// final: The class cannot be inherited by other classes
// abstract: The class cannot be used to create objects (To access an abstract
// class, it must be inherited from another class

// For attributes and methods
// final: Attributes and methods cannot be overridden/modified
// static: Attributes and methods belongs to the class, rather than an object
// abstract: Can only be used in an abstract class, and can only be used on
// methods. The method does not have a body, for example abstract void run();.
// The body is provided by the subclass (inherited from).
// transient: Attributes and methods are skipped when serializing the object
// containing them
// synchronized: Methods can only be accessed by one thread at a time
// volatile: The value of an attribute is not cached thread-locally, and is
// always read from the "main memory"

/*
 * For classes
 * final class Vehicle {
 * protected String brand = "Ford";
 * public void honk() {
 * System.out.println("Tuut, tuut!");
 * }
 * }
 * 
 * class Main extends Vehicle {
 * private String modelName = "Mustang";
 * public static void main(String[] args) {
 * Main myFastCar = new Main();
 * myFastCar.honk();
 * System.out.println(myFastCar.brand + " " + myFastCar.modelName);
 * }
 * }
 * 
 * 
 * abstract class
 * abstract class Main {
 * public String fname = "John";
 * public String lname = "Doe";
 * public String email = "john@doe.com";
 * public int age = 24;
 * public abstract void study(); // abstract method
 * }
 * 
 * Subclass (inherit from Person)
 * class Student extends Main {
 * public int graduationYear = 2018;
 * public void study() {
 * System.out.println("Studying all day long");
 * }
 * }
 * 
 * 
 * declare attributes as final
 * public class Main {
 * final int x = 10;
 * final double PI = 3.14;
 * 
 * public static void main(String[] args) {
 * Main myObj = new Main();
 * myObj.x = 50; // will generate an error
 * myObj.PI = 25; // will generate an error
 * System.out.println(myObj.x);
 * }
 * }
 * 
 * 
 * A static method means that it can be accessed without creating an object of
 * the class. Differences between static and public methods
 * 
 * public class Main {
 * Static method
 * static void myStaticMethod() {
 * System.out.println("Static methods can be called without creating objects");
 * }
 * 
 * Public method
 * public void myPublicMethod() {
 * System.out.println("Public methods must be called by creating objects");
 * }
 * 
 * Main method
 * public static void main(String[ ] args) {
 * myStaticMethod(); // Call the static method
 * 
 * Main myObj = new Main(); // Create an object of Main
 * myObj.myPublicMethod(); // Call the public method
 * }
 * }
 * 
 * 
 * // Code from filename: Main.java
 * abstract class
 * abstract class Main {
 * public String fname = "John";
 * public int age = 24;
 * public abstract void study(); // abstract method
 * }
 * 
 * Subclass (inherit from Main)
 * class Student extends Main {
 * public int graduationYear = 2018;
 * public void study() { // the body of the abstract method is provided here
 * System.out.println("Studying all day long");
 * }
 * }
 * End code from filename: Main.java
 * 
 * Code from filename: Second.java
 * class Second {
 * public static void main(String[] args) {
 * create an object of the Student class (which inherits attributes and methods
 * from Main)
 * Student myObj = new Student();
 * 
 * System.out.println("Name: " + myObj.fname);
 * System.out.println("Age: " + myObj.age);
 * System.out.println("Graduation Year: " + myObj.graduationYear);
 * myObj.study(); // call abstract method
 * }
 * }
 */
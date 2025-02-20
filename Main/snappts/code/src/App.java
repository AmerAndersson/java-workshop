
/**
 * 
 * Learning JAVA
 * @Author Amer Andersson 
 * From Sweden
 * 
 */

// Built-in Packages (packages from the Java API)
// User-defined Packages (create your own packages)
// Import the whole package
// Import a single class

import java.time.LocalDate;
import java.util.*;
import algoritm.BinaryTree;
import algoritm.Node;
import character.*;
import casting.*;
import condition.*;
import dataType.*;
import nestClasses.Outer;
import operator.*;
import element.*;
import classes.*;
import encapsulation.Person;
import inheritance.*;
import maths.*;
import basic.Student;
import binaryTree.BinarySearchTree;
import statics.Statics;
import strings.*;
import polymorphism.*;

class App {
    /**
     * @param args
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Element.myArray();
        Casting.myCasting();
        Characters.myCharacter();
        Condition.myCondition();
        DataType.myDataType();
        MathClass.myMath();
        Operator.myOperator();
        Sequence.myStringSequence();

        Statics.multipleParameters("Amer ", 44);
        Statics.multipleParameters("Anna ", 34);
        Statics.multipleParameters("Sunna ", 25);
        System.out.println("--------------------------");

        // static method, which means that it can be
        // accessed without creating an object of the class
        int sum = Statics.oneOarameters(30);
        System.out.println(sum);
        System.out.println("--------------------------");

        // static method, which means that it can be
        // accessed without creating an object of the class
        int product = Statics.twoParameters(10, 45);
        System.out.println(product);
        System.out.println("--------------------------");

        // two methods that add numbers of different type
        // static method, which means that it can be
        // accessed without creating an object of the class
        int myInt = Statics.plusMethodInt(10, 20);
        System.out.println("Int: " + myInt);
        double myDouble = Statics.plusMethodDouble(5.3, 10.5);
        System.out.println("Double: " + myDouble);
        System.out.println("--------------------------");

        // overload the plusMethod method to work for both int and double:
        // With method overloading, multiple methods
        // can have the same name with different parameters:
        int overloadInt = Statics.plusMethod(8, 5);
        double overloaddouble = Statics.plusMethod(4.3, 6.26);
        System.out.println("overloadInt: " + overloadInt);
        System.out.println("overloadDouble: " + overloaddouble);
        System.out.println("--------------------------");

        /*
         * Use recursion to add all of the numbers up to 10.
         * 10 + sum(9) 10 + ( 9 + sum(8) )
         * 10 + (9 + ( 8 + sum(7) ) )
         * ... 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
         * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
         * ------------------------------------------------
         */

        // static method, which means that it can be
        // accessed without creating an object of the class
        int result = Statics.sum(10);
        System.out.println(result);
        System.out.println("--------------------------");

        // Use recursion to add all of the numbers between 5 to 10.
        int results = Statics.sums(5, 10);
        System.out.println(results);

        // Create an object of class
        Main myObj = new Main();
        myObj.setX(10);
        myObj.setY(20);

        System.out.println("X * Y: " + (myObj.getX()) * (myObj.getY()));
        System.out.println("--------------------------");

        // Get user info
        Second user = new Second();
        user.setFname("Amer");
        user.setLname("Andersson");
        user.setAge(44);

        System.out.println("FullName: " + (user.getFname()) + " " + (user.getLname()));
        System.out.println("Age: " + user.getAge());
        System.out.println("--------------------------");

        // Differences between static and public methods
        Accessed myOb = new Accessed(); // Create an object of Main
        myOb.myPublicMethod(); // Call the public method on the objec

        Statics.myStaticMethod(); // Call the static method
        // static method checkAge and pass along an age of 20
        Statics.checkAge(20);
        System.out.println("--------------------------");

        // Create a myCar object
        Accessed myCar = new Accessed();
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.speed(200); // Call the speed() method
        System.out.println("--------------------------");

        // Create an object of class Constructor (This will call the constructor)
        Constructor cons = new Constructor(30);
        System.out.println("Constructor: " + cons.x);
        System.out.println("--------------------------");

        // Create an object of class InnerConstructor (This will call the constructor)
        InnerConstructor inner = new InnerConstructor(1969, "Mustang");
        System.out.println(inner.modelYear + " " + inner.modelName);
        System.out.println("--------------------------");

        // Get person name
        Person userName = new Person();
        userName.setName("John");
        System.out.println(userName.getName());
        System.out.println("--------------------------");

        // create an object of the Student class (which inherits attributes and methods
        // from Main)
        Student s = new Student();
        System.out.println("Name: " + s.firstName + " " + s.lastName);
        System.out.println("Email: " + s.email);
        System.out.println("Age: " + s.age);
        System.out.println("Graduation Year: " + s.graduationYear);
        s.study(); // call abstract method
        System.out.println("--------------------------");

        // Local date
        Date date = new Date();
        LocalDate localdate = LocalDate.now();
        System.out.println("Local: " + date);
        System.out.println("Year: " + localdate.getYear());
        System.out.println("--------------------------");

        // Create an object of Shoe

        Walking n = new Walking("Nike", 10, true);
        System.out.println("Brand: " + n.brand);
        System.out.println("Size: " + n.size);
        System.out.println("GoreTex: " + n.goreTex);
        System.out.println("--------------------------");

        Walking a = new Walking("Adidas", 12, false);
        System.out.println("Brand: " + a.brand);
        System.out.println("Size: " + a.size);
        System.out.println("GoreTex: " + a.goreTex);
        System.out.println("--------------------------");

        Running g = new Running("Geox", 11, 7.5);
        System.out.println("Brand: " + g.brand);
        System.out.println("Size: " + g.size);
        System.out.println("Weight: " + g.weight);
        System.out.println("--------------------------");

        // Create a myCar object
        Car c = new Car("Ford", "Mustang");
        System.out.println("Brand: " + c.brand);
        System.out.println("Model: " + c.modelName);
        System.out.println("--------------------------");

        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        System.out.println("--------------------------");

        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        System.out.println("Y+X: " + (myInner.y + myOuter.x));
        System.out.println("--------------------------");

        // Driver Code
        BinarySearchTree tree = new BinarySearchTree();

        // Inserting nodes
        tree.root = tree.insert(tree.root, 8);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 14);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 1);
        tree.insert(tree.root, 13);
        tree.insert(tree.root, 7);
        tree.insert(tree.root, 4);

        // Key to be found
        int key = 6;

        // Searching in a BST
        if (tree.search(tree.root, key) == null) {
            System.out.println(key + " not found");
        } else {
            System.out.println(key + " found");
        }

        key = 14;
        // Searching in a BST
        if (tree.search(tree.root, key) == null) {
            System.out.println(key + " not found");
        } else {
            System.out.println(key + " found");
        }

        System.out.println("--------------------------");

        // Driver program to test above functions

        BinaryTree trees = new BinaryTree();
        Node root = null, temp = null, suc = null, min = null;
        root = trees.insert(root, 20);
        root = trees.insert(root, 9);
        root = trees.insert(root, 25);
        root = trees.insert(root, 5);
        root = trees.insert(root, 12);
        root = trees.insert(root, 11);
        root = trees.insert(root, 14);
        temp = root.left.right.right;
        suc = trees.inOrderSuccessor(root, temp);
        if (suc != null) {
            System.out.println(
                    "Inorder successor of "
                            + temp.data + " is " + suc.data);
        } else {
            System.out.println(
                    "Inorder successor does not exist");
        }

        System.out.println("--------------------------");
        /*
         * // get user input
         * try (Scanner myScanner = new Scanner(System.in)) {
         * System.out.println("Enter username:");
         * 
         * String userNames = myScanner.nextLine();
         * System.out.println("Username is: " + userNames);
         * }
         * 
         * 
         * root = trees.insert(root, 20);
         * root = trees.insert(root, 8);
         * root = trees.insert(root, 22);
         * root = trees.insert(root, 4);
         * root = trees.insert(root, 12);
         * root = trees.insert(root, 10);
         * root = trees.insert(root, 14);
         */

    }
    // inordersuccessor
}

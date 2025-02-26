package encapsulation;

/*
* The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
* declare class variables/attributes as private
* provide public ``get and set`` methods to access and update the value of a private variabl
* it is possible to access them if we provide public get and set methods.
* Better control of class attributes and methods
* Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
* Flexible: the programmer can change one part of the code without affecting other parts
* Increased security of data
*/

public class Person {
    // private = restricted access
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName; // update the value of a private variable
    }

}

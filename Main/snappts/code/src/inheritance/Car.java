package inheritance;

public class Car extends Vehicle {
    public final String modelName;

    public Car(String brand, String modelName) {
        super(brand);
        this.modelName = modelName;
    }

}

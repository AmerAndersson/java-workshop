package inheritance;

public class Running extends Shoe{
    public final double weight;

    public Running(String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }
    
}

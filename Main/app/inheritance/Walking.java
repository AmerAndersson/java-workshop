package inheritance;

public class Walking extends Shoe {
    public final boolean goreTex;

    public Walking(String brand, double size, boolean goreTex) {
        super(brand, size);
        this.goreTex = goreTex;
    }

}

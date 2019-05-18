public class Ingredient {

    private final int WHEEL = 10000;
    private int wheel;

    private final int CHASIS = 50000;
    private int chasis;

    private final int ENGIN = 35000;
    private int engin;

    public Ingredient() {
        this.wheel = WHEEL;
        this.chasis = CHASIS;
        this.engin = ENGIN;
    }

    public int getWheel() {
        return wheel;
    }

    public int getChasis() {
        return chasis;
    }

    public int getEngin() {
        return engin;
    }


}

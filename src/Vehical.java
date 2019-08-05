/**
 * Created by Adesh on 12-06-2019
 */

public class Vehical {
   private int wheels;
    private int size;
    private String type;

    Vehical(int wheels, int size, String type) {
        this.wheels = wheels;
        this.size = size;
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}

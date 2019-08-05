/**
 * Created by Adesh on 12-06-2019
 */

public class Car extends Vehical {
private String gear;
private int speed;
    public Car(int wheels, int size, String type, String gear,int speed) {
        super(wheels, size, type);
        this.gear=gear;
        this.speed=speed;

    }
}

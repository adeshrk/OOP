/**
 * Created by Adesh on 13-06-2019
 */

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height<0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}

/**
 * Created by Adesh on 13-06-2019
 */

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius<0){
            this.radius = 0;
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 3.14159*radius*radius;
    }
}

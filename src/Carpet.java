/**
 * Created by Adesh on 12-06-2019
 */

public class Carpet {

    private double cost;

    public Carpet(double cost) {
        if(cost<0){
            this.cost = 0;
        }else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}

/**
 * Created by Adesh on 12-06-2019
 */

public class Point {
    private int x,y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
       return Math.sqrt(((0-this.x)*(0-this.x))+((0-this.y)*(0-this.y)));
    }

    public double distance(int x,int y){
        return  Math.sqrt(((x-this.x)*(x-this.x))+((y-this.y)*(y-this.y)));
    }

    public double distance(Point p){
       return Math.sqrt(((x-p.x)*(x-p.x))+((y-p.y)*(y-p.y)));
    }


}

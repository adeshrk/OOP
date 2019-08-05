/**
 * Created by Adesh on 12-06-2019
 */

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real,double imaginery){
        this.real+=real;
        this.imaginary+=imaginery;
    }
    public void add(ComplexNumber p){
        this.imaginary+=p.imaginary;
        this.real+= p.real;
    }
    public void subtract(double real,double imaginery){
        this.real-=real;
        this.imaginary-=imaginery;
    }
    public void subtract(ComplexNumber p) {
        this.imaginary -=p.imaginary  ;
        this.real -= p.real;
    }
}

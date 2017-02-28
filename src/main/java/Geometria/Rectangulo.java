package Geometria;

/**
 * Created by Dani on 23/02/2017.
 */
public class Rectangulo implements Figura{
    double area,b,h;

    public Rectangulo(double b, double h){
        this.b=b;
        this.h=h;
    }
    public double area(){
        area=b*h;
        return area;
    }
}

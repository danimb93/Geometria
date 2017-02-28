package Geometria;

/**
 * Created by Dani on 23/02/2017.
 */
public class Triangulo implements Figura {
double area, b, h;

public Triangulo(double b, double h){
    this.b=b;
    this.h=h;
}
    public double area (){

        this.area=b*h/2;
        return area;
    }
}

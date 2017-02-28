package Geometria;

public class App 
{
    public static void main( String[] args )
    {
    Controlador miControlador= new Controlador();

    Figura f1 =new Triangulo(6,9);
    double area = f1.area();
    System.out.println("El area es: "+area);
    Figura f2 = new Rectangulo(2,3);
    double arear= f2.area();
    System.out.println("El area es: "+arear);
    Figura f3 = new Cuadrado(3);

    miControlador.addFig(f1);
    miControlador.addFig(f2);
    miControlador.addFig(f3);

    double suma=miControlador.areaTotal();
    System.out.println("El area total es: "+suma);
    }
}


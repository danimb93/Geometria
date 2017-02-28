package Geometria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dani on 23/02/2017.
 */
public class Controlador {
    List<Figura> figs;

    public Controlador(){
        figs=new ArrayList<Figura>();
    }

    public void addFig(Figura f){
        figs.add(f);
    }

    public double areaTotal(){
        double resultado = 0;
        for (int i=0;i<figs.size();i++){
            resultado=resultado+figs.get(i).area();
        }
        return resultado;
    }
}

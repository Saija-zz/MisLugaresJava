package com.saija.mislugares;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saija on 18/07/2017.
 */

public class Lugares {

    protected static List<Lugar> vectorLugares = ejemploLugares();

    static Lugar elemento(int id){
        return vectorLugares.get(id);
    }

    static void anadir(Lugar lugar){
        vectorLugares.add(lugar);
    }

    static int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size() - 1;
    }

    static void borrar(int id){
        vectorLugares.remove(id);
    }

    public static int size(){
        return vectorLugares.size();
    }

    public static ArrayList<Lugar> ejemploLugares() {
        ArrayList<Lugar> lugares = new ArrayList<>();

        lugares.add(new Lugar("Escuela tecnica politecnica de Gandia"
                , "C/ paraninf, 1 46730 Gandia(SPAIN)"
                , -0.166093
                , 38.995656
                , TipoLugar.EDUCACION
                , 962849300
                ,"http://www.espsg.es"
                ,"Uno de los mejores lugares para formarse"
                ,3));

        lugares.add(new Lugar("Colegio Mayor de Yumbo"
                , "Calle 12 Carrera 12"
                , -0.166093
                , 38.995656
                , TipoLugar.EDUCACION
                , 962849300
                ,"http://www.colmayor.com"
                ,"El mejor Colegio de Yumbo"
                ,5));


        return lugares;
    }


}

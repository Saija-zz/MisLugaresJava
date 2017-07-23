package com.saija.mislugares;

/**
 * Created by saija on 18/07/2017.
 */

public class Principal {
    public static void main(String[] args){
        for(Lugar l: Lugares.vectorLugares){
            System.out.println(l);
        }
        /*
        Lugar lugar = new Lugar("Escuela tecnica politecnica de Gandia"
                , "C/ paraninf, 1 46730 Gandia(SPAIN)"
                , -0.166093
                , 38.995656
                , TipoLugar.EDUCACION
                , 962849300
                ,"http://www.espsg.es"
                ,"Uno de los mejores lugares para formarse"
                ,3);

        System.out.println("Lugar = " + lugar.toString());
        */
    }



}

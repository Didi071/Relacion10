package Relacion10;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Autobus[] autobuses = new Autobus[4];
        int plazas;

        Scanner entrada = new Scanner(System.in);
        for (int i =0; i<autobuses.length; i++){
            System.out.println("Cuantas plazas tiene el autobus?");
            plazas = entrada.nextInt();
            autobuses[i] = new Autobus(plazas);
        }

        for(Autobus auxAutobus:autobuses){
            if (auxAutobus!=null){
                System.out.println("El autobus tiene " + auxAutobus.getNumeroPlazas()+ " plazas.");
            }
        }
        entrada.close();
    }
}

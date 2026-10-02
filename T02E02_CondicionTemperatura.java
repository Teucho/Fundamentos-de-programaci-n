package edu.thepower.tema02condicionesybucles;

import java.util.Scanner;

public class T02E02_CondicionTemperatura {
    public static void main(String[] args) {

        double temperatura;
        Scanner sc = new Scanner(System.in);
        String mensaje;

        System.out.print("Introduzca temperatura (-15º/45º): ");
        temperatura = sc.nextDouble();

        if (temperatura > 45 || temperatura < -15) {
            mensaje = "Temperatura fuera de rango admitido (-15º/45º)";
        }else if (temperatura < 0) {
            mensaje = "Está helando";
        }else if (temperatura < 10) {
            mensaje = "Hace frío";
        }else if (temperatura < 25) {
            mensaje = "Temperatura agradable";
        }else{
            mensaje = "Hace calor";
        }

        System.out.println(mensaje);
        sc.close();//Cierre de scanner
    }

}

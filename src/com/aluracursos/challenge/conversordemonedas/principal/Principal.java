package com.aluracursos.challenge.conversordemonedas.principal;

import com.aluracursos.challenge.conversordemonedas.procesos.DatosMonedas;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numeroDigitado = 0;
        double valorIngresado;

        Scanner teclado = new Scanner(System.in);
        DatosMonedas datos = new DatosMonedas();
        Menu menuPrincipal = new Menu();

        while (numeroDigitado != 7) {
            System.out.println(menuPrincipal.mostrarMenuPrincipal());
            numeroDigitado = teclado.nextInt();
            datos.asignarMonedas(numeroDigitado);

            if (numeroDigitado >= 1 && numeroDigitado <= 6) {
                System.out.println("Ingrese el valor a convertir: ");
                valorIngresado = teclado.nextDouble();
                datos.setValorAConvertir(valorIngresado);
                System.out.println(datos.traerDatos());
            } else if (numeroDigitado == 7) {
                System.out.println("Gracias por usar nuestra plataforma a continuacion encontrara el historico de conversiones");
            } else {
                System.out.println("Ingrese una opcion valida");
            }
        }

    }
}
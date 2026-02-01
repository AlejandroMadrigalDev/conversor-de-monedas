package com.aluracursos.challenge.conversordemonedas.principal;

import com.aluracursos.challenge.conversordemonedas.modelos.ConversorMapeado;
import com.aluracursos.challenge.conversordemonedas.procesos.DatosMonedas;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numeroDigitado = 0;
        double valorIngresado;
        String ultimaConversion;
        int cantidad = 1;

        Scanner teclado = new Scanner(System.in);
        DatosMonedas datos = new DatosMonedas();
        Menu menuPrincipal = new Menu();
        ConversorMapeado mostrarConversion = new ConversorMapeado();
        List <String> conversionesRealizadas = new ArrayList<>();

        while (numeroDigitado != 7) {
            System.out.println(menuPrincipal.mostrarMenuPrincipal());

            try {
                numeroDigitado = teclado.nextInt();
                datos.asignarMonedas(numeroDigitado);

                if (numeroDigitado >= 1 && numeroDigitado <= 6) {
                    System.out.println("Ingrese el valor a convertir: ");
                    valorIngresado = teclado.nextDouble();
                    datos.setValorAConvertir(valorIngresado);

                    LocalDateTime ahora = LocalDateTime.now();
                    String fechaFormateada = ahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                    String jsonDeAPI = datos.traerDatos();
                    ultimaConversion = ("La cantidad de: " + valorIngresado + mostrarConversion.resultado(jsonDeAPI));
                    System.out.println(ultimaConversion);

                    conversionesRealizadas.add(cantidad++ + ". - Fecha y Hora de Conversion: " + fechaFormateada + " - " + ultimaConversion);

                } else if (numeroDigitado == 7) {
                    System.out.println("Gracias por usar nuestra plataforma <3");
                    System.out.println("A continuacion encontrara un historial de las ultimas conversiones realizadas");
                    System.out.println(" ");

                    for (String item : conversionesRealizadas) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Ingrese una opcion valida");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Ingrese un numero de las opciones disponibles.");
                teclado.next();
            } catch (Exception exception) {
                System.out.println("Ocurrio un error. Vuelva a intentar.");
                teclado.next();
            }
        }
        teclado.close();
    }
}
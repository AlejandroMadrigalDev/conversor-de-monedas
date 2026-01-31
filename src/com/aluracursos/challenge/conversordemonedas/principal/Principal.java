package com.aluracursos.challenge.conversordemonedas.principal;

import com.aluracursos.challenge.conversordemonedas.procesos.DatosMonedas;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numeroDigitado;

        Scanner teclado = new Scanner(System.in);
        DatosMonedas datos = new DatosMonedas();
        Menu menuPrincipal = new Menu();

        System.out.println(menuPrincipal.mostrarMenuPrincipal());
        numeroDigitado = teclado.nextInt();

        System.out.println(datos.traerDatos());
    }
}
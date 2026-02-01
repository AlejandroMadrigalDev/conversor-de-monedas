package com.aluracursos.challenge.conversordemonedas.principal;

public class Menu {
    private String menuPrincipal;

    public String mostrarMenuPrincipal() {
        return this.menuPrincipal = """
                *****************************************************
                              BIENVENIDO A LA APLICACION
                             $$$ CONVERSOR DE MONEDAS $$$
                *****************************************************
                Seleccione un opcion para realizar la conversion:
                
                Opcion 1: Dolar             ==>>   Peso Colombiano.
                Opcion 2: Peso Colombiano   ==>>   Dolar.
                Opcion 3: Peso Mexicano     ==>>   Won Sur Coreano.
                Opcion 4: Won Sur Coreano   ==>>   Peso Mexicano.
                Opcion 5: Peso Uruguayo     ==>>   Yen Japones.
                Opcion 6: Yen Japones       ==>>   Peso Uruguayo.
                
                Opcion 7: Salir del Aplicativo y generar resumen de conversiones.
                """;
    }
}

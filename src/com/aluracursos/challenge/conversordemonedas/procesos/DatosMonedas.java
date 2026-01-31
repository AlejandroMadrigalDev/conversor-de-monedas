package com.aluracursos.challenge.conversordemonedas.procesos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DatosMonedas {
    int opcionSeleccionada;
    String monedaBase;
    String monedaDestino;
    double valorAConvertir;

    public void asignarMonedas(int numeroDigitado) {
        this.opcionSeleccionada = numeroDigitado;

        switch (numeroDigitado) {
            case 1:
                this.monedaBase = "USD";
                this.monedaDestino = "COP";
                break;
            case 2:
                this.monedaBase = "COP";
                this.monedaDestino = "USD";
                break;
            case 3:
                this.monedaBase = "MXN";
                this.monedaDestino = "KRW";
                break;
            case 4:
                this.monedaBase = "KRW";
                this.monedaDestino = "MXN";
                break;
            case 5:
                this.monedaBase = "UYU";
                this.monedaDestino = "JPY";
                break;
            case 6:
                this.monedaBase = "JPY";
                this.monedaDestino = "UYU";
                break;
            default:
                break;
        }
    }

    public void setValorAConvertir(double valorIngresado) {
        this.valorAConvertir = valorIngresado;
    }

    public String traerDatos() throws IOException, InterruptedException {
        String direccion = "https://v6.exchangerate-api.com/v6/3a0a7cbbc37108f41ffea991/pair/" + monedaBase + "/" + monedaDestino + "/" + valorAConvertir;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        return json;
    }
}
package com.aluracursos.challenge.conversordemonedas.procesos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DatosMonedas {
    String monedaBase;
    String monedaDestino;
    double valorAConvertir;

    String direccion = "https://v6.exchangerate-api.com/v6/3a0a7cbbc37108f41ffea991/pair/" + monedaBase + "/" + monedaDestino + "/" + valorAConvertir;

    public String traerDatos() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        return json;
    }
}
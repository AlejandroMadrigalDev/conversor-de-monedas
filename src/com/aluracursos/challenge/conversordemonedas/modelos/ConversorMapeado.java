package com.aluracursos.challenge.conversordemonedas.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class ConversorMapeado {
    private String monedaBase;
    private String monedaDestino;
    private double valorConvertido;

    public void mapear(Conversor conversion) {
        this.monedaBase = conversion.base_code();
        this.monedaDestino = conversion.target_code();
        this.valorConvertido = conversion.conversion_result();
    }

    public String resultado(String jsonAConvertir) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Conversor conversion = gson.fromJson(jsonAConvertir, Conversor.class);

        mapear(conversion);

        return """
                [""" + monedaBase + """
                ] Corresponde al valor de:  """ + valorConvertido + """
                [""" + monedaDestino + """
                ]
                """;
    }
}

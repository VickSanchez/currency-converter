package com.vicksanchez.currencyconverter.utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vicksanchez.currencyconverter.models.Currency;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class ConverterAPI {
    private Currency result;
    private double originAmount;
    public Currency currencyConversionResult(String originCurrency, String targetCurrency, double amount) {
        try {
            // To convert a currency the url must have the params https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT
            this.originAmount = amount;
            String url = "https://v6.exchangerate-api.com/v6/de3cf4656cfc839f35e6d57e/pair/";
            String uri = url + originCurrency + "/" + targetCurrency + "/" + amount;
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                                    .uri(URI.create(uri))
                                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            this.result = gson.fromJson(json, Currency.class);
            return this.result;
        } catch (IOException | InterruptedException e) {
            System.out.println("Error on HTTP Request");
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        DecimalFormat formatoDecimales = new DecimalFormat("###,###.##");
        return formatoDecimales.format(this.originAmount) + " " + result.base_code() + " = " + formatoDecimales.format(result.conversion_result()) + " " +  result.target_code() + "\n";
    }
}

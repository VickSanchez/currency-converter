package com.vicksanchez.currencyconverter.utilities;

import com.vicksanchez.currencyconverter.exceptions.InvalidOptionException;

public class SupportedCurrencysConversion {
    public String optionConversionToString(int option){
        return switch (option) {
            case 1 -> "CAD";
            case 2 -> "USD";
            case 3 -> "MXN";
            case 4 -> "GTQ";
            case 5 -> "CRC";
            case 6 -> "PEN";
            case 7 -> "BOB";
            case 8 -> "BRL";
            case 9 -> "ARS";
            default -> throw new InvalidOptionException("\n¡Invalid Option! Please enter a number corresponding to option of the currency.");
        };
        /* this is the same method
        switch (option){
            case 1:
                return "CAD";
            case 2:
                return "USD";
            case 3:
                return "MXN";
            case 4:
                return "GTQ";
            case 5:
                return "CRC";
            case 6:
                return "PEN";
            case 7:
                return "BOB";
            case 8:
                return "BRL";
            case 9:
                return "ARS";
            default:
                return "Invalid Option";
        }
         */
    }
}

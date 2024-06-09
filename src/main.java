import com.vicksanchez.currencyconverter.exceptions.InvalidOptionException;
import com.vicksanchez.currencyconverter.models.Currency;
import com.vicksanchez.currencyconverter.utilities.ConverterAPI;
import com.vicksanchez.currencyconverter.utilities.SupportedCurrencysConversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ConverterAPI converter = new ConverterAPI();
        SupportedCurrencysConversion optionToString = new SupportedCurrencysConversion();
        Scanner reader = new Scanner(System.in);
        System.out.println("******#################################################******");
        System.out.println("\n      Welcome to the Vick Sanchez's Currency Converter");
        System.out.println("\n******#################################################******");
        while (true){
            try{
                System.out.println("""
               
                                    1.- Canadian Dollar CAD
                                    2.- United States Dollar USD
                                    3.- Mexican Peso MXN
                                    4.- Guatemalan Quetzal GTQ
                                    5.- Costa Rican Colon CRC
                                    6.- Peruvian Sol PEN
                                    7.- Bolivian Boliviano BOB
                                    8.- Brazilian Real BRL
                                    9.- Argentine Peso ARS
                                    0.- Exit
                                    """);
                System.out.println("Select the number of the currency you want to convert:");
                int originOption = reader.nextInt();
                if (originOption == 0 ){
                    System.out.println("Exiting program thank you!");
                    break;
                }
                String originCurrency = optionToString.optionConversionToString(originOption);
                System.out.println("Enter " + originCurrency + " amount:");
                double amount = reader.nextDouble();
                System.out.println("Convert to:");
                int targetOption = reader.nextInt();
                String targetCurrency = optionToString.optionConversionToString(targetOption);
                System.out.println("Converting " + originCurrency + " to " + targetCurrency +" ...\n");
                converter.currencyConversionResult(originCurrency,targetCurrency,amount);
                System.out.println("******#################################################******\n");
                System.out.println(converter);
                System.out.println("******#################################################******\n");
            } catch ( InputMismatchException e) {
                System.out.println("\n¡Invalid Input! Please enter a number format.");
                reader.next();
            } catch ( InvalidOptionException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (Exception e){
                System.out.println("Error");
                System.out.println(e.getMessage());
            }
        }
    }
}

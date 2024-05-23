import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("******#################################################******");
        System.out.println("\n      Welcome to the Vick Sanchez's Currency Converter");
        System.out.println("\n******#################################################******");
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
        System.out.println("Select the currency you want to convert:");
        try{
            int originCurrency = reader.nextInt();
            System.out.println("Enter amount:");
            double originAmount = reader.nextDouble();
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
            System.out.println("Convert to:");
            int targetCurrency = reader.nextInt();
            System.out.println("...Converting");
            System.out.println("******#################################################******");
        } catch( InputMismatchException e) {
            System.out.println("Invalid Option " + e.getMessage());
        }


    }}

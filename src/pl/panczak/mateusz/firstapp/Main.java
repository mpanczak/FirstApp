package pl.panczak.mateusz.firstapp;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        // PrintStream ps = new PrintStream(System.out);

//1.3
        /*
        System.out.println("Witaj Świecie!\n" +
                "Inwokacja:\n\t" +
                "\"Litwo! Ojczyzno moja! Ty jesteś jak zdrowie,\n\t" +
                "Ile cię trzeba cenić, ten tylko się dowie,\n\t" +
                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n\t" +
                "Widzę i opisuję, bo tęsknię po tobie.\"\n" +
                "Koniec inwokacji. Koniec programu za 10..");



        int i;
        for (i=9; i>0; i--){
            Thread.sleep(1000);
            System.out.println("Koniec programu za " +i  +"..");

        }
        */

//1.4
/*
        System.out.println("Inwokacja:\n");
        System.out.println("\t\"Litwo! Ojczyzno moja! Ty jesteś jak zdrowie,\n" +
                "\tIle cię trzeba cenić, ten tylko się dowie,\n" +
                "\tKto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                "\tWidzę i opisuję, bo tęsknię po tobie\"");

        System.out.println("\n");
        System.out.println("Koniec inwokacji.");
        System.out.println("Podaj ilość wiadomości:");
        var sc = new Scanner(System.in); //Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj treść wiadomości:");
        String message = sc.nextLine();
        for (int i = x; i > 0; i--) {

            System.out.format("\n %s  %d...", message, i);
        }
*/
//1.5
/*
        var sc = new Scanner(System.in); //Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wagę [kg]:");
        double weight = sc.nextDouble();

        System.out.println("Podaj wzrost [m]:");
        double height = sc.nextDouble();

        double bmi = weight/(height*height);
        System.out.format("Twoje BMI to: %f", bmi);



*/

    }
}

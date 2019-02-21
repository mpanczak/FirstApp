package pl.panczak.mateusz.firstapp; //pakiet - lokalizacja klasy w drzewie projektu

import java.util.Scanner; //zaimportowanie biblioteki scanner (do pobierania tekstu z klaawiatury)
public class Main { //definicja publicznej klasy Main

    public static void main(String[] args) throws InterruptedException { //metoda main, od niej rozpoczyna sie dzialanie programu w Javie, powinna być publiczna, musi byc statyczna, throws InterruptedException do wykorzystania przy sleep
//1.3 zakomentowana pierwsza część zadania, aby przetestować należy odkomentować i zakomentować resztę
//*
        System.out.println("Witaj Świecie!\n" +    // strumień wyjściowy, wyświetla tekst w konsoli, \n-nowa linia \t-tabulacja
                "Inwokacja:\n\t" +
                "\"Litwo! Ojczyzno moja! Ty jesteś jak zdrowie,\n\t" +
                "Ile cię trzeba cenić, ten tylko się dowie,\n\t" +
                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n\t" +
                "Widzę i opisuję, bo tęsknię po tobie.\"\n" +
                "Koniec inwokacji. Koniec programu za 10..");

        int i; //inicjalizaacja zmiennej (intiger) wykorzystanej w petli for
        for (i=9; i>0; i--){  //pętla for, warunek prawdziwy dopuki i>0
            Thread.sleep(1000); // uśpienie na 1s zanim zostanie wyświetlona kolejna linia
            System.out.println("Koniec programu za " +i  +".."); // Wyświetlanie tekstu w konsoli "+" można dokładać kolejne elementy

        }
// */

//1.4 zakomentowana kolejna część zadania
/*
        System.out.println("Inwokacja:\n"); // strumień wyjściowy, wyświetla tekst w konsoli, \n-nowa linia \t-tabulacja
        System.out.println("\t\"Litwo! Ojczyzno moja! Ty jesteś jak zdrowie,\n" +
                "\tIle cię trzeba cenić, ten tylko się dowie,\n" +
                "\tKto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                "\tWidzę i opisuję, bo tęsknię po tobie\"");

        System.out.println("\n");
        System.out.println("Koniec inwokacji.");
        System.out.println("Podaj ilość wiadomości:"); //wyswietlenie uzytkownikowi komunikatu jaka wartosc ma wprowadzic z klawiatury
        var sc = new Scanner(System.in); ////utworzenie obiektu typu Scanner, Scanner sc = new Scanner(System.in); zgodnie z instrukcją zamiana Scanner na var
        int x = sc.nextInt(); // pobranie zmiennej x z klawiatury
        sc.nextLine(); //jeżeli używa się nextInt nextDouble itp. to po nich należy wywołać pustę metodę nextLine(), ponieważ w buforze pozostaje znak nowej linii \n
        System.out.println("Podaj treść wiadomości:"); ////wyswietlenie uzytkownikowi komunikatu jaka wartosc ma wprowadzic z klawiatury
        String message = sc.nextLine(); //pobranie kolejnej zmiennej, tym razem string
        for (int i = x; i > 0; i--) { //pętla taka jak wcześniej z tym że warunak początkowy x=i -liczbie wprowadzonej z klawiatury

            System.out.format("\n %s  %d...", message, i); //wypisywanie na ekranie, format- po "%" wpisuje się rodzaj zmiennej a na końcu jej nazwę w odpowiedniej kolejności
        }
*/
//1.5 kolejna część
/*
        var sc = new Scanner(System.in);//utworzenie obiektu typu Scanner

        System.out.println("Podaj wagę [kg]:");//wyswietlenie uzytkownikowi komunikatu jaka wartosc ma wprowadzic z klawiatury
        double weight = sc.nextDouble(); //pobranie zmiennej z klawiatury

        System.out.println("Podaj wzrost [m]:");//wyswietlenie uzytkownikowi komunikatu jaka wartosc ma wprowadzic z klawiatury
        double height = sc.nextDouble(); //pobranie zmiennej z klawiatury

        double bmi = weight/(height*height); // wyliczenie bmi ze wzoru
        System.out.format("Twoje BMI to: %f", bmi);//wyswietlenie uzytkownikowi komunikatu jaka jest wartosc jego bmi



*/
//1.5+ ostatnia część + klasa BodyMassIndex
/*
        double w = 0, h = 0; //inicjalizacja zmiennych pomocniczych sluzacych do walidacji danych wejsciowych oraz, po poprawnym wprowadzeniu,  przekazywancyh do konstruktora obiektu klasy BodyMassIndex
        Scanner in = new Scanner(System.in); //utworzenie obiektu typu Scanner, ktory przyjmuje jako parametr pole "in" statycznej klasy "System"- stanowi standardowy strumien wejscia, klawiature
        System.out.println("Podaj wage [kg]: "); //wyswietlenie uzytkownikowi komunikatu jaka wartosc ma wprowadzic z klawiatury [wage w kg] i przejscie do nowej linii
        while (w == 0) { //warunek walidacyjny, jesli prawda, to wystapil blad danych wejsciowych - powtorz petle
            if(in.hasNextDouble()){ //warunek logiczny sprawdzajacy czy podana z klawiatury zostala wartosc typu double
                w = in.nextDouble(); //przypisanie do zmiennej pomocniczej oznaczajacej wage wartosci pobranej z klawiatury
                if(w <= 0){ //jesli podana liczba jest mniejsza lub rowna 0 - blad. waga czlowieka nie mzoe przyjac takiej wartosci
                    System.err.println("Waga nie może być ujemna lub rowna 0"); //wyswietlenie na standardowe wyjscie (konsole) komuniaktu bledu przekazanego w nawiasie - tekst bedzie kolorem czerwonym
                    in.nextLine(); //ponowne wprowadzenie wartosci z klawiatury
                    w = 0; //przypisanie do zmiennej w wartosci 0, co powoduje spelnienie warunku logicznego w petli while i ponowne wykonanie sie petli oraz sprawdzenie czy wprowadzona wartosc jest poprawna
                }
            }else { //nie zostala wprowadzona liczba
                System.err.println("Podaj liczbę");  //wyswietlenie na standardowe wyjscie (konsole) komuniaktu bledu przekazanego w nawiasie - tekst bedzie kolorem czerwonym (nie zostala podana wartosc typu double)
                in.nextLine(); //ponowne wprowadzenie wartosci z klawiatury
            }
        }

        System.out.println("Podaj wzrost [m]: "); //wyswietlenie uzytkownikowi komunikatu jaka wartosc ma wprowadzic z klawiatury [wzrost w m] i przejscie do nowej linii
        while (h == 0) { //warunek walidacyjny, jesli prawda, to wystapil blad danych wejsciowych - powtorz petle
            if(in.hasNextDouble()) { //warunek logiczny sprawdzajacy czy podana z klawiatury zostala wartosc typu double
                h = in.nextDouble();  //przypisanie do zmiennej pomocniczej oznaczajacej wzrost wartosci pobranej z klawiatury
                if(h <= 0) { //jesli podana liczba jest mniejsza lub rowna 0 - blad. wzrost czlowieka nie mzoe przyjac takiej wartosci
                    System.err.println("Wzrost nie może być ujemny lub rowny 0"); //wyswietlenie na standardowe wyjscie (konsole) komuniaktu bledu przekazanego w nawiasie - tekst bedzie kolorem czerwonym
                    in.nextLine(); //ponowne wprowadzenie wartosci z klawiatury
                    h = 0; //przypisanie do zmiennej h wartosci 0, co powoduje spelnienie warunku logicznego w petli while i ponowne wykonanie sie petli oraz sprawdzenie czy wprowadzona wartosc jest poprawna
                }
            }else { //nie zostala wprowadzona liczba
                System.err.println("Podaj liczbę"); //wyswietlenie na standardowe wyjscie (konsole) komuniaktu bledu przekazanego w nawiasie - tekst bedzie kolorem czerwonym (nie zostala podana wartosc typu double)
                in.nextLine(); //ponowne wprowadzenie wartosci z klawiatury
            }
        }

        in.close();  //zamkniecie standardowego wejscia

        BodyMassIndex bmi = new BodyMassIndex(w, h); //utworzenie obiektu klasy BMI oraz przekazanie mu poprawnych parametrow odczytanych od uzytkownika (waga, wzrost)
        System.out.println(bmi.getClassification()); //wyswietlenie rezultatu dzialanie metody pokazujacej info nt. indeksu BMI. wywoalana metoda  zwraca wartosc typu String, wiec trzeba ja podac na wyjscie metoda np. "println"

//*/
    }
}

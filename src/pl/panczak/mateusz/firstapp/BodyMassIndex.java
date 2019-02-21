
package pl.panczak.mateusz.firstapp; //pakiet - lokalizacja klasy w drzewie projektu

public class BodyMassIndex {    //definicja publicznej klasy o nazwie BodyMassIndex

    private double weight, height; //deklaracja prywatnych pol (hermetyzacja danych) typu double (64b - liczba zmiennoprzecinkowa podwojnej precyzji), mogacych przechowywac liczby niecalkowite takie jak wzrost czy waga czlowieka

    public BodyMassIndex(double weight, double height) { //utworzenie konstruktora dwuparametrowego, ktory podczas tworzenia obiektu ustawia wartosci pol odpowiadajacych za wzrost i wage i nie pozwala zostawic ich pustych
        this.weight = weight; //ustawienie wartosci pola odpowiadajacego za wage - slowo kluczowe "this" wskazuje na pole klasy, zas zmienna "weight" po prawej stronie znaku rownosci to parametr przekazany do konstruktora podczas tworzenia obiektu
        this.height = height; //ustawienie wartosci pola odpowiadajacego za wzrost - slowo kluczowe "this" wskazuje na pole klasy, zas zmienna "height" po prawej stronie znaku rownosci to parametr przekazany do konstruktora podczas tworzenia obiektu
    }

    private double calculate() { //deklaracja metody obliczajacej BMI, zwraca ona wartosc typu double (BMI moze byc i czesto nie jest liczba calkowita), metoda nie przyjmuje zadnych parametrow, dziala na polach klasy, metoda jest prywatna gdyz jest jedynie metoda pomocnicza i nie powinna byc widziana z zewnatrz klasy

        return weight / (height * height); //zwrocenie niniejszej wartosci oznacza de facto obliczenie wskaznika BMI
    }

    public String getClassification() { //deklaracja metody zwracajacej wartosc wskaznika BMI oraz wyswietlajacej stosowny komunikat o "stanie" osoby badanej, publiczna - bedzie wywolana w celu wyswietlenia wynikow, nie przyjmuje parametrow, jest typu "String" - zwraca ciag znakow
        String result; //lokalna zmienna pomocnicza, ktora bedzie przechowywac rezultat dzialania metody i zwracac go na zewnatrz
        double bmi = calculate(); //lokalna zmienna pomocnicza, ktora bedzie przechowywac wynik dzialania metody "calculate" aby nie musiec obliczac wartosci tejze metody kilkukrotnie w dalszych dzialaniach
        if (bmi > 30) { //sprawdzenie czy wartosc wskaznika BMI jest wieksze od 30, co przyjeto za dolna granice nadwagi
            result = "Twoje BMI to: " + bmi + "\nMasz nadwagę"; //przypisanie do zmiennej "result" ciagu znakow stanowiacego konunikat wyswietlany uzytkownikowi, gdy warunek logiczny przy "if" jest prawdziwy, znak plusa oznacza konkatenacje, czyli laczenie znakow, zas "\n", wyswietlenie wszystkich znakow za nim w nowej linii
        } else if (bmi < 18.5) { //sprawdzenie czy wartosc wskaznika BMI jest mniejsze od 18.5, co przyjeto za gorna granice niedowagi
            result = "Twoje BMI to: " + bmi + "\nMasz niedowagę"; //przypisanie do zmiennej "result" ciagu znakow stanowiacego konunikat wyswietlany uzytkownikowi, gdy warunek logiczny przy "if" jest prawdziwy, znak plusa oznacza konkatenacje, czyli laczenie znakow, zas "\n", wyswietlenie wszystkich znakow za nim w nowej linii
        } else { //juz bez warunku, jesli BMI jest wieksze od 18,5 i jednoczesnie mneijsze od 30 to waga jest w porzadku i nie trzeba niczego sprawdzac, tylko taka ewentualnosc pozostaje
            result = "Twoje BMI to: " + bmi + "\nMasz prawidłową wagę"; //przypisanie do zmiennej "result" ciagu znakow stanowiacego konunikat wyswietlany uzytkownikowi, gdy warunek logiczny przy "if" jest prawdziwy, znak plusa oznacza konkatenacje, czyli laczenie znakow, zas "\n", wyswietlenie wszystkich znakow za nim w nowej linii
        }
        return result;  //metoda zwraca ciag znakow przypisany do zmiennej result w zaleznosci od tego, ktory warunek logiczny zostal spelniony
    }

}
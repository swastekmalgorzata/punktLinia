package com.company;

public class Main {

    public static void main(String[] args) {

       // Utwórz obiekt typu Punkt i następnie przypisz wartość x oraz y.
        Punkt zmienna1=new Punkt();
        zmienna1.x=1;
        zmienna1.y=1;
        // Utwórz obiekt typu Punkt i następnie przypisz wartość x oraz y.
        Punkt zmienna2=new Punkt();
        zmienna2.x=2;
        zmienna2.y=3;
        // Utwórz obiekt typu Linia i następnie przypisz wartość początku i końca.
        Linia zmienna3=new Linia();
        zmienna3.poczatek.x=0;
        zmienna3.koniec.x=0;
        // Wypisz wartość pola x z koniec.
        System.out.println(Punkt.x);
        // Wypisz wartość pola y z poczatek.
        zmienna3.poczatek.x=1;
    }
}
final class Punkt{
    public static int x;
    public static int y;
}
final class Linia{
 Punkt poczatek = new Punkt();
 Punkt koniec = new Punkt();
}
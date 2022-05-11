package pl.sda.arp4.object.java;

import java.util.Scanner;

public class MainObywatel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie :");
        String imieWprowadzone = scanner.nextLine();

        System.out.println("Podaj nr PESEL :");
        String peselWprowadzony = scanner.nextLine();

        Obywatel obywatelPierwszy = new Obywatel(imieWprowadzone, peselWprowadzony);
        System.out.println(obywatelPierwszy);





    }





}

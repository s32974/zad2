import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int zniszka = 0;

        System.out.println("Podaj wiek");
        int wiek = sc.nextInt();
        System.out.println("Podaj miasto zamieszkania");
        String miasto = sc.next();
        System.out.println("Podaj dzień tygodnia");
        String dzien = sc.next();

        if (wiek <10) { zniszka =100; }
        else if (wiek > 10 && wiek <18) { zniszka =50; }

        if (miasto.equals("Warszawa")) {
            zniszka = zniszka + 10;
        }
        if (dzien.equals("Czwartek")) {
            zniszka = zniszka + 100;
        }

        if (zniszka>100) { zniszka = 100; }

        int cena = (40 - ( 40 * zniszka/100));

        System.out.println("Dane: " + miasto + ", " + wiek + " lat, " + dzien + " Cena: "  + cena + "  Zniżka: " + zniszka+ "%");



    }
}
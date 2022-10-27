import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Zadanie 1
        System.out.println(Zadania.ja());

        //Zadanie 2
        int a,b;
        Scanner input = new Scanner(System.in);
        /*System.out.println("Podaj a:");
        a = input.nextInt();
        System.out.println("Podaj b:");
        b = input.nextInt();
        Zadania.kalkulator(a,b);

        //Zadanie 3
        System.out.println(Zadania.parzyste(5));
        System.out.println(Zadania.parzyste(4));

        //Zadanie 4
        System.out.println(Zadania.podzielna(5));

        //Zadanie 5
        System.out.println(Zadania.potega(5));

        //Zadanie 6
        System.out.println(Zadania.pierwiastek(9));
*/
        //Zadanie 7
        System.out.println("Podaj min zakres:");
        a = input.nextInt();
        System.out.println("Podaj max zakres:");
        b = input.nextInt();
        Zadania.siodemka(a,b);
    }
}
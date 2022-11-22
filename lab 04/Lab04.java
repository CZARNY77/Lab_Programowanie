import java.util.Random;
import java.util.Scanner;

public class Lab04 {

    static Scanner input = new Scanner(System.in);

    static void losowanie(int [] tab, int a, int b){
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(a,b);
        }
    }

    static void zad01(){

        System.out.println("Podaj n elementów: ");
        int n = input.nextInt();

        int [] tab = new int[n];
        losowanie(tab, 0, 10);

        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma+=tab[i];
        }
        System.out.println("Suma po for: " + suma);
        System.out.println("Srednia po for: " + suma/ tab.length);

        suma = 0;
        for (int ele:tab) {
            suma += ele;
        }
        System.out.println("Suma po foreach: " + suma);
        System.out.println("Srednia po foreach: " + suma/ tab.length);

    }
    
    static void zad02(){
        int [] parzyste = {2, 4, 6, 8, 10, 12};
        int [] nieparzyste = {3, 5, 7, 9, 11, 13};

        for (int i = 0; i < parzyste.length; i += 2) {
            System.out.print(parzyste[i] + " ");
        }

        for (int i = 0; i < nieparzyste.length; i += 2) {
            System.out.print(nieparzyste[i] + " ");
        }
    }

    static  void zad03(){
        String [] tab = new String[]{"Ala ", "ma ", "Kota ", "i Psa"};
        for (String ele: tab) {
            System.out.println(ele.toUpperCase());

        }
    }

    static void zad04(){
        String [] tab = new String[5];
        for (int i =0; i< tab.length; i++) {
            tab[i] = input.next();
        }
        for (int i = tab.length-1; i>= 0; i--){
            for (int j=tab[i].length()-1; j>=0; j--){
                System.out.print(tab[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

    static void zad05(){
        int [] tab = new int[8];
        losowanie(tab, 0, 100);

        for (int x: tab) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int i=0; i<tab.length; i++){
            for(int j=i+1; j<tab.length; j++){
                if(tab[i] > tab[j]){
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }


        for (int x: tab) {
            System.out.print(x + " ");
        }
    }

    static void zad06(){
        int [] tab = new int[5];
        losowanie(tab, 1, 6);
        for (int ele:tab) {
            int temp = 1;
            for (int i=1; i<=ele; i++) temp*=i;
            System.out.print(ele+" = " + temp + "\n");
        }
    }

    static void zad07(){
        String [] s1 = new String[] {"Ala ma kota"};
        String [] s2 = new String[] {"Ala ma kota"};

        for (int i =0; i<s1.length; i++){
            if(s1[0].equals(s2[0])) System.out.println("Są takie same");
            else System.out.println("Nie są takie same");
        }

    }
}

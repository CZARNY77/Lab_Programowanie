import java.util.Random;
import java.util.Scanner;

public class lab03 {
    static Scanner input = new Scanner(System.in);

    static int losowanie(){
        Random r = new Random();
        return r.nextInt(101);
    }

    static int losowanie_z_przedzialu(int a, int b){
        Random r = new Random();
        return r.nextInt(b-a+1)+a;
    }

    static void Zad1(){
        System.out.println("Podaj ile studentów: ");
        int ilosc = input.nextInt();
        int i = 0, suma = 0;
        while(i < ilosc){
            i++;
            int temp = losowanie();
            System.out.println("Stutent " + i + ": " + temp);
            suma += temp;
        }
        System.out.println("Średnia: " + suma/ilosc);
    }

    static void Zad2(){
        int tab[] = new int[10];
        int sum_dod = 0, sum_uje = 0, ilosc_dod = 0, ilosc_uje = 0;
        for(int i=0; i<10; i++){
            tab[i] = losowanie()-losowanie();
            System.out.println("Liczba " + i + " = " + tab[i]);
            if(tab[i] >=0){
                ilosc_dod++;
                sum_dod += tab[i];
            }
            else{
                ilosc_uje++;
                sum_uje += tab[i];
            }
        }
        System.out.println("Ilość liczb dodatnich: " + ilosc_dod + ", Suma: " + sum_dod);
        System.out.println("Ilość liczb ujemnych: " + ilosc_uje + ", Suma: " + sum_uje);
    }

    static void Zad3(){
        System.out.println("Podaj n:");
        int n = input.nextInt();
        int suma =0;
        for(int i=1; i<=n; i++){
            if(i%2 ==0){
                System.out.println("Liczba: " + i);
                suma += i;
            }
        }
        System.out.println("Suma: " + suma);
    }

    static void Zad4(){
        System.out.println("Podaj n:");
        int n = input.nextInt();
        int suma = 0;
        for(int i=0; i<n; i++){
            int temp = losowanie_z_przedzialu(-10, 45);
            System.out.println("Liczba: " + temp);
            if(temp%2 == 0){
                suma += temp;
            }
        }
        System.out.println("Suma: " + suma);
    }

    static void Zad5(){
        System.out.println("Podaj słowo:");
        String slowo = input.next();

        slowo = slowo.toLowerCase();
        String slowo_reverse = reverse(slowo);
        System.out.println(slowo + " -> " + slowo_reverse);

        if(slowo.equals(slowo_reverse)){
            System.out.println("Słowo jest palidromem");
        }
        else {System.out.println("Słowo NIE jest palidromem");}
    }

    static String reverse(String word){
        String s_temp = "";
        for(int i=word.length()-1; i>=0; i--){
            s_temp += word.charAt(i);
        }
        return s_temp;
    }
}

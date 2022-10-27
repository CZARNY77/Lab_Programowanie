import java.util.Random;

import static java.lang.Math.sqrt;

public class Zadania {
    static String ja(){
        return "Jakub Wojdyła";
    }

    static void kalkulator(int a, int b){
        System.out.println("Suma = " + (a+b));
        System.out.println("Różnica = " + (a-b));
        System.out.println("Iloczyn = " + (a*b));
        if(a>b) System.out.println("Iloraz = " + (a/b));
        else System.out.println("Iloraz = " + (b/a));
    }

    static boolean parzyste(int a){
        if(a%2 == 0) return true;
        else return false;
    }

    static boolean podzielna(int a){
        if(a%3==0 && a%5==0) return true;
        else return false;
    }
    static int potega(int a){
        return a*a*a;
    }
    static double pierwiastek(double a){
        return sqrt(a);
    }
    static boolean spr(int a, int b, int c){
        if((a+b > c) || (a+c > b) ||(c+b > a) ) return  true;
        return false;
    }

    static void siodemka(int a, int b){
        Random r = new Random();
        int x,y,z;
        x = r.nextInt(b-a+1)+a;
        y = r.nextInt(b-a+1)+a;
        z = r.nextInt(b-a+1)+a;
        System.out.format("%d, %d, %d\n",x, y, z);
        System.out.println(spr(x,y,z));
    }
}

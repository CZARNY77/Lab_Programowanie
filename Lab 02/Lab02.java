import java.util.Scanner;

public class Lab02 {
    static Scanner input = new Scanner(System.in);
    static void Zad1(){
        System.out.println("Podaj a: ");
        int a = input.nextInt();
        System.out.println("Podaj b: ");
        int b = input.nextInt();
        System.out.println("Podaj c: ");
        int c = input.nextInt();

        float x = (2*a)+b;
        x = c/x*(-1);
        System.out.println(x);
    }

    static  void Zad2(){
        System.out.println("Podaj x dla funkcji a: ");
        int a = input.nextInt();

        if(a > 0) a *= 2;
        else if(a == 0) a = 0;
        else if(a < 0) a *= -3;

        System.out.println("a(x) = " + a);

        System.out.println("Podaj x dla funkcji b: ");
        int b = input.nextInt();

        if(b >= 1) b *= b;
        else if(b < 1) b = b;

        System.out.println("b(x) = " + b);

        System.out.println("Podaj x dla funkcji c: ");
        int c = input.nextInt();

        if(c > 2) c += 2;
        else if(c == 2) c = 8;
        else if(c < 2) c = 4-c;

        System.out.println("c(x) = " + c);
    }

    static void Zad3(){
        System.out.println("Podaj x: ");
        int x = input.nextInt();
        System.out.println("Podaj y: ");
        int y = input.nextInt();
        System.out.println("Podaj z: ");
        int z = input.nextInt();

        int temp = 0;
        if(x>y){
            temp = x;
            x = y;
            y = temp;
        }
        if(x>z)
        {
            temp = x;
            x = z;
            z = temp;
        }
        if(y>z)
        {
            temp = y;
            y = z;
            z = temp;
        }

        System.out.println(x + " " + y + " " + z);
    }

    static void Zad4(){
        System.out.println("Czy pada deszcz? (tak/nie)");
        String deszcz = input.next();
        deszcz.toLowerCase();
        System.out.println("Czy jest autobus? (tak/nie)");
        String autobus = input.next();
        autobus.toLowerCase();

        if(deszcz.equals("tak") && autobus.equals("tak")){
            System.out.println("We?? parasol");
            System.out.println("Dostaniesz si?? na uczelni??");
        }
        else if(deszcz.equals("tak") && !autobus.equals("tak")){
            System.out.println("Nie dostaniesz si?? na uczelni??");
        }
        else if(!deszcz.equals("tak") && autobus.equals("tak")){
            System.out.println("???Dostaniesz si?? na uczelni");
            System.out.println("???Mi??ego dnia i pi??knej pogody");
        }
    }

    static  void Zad5(){
        System.out.println("Czy jest zniszka? (tak/nie)");
        String zniszka = input.next();
        zniszka.toLowerCase();
        System.out.println("Czy otrzyma??e?? premi??? (tak/nie)");
        String premia = input.next();
        premia.toLowerCase();
        //Chyba tre??ci zadani do ko??ca nie zrozumia??em :|

        if(!zniszka.equals("tak") || premia.equals("tak")){
            System.out.println("Mo??esz kupi?? samoch??d!");
            if(!zniszka.equals("tak"))  System.out.println("Zni??ki na samoch??d nie ma");
        }
        else if(!zniszka.equals("tak") || !premia.equals("tak")){
            System.out.println("Zakup samoch??d trzeba od??o??y?? na p????niej...");
            if(!zniszka.equals("tak"))  System.out.println("Zni??ki na samoch??d nie ma");
        }
        else if(zniszka.equals("tak") || premia.equals("tak")){
            System.out.println("Mo??esz kupi?? samoch??d!");
        }
    }

    static void Zad6(){
        System.out.println("Podaj a: ");
        float a = input.nextInt();
        System.out.println("Podaj b: ");
        float b = input.nextInt();

        System.out.println("1. Dodawanie\n2.Odejmowanie\n3.Iloczyn\n4.Iloraz\n5.Reszta z dzielenia");
        int wybor = input.nextInt();

        switch (wybor){
            case 1:
                System.out.println("Dodawanie: " + (a+b));
                break;
            case 2:
                System.out.println("R????nica: " + (a-b));
                break;
            case 3:
                System.out.println("Iloczyn: " + (a*b));
                break;
            case 4:
                if(b == 0) System.out.printf("Nie wolno dzieli?? przez 0");
                else System.out.println("Iloraz: " + (a/b));
                break;
            case 5:
                System.out.println("Modulo: " + (a%b));
                break;
            default:
                System.out.println("Z??t wyb??r");
                break;

        }
    }
}

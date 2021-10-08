import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("i = " + i);
        double d = 2.3;
        System.out.println("d = " + d);
        boolean b = true;
        System.out.println("b = " + b);
        char c = 'C';
        System.out.println("c = " + c);
        String Tanga = "Stringtanga";
        System.out.println(Tanga);

        boolean Gerade = 2 % 2 == 0;
        System.out.println("Gerade = " + Gerade);

    }

    public static void main(String[] args) {

            System.out.println("Bitte geben Sie eine Zahl ein");
            Scanner ZahlA = new Scanner();
            int A = ZahlA.nextInt();

            System.out.println("Bitte geben Sie eine 2. Zahl ein");
            Scanner ZahlB = new Scanner();
            int B = ZahlB.nextInt();

            int Summe = ZahlA + ZahlB;
            System.out.println("Die Summe lautet" + Summe);
        }

}

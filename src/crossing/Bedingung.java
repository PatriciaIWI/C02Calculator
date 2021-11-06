package crossing;

public class Bedingung {
    public static int divide (int dividend, int divisor) {
        if ( divisor == 0) {
            return 0;
        }
        return dividend/divisor;


    }

    public static void main(String[] args) {
        System.out.println(divide(4,2));
    }
}

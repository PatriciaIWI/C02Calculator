package stack;

public class DemoStackApp {
    public static void main(String[] args) {

       // Stack stapel = new Stack (new int [7]);
    //    Stack stapel = new Stack (new Integer [7]); //primativer datentyp gibt es Wrapper klassen - daher Integer und nicht int
        Stack <String> stapel = new Stack (new String [7]); //Durch <String> ersetzt T - Das muss man dem programm sagen
        stapel.push("Sieben");
        stapel.push("Fünf");
        stapel.push("Sechs");
        System.out.println("stapel.pop = " + stapel.pop());
        System.out.println("stapel.pop = " + stapel.pop());
        stapel.push("Drei");
        System.out.println("stapel.pop = " + stapel.pop());
        System.out.println("stapel.pop = " + stapel.pop());
    }
}

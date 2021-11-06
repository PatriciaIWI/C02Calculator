package stack;

public class Stack<T> { //flexibler daten typ muss auch im Konst. ausgebessert werden - T ist platzhalter kann aber uauch mehrere genommen werdne

    //private int[] array; //Attribut //Datentyp sollte Flexibel sein Daher das T
private T [] array;
    /*
    private => nur innerhalb der Klasse
   public => von überall verwendbar
   nichts =>
     */

    private int counter;
    // konstruktoren initialisieren das objekt. und sind Methoden die gleich benannt sind wie die KLasse

    public Stack(T[] array) {   //lokale Variablen können gleich benannt werden die der Konstrukteur
        this.array = array; // lokale Var. und konstrukt. Variable
        counter = 0;  //Stack ist noch leer

    }

    public void push(T value) { //flexibler -> generics
        if (counter >= array.length) {
            System.out.println("Stack is full");
            return;
        }
    else {
        array[counter] = value; //nur zur Übersicht
        counter++;
        }

    //array [counter]=value;
   // counter++;

    }

    public T pop () {
        if (counter ==0) {
          //  return -1;
            return null; // tricksen weil NULL zurück gegeben müssen weil net Int.
        }
        counter--;
        return array [counter];
    }
}
//String sind immutable - können nicht wiederverwendet werden
/* Concat ist verbinden von Strings kann man aber auch mit + machen
Methoden von String -> length() und
equals() vergleicht ob true oder false
.charAT(int index)
.toUpperCase()
.to LowerCase()
.split("Trennzeichen") liefert Array zurück aufgeteilt durch trennzeichen -> CSV Datei auftrennen zB -> . als trennzeichen nok
.compareTo(String anotherString) vergleicht 2 strings alpapethisch  miteinander -1 , 0 +2 zurück

 */
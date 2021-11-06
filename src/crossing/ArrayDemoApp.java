package crossing;

import java.lang.reflect.Array;

public class ArrayDemoApp {
    public static void main(String[] args) {

       int [] Array1 = {7,3,1};
       int [] Array2 = {1,2,3};

        for (int i = 0; i< Array1.length; i++)
        {
            System.out.println(Array1[i] + Array2[i] + ",");
        }
    }
}

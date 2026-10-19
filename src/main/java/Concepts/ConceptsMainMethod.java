package Concepts;

import java.util.Arrays;

public class ConceptsMainMethod {

    public static void main(String[] args) {

        Concepts code = new Concepts();
        //DataTypes called here...
        String output  = code.dataTypes();
        System.out.println(output);
        //Array..
        int[] arrayOut = code.arrays();
        System.out.println(Arrays.toString(arrayOut));
        //String to List using Arrays..
        code.stringToList();
        //ForLoop..
        code.forLoop();
        code.forEachLoop();
        //ArrayList..
        code.arrayList();


    }
}

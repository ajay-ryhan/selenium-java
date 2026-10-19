package Concepts;

import java.util.Arrays;

public class Master {

    public static void main(String[] args) {

        Concepts code = new Concepts();
        //DataTypes called here...
        String output  = code.dataTypes();
        System.out.println(output);
        //Array..
        int[] arrayOut = code.arrays();
        System.out.println(Arrays.toString(arrayOut));
        //ForLoop..
        code.forLoop();
        code.forEachLoop();

    }
}

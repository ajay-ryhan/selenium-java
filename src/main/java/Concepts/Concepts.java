package Concepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Concepts {

    //primitive data types
    int num = 28;
    float value = 56F;
    double price = 10.56;
    boolean present = true;

    //Non-primitive data types
    String name = "Rifana";
    char single = 'A';

    public String dataTypes() {
        return "Student " + name + " has grade " + single +
                ", age " + num +
                ", score " + value +
                ", account balance " + price +
                ", and attendance status is " + present + ".";
    }

    //Arrays..
    public int[] arrays() {
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        return array;
    }

    //For Loop..
    public void forLoop() {
            String[] names = {"Ajay", "Rifana", "Ruhaan", "Pravashi"};

            for (int i = names.length-1; i >= 0; i--) {
                    System.out.println(names[i]);
            }
    }

    //ForEachLoop..
    public void forEachLoop(){
        String[] names = {"Rudra", "John", "Cindrella", "Anamicaa"};

        for (String s : names){
            System.out.println(s);
        }
    }

    public void stringToList(){
        String[] names = {"Dhoni", "Raina","Varshini", "Hema"};
        List<String> stringList = Arrays.asList(names);
        System.out.println(stringList);
    }


    //ArrayList
    public void arrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Germany");
        arrayList.add("Columbia");
        arrayList.add("Morocco");
        arrayList.remove(2);
        arrayList.add("Palastine");
        arrayList.get(1);
        String present = arrayList.contains("Germany") ? "True" : "false";

        System.out.println(arrayList);
        System.out.println(present);
    }


}

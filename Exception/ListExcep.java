package Exception;

import java.util.ArrayList;

public class ListExcep {
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            try {
                int castedValue = (int) myList.get(i);
                System.out.println("\nValido: "+castedValue);
            } catch (ClassCastException p) {
                System.out.println("\nError: ClassCastException --> "+myList.get(i));
            }
        }
    }

}

package Cadenas;

public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        
        //Ejecicio de trimAndConcat
        String resultado = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(resultado);
        
        //Ejecicio de getIndexOrNull con caracter
        char caracter = 'n';
        int a = manipulator.getIndexOrNull("Coding", caracter);
        int b = manipulator.getIndexOrNull("Hola Mundo", caracter);
        int c = manipulator.getIndexOrNull("Saludar", caracter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1
        
        //Ejecicio de getIndexOrNull con subcadena
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int d = manipulator.getIndexOrNull(word, subString);
        int e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d);
        System.out.println(e); 
        
        // Ejecicio de concatSubstring
        String concatenado= manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(concatenado);
    }
}


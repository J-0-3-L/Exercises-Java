package Cadenas;

public class StringManipulator {
    
    public String trimAndConcat(String text, String text2) {
        return text.trim() + text2.trim();
    }
    
    public int getIndexOrNull(String message, char caracter) {
        return message.indexOf(caracter);
    }
    
    public int getIndexOrNull(String cadena, String subCadena) {
        return cadena.indexOf(subCadena);
    }
    
    public String concatSubstring(String palabra, int inicio, int fin, String palabra2) {
        String subCadena = palabra.substring(inicio, fin);
        return subCadena + palabra2;
    }
}


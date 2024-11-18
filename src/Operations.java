public class Operations {

    public static String concatenar(String str1, String str2) {
        return str1 + str2;
    }

    public static String cambiarMayusculas(String str) {
        return str.toUpperCase();
    }

    public static String cambiarMinusculas(String str) {
        return str.toLowerCase();
    }

    public static int contarCaracteres(String str) {
        return str.length();
    }

    public static String buscar(String str, String palabra, String mensajeEncontrado, String mensajeNoEncontrado) {
        if (str.contains(palabra)) {
            return mensajeEncontrado;
        } else {
            return mensajeNoEncontrado;
        }
    }

    public static String reemplazar(String str, String antiguo, String nuevo) {
        return str.replace(antiguo, nuevo);
    }

    
    public static String[] dividir(String str, String delimitador) {
        return str.split(delimitador);
    }
}



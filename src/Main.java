import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        // Leer la variable de entorno APP_LANG y seleccionar el idioma
        String appLang = System.getenv("APP_LANG");
        String language = "es"; // Idioma predeterminado
        if (appLang != null) {
            language = switch (appLang.toLowerCase()) {
                case "es" -> "es";
                case "ca" -> "ca";
                case "en" -> "en";
                default -> "en"; // Predeterminado si no se reconoce
            };
        }

        // Cargar el bundle de recursos correspondiente
        ResourceBundle messages = ResourceBundle.getBundle("messages_" + language);

        while (true) {
            // Mostrar menú usando mensajes internacionalizados
            System.out.println("\n1. " + messages.getString("menu.option1"));
            System.out.println("2. " + messages.getString("menu.option2"));
            System.out.println("3. " + messages.getString("menu.option3"));
            System.out.println("4. " + messages.getString("menu.option4"));
            System.out.println("5. " + messages.getString("menu.option5"));
            System.out.println("6. " + messages.getString("menu.option6"));
            System.out.println("7. " + messages.getString("menu.option7"));
            System.out.println("8. " + messages.getString("menu.option8"));

            System.out.print(messages.getString("prompt.select") + " ");
            int opcion = new java.util.Scanner(System.in).nextInt();

            if (opcion == 1) {
                System.out.print(messages.getString("prompt.enter_first_string") + " ");
                String cadena1 = new java.util.Scanner(System.in).nextLine();
                System.out.print(messages.getString("prompt.enter_second_string") + " ");
                String cadena2 = new java.util.Scanner(System.in).nextLine();
                System.out.println(messages.getString("result") + " " + Operations.concatenar(cadena1, cadena2));
            } else if (opcion == 2) {
                System.out.print(messages.getString("prompt.enter_string") + " ");
                String cadena = new java.util.Scanner(System.in).nextLine();
                System.out.println(messages.getString("result") + " " + Operations.cambiarMayusculas(cadena));
            } else if (opcion == 3) {
                System.out.print(messages.getString("prompt.enter_string") + " ");
                String cadena = new java.util.Scanner(System.in).nextLine();
                System.out.println(messages.getString("result") + " " + Operations.cambiarMinusculas(cadena));
            } else if (opcion == 4) {
                System.out.print(messages.getString("prompt.enter_string") + " ");
                String cadena = new java.util.Scanner(System.in).nextLine();
                System.out.println(messages.getString("result") + " " + Operations.contarCaracteres(cadena));
            }else if (opcion == 5) {
                System.out.print(messages.getString("prompt.enter_string") + " ");
                String cadena = new java.util.Scanner(System.in).nextLine();
                System.out.print(messages.getString("prompt.enter_word") + " ");
                String palabra = new java.util.Scanner(System.in).nextLine();
                String resultado = Operations.buscar(
                        cadena,
                        palabra,
                        messages.getString("message.found"),
                        messages.getString("message.not_found")
                );
                System.out.println(messages.getString("result") + " " + resultado);
            } else if (opcion == 6) {
                System.out.print(messages.getString("prompt.enter_string") + " ");
                String cadena = new java.util.Scanner(System.in).nextLine();
                System.out.print(messages.getString("prompt.enter_old_word") + " ");
                String antiguo = new java.util.Scanner(System.in).nextLine();
                System.out.print(messages.getString("prompt.enter_new_word") + " ");
                String nuevo = new java.util.Scanner(System.in).nextLine();
                System.out.println(messages.getString("result") + " " + Operations.reemplazar(cadena, antiguo, nuevo));
            } else if (opcion == 7) {
                System.out.print(messages.getString("prompt.enter_string") + " ");
                String cadena = new java.util.Scanner(System.in).nextLine();
                System.out.print(messages.getString("prompt.enter_delimiter") + " ");
                String delimitador = new java.util.Scanner(System.in).nextLine();
                String[] resultado = Operations.dividir(cadena, delimitador);
                System.out.println(messages.getString("result") + ":");
                for (String parte : resultado) {
                    System.out.println(parte);
                }
            } else if (opcion == 8) {
                System.out.println(messages.getString("message.exiting"));
                break;
            } else {
                System.out.println(messages.getString("error.invalid_option"));
            }
        }
    }
}


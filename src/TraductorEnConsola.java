import java.util.Scanner;

public class TraductorEnConsola {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("Bienvenido, selecciona una de las opiones");
        do {
            System.out.println("Seleccione una opción: \nOpción 1: Ver opciones de idiomas\nOpción 2: Traducir a un idioma\n\tOpción 0: Salir");
            option = scan.nextInt();
            scan.nextLine();

            switch (option){
                case 1:
                    mostrarOpcionesIdiomas();
                    break;
                case 2:
                    traducir(scan);
                    break;
                case 0:
                    System.out.println("Saliendo ...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while (option != 0);

        scan.close();
    }

    public static void mostrarOpcionesIdiomas() {
        System.out.println("Opciones de idiomas disponibles:");
        System.out.println("  - es: Español");
        System.out.println("  - en: Inglés");
        System.out.println("  - fr: Francés");
        System.out.println("  - de: Alemán");
        System.out.println("  - it: Italiano");
        System.out.println("  - pt: Portugués");
    }

    public static void traducir(Scanner scan) {
        System.out.print("Introduce un idioma (es, en, fr, etc.): ");
        String idioma = scan.nextLine();

        switch (idioma) {
            case "es":
                System.out.println("Hola, ¿cómo estás?");
                break;
            case "en":
                System.out.println("Hello, how are you?");
                break;
            case "fr":
                System.out.println("Bonjour, comment vas-tu?");
                break;
            case "de":
                System.out.println("Hallo, wie geht es dir?");
                break;
            case "it":
                System.out.println("Ciao, come stai?");
                break;
            case "pt":
                System.out.println("Olá, como você está?");
                break;
            default:
                System.out.println("No tengo un saludo para ese idioma. Lo siento!");
        }
    }
}

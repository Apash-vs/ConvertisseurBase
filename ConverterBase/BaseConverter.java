import java.util.Scanner;

public class BaseConverter {

    public static String convertirBase(String nombre, int baseDepart, int baseArrivee) {
        int nombreDecimal = Integer.parseInt(nombre, baseDepart);
        String nombreConverti = "";
        
        switch(baseArrivee) {
            case 2:
                nombreConverti = Integer.toBinaryString(nombreDecimal);
                break;
            case 10:
                nombreConverti = Integer.toString(nombreDecimal);
                break;
            case 16:
                nombreConverti = Integer.toHexString(nombreDecimal);
                break;
            default:
                System.out.println("Base d'arrivée invalide.");
        }
        
        return nombreConverti;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre à convertir : ");
        String nombre = scanner.nextLine();

        System.out.print("Entrez la base de départ (2 pour binaire, 10 pour décimal, 16 pour hexadécimal) : ");
        int baseDepart = scanner.nextInt();

        System.out.print("Entrez la base d'arrivée (2 pour binaire, 10 pour décimal, 16 pour hexadécimal) : ");
        int baseArrivee = scanner.nextInt();

        String nombreConverti = convertirBase(nombre, baseDepart, baseArrivee);

        System.out.println("Le nombre converti est : " + nombreConverti);
    }
}

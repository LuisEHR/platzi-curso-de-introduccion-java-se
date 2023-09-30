import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;

        do {
            System.out.print("Selecciona el número de la opción deseada:" +
                    "\n 1. Movies" +
                    "\n 2. Series" +
                    "\n 0. Salir\n");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos.");
                    break;
                case 1:
                    System.out.println("Movies.");
                    break;
                case 2:
                    System.out.println("Series.");
                    break;
                default:
                    System.out.println("Selecciona una opción valida.");
                    break;
            }
        } while (response != 0);

        System.out.println("Adios");
    }
}

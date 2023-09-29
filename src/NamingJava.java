            // Upper Camel Case
public class NamingJava {
    public static void main(String[] args) {
        /*
        * Convención de nombre en Java:
        *   - Sensible de mayúsculas y minisculas
        *   - Los nombre deben comenzar con una letra, "$" o "_"
        *   - Letras posteriores pueden ser letras, números, "$" y "_"
        *   - Las constantes se escriben en mayúsculas y contienen "_"
        *   - Por convención se debe usar la técnica de "Camel Case" (Upper o Lower Camel Case)
        *   - Upper Camel Case:  Para clases
        *   - Lower Camel Case: Para variables y metodos
        * */
        int celphone = 12345;
        int celPhone = 67890;
        System.out.println("celphone = " + celphone);
        System.out.println("celPhone = " + celPhone);

        String $countryName = "Spain";
        String _backgroundColor = "Green";

        // Constantes naming
        String currency$ = "MXN";
        String background_color = "Purple";

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        // Lower Camel Case
        String fullName = "Luis Enrique Hernandez Robledo";
        int sizeInCentimeters = 26;
    }
}

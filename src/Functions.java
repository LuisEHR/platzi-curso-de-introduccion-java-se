public class Functions {
    public static void main(String[] args) {
        double r = 3;
        int quantityMXN = 200, quantityCOP = 1000;

        System.out.println(circleArea(r));
        System.out.println(sphereArea(r));
        System.out.println(sphereVolume(r));
        System.out.println(quantityMXN + " MXN a USD: " + convertToUSD(quantityMXN, "MXN"));
        System.out.println(quantityCOP + " COP a USD: " + convertToUSD(quantityCOP, "COP"));
    }

    /**
     * Funcion para obtener el area de una circulo segun el radio especificado.
     * @author Luis Hernandez
     * @param radio Radio del circulo
     * @return Area del circulo
     */
    public static double circleArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Funcion para obtener el area de una esfera segun el radio especificado.
     * @author Luis Hernandez
     * @param radio Radio de la esfera
     * @return Area de la esfera
     */
    public static double sphereArea(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    /**
     * Funcion para obtener el volumen de una esfera segun el radio especificado.
     * @author Luis Hernandez
     * @param radio Radio de la esfera
     * @return Volumen de la esfera
     */
    public static double sphereVolume(double radio) {
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }

    /**
     * Función para convertir una cantidad de dinero a USD, segun el currency especificado.
     * Los currency aceptados son:
     * <ul>
     *     <li><b>MXN</b> (Peso Mexicano)</li>
     *     <li><b>COP</b> (Peso Colombiano)</li>
     * </ul>
     * @author Luis Hernandez
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda
     * @return quantity Devuelve la cantidad de dinero en USD
     */
    public static double convertToUSD(double quantity, String currency) {
        switch (currency){
            case "MXN":
                quantity *= 0.057;
                break;
            case "COP":
                quantity *= 0.00025;
                break;
        }

        return quantity;
    }
}

public class Casting {
    public static void main(String[] args) {
        // En un año ubique 30 perritos
        // ¿Cuantos perritos ubique al mes?
        double monthlyDogs = 30.0/12.0;

        // Estimación
        int estimatedmonthlyDogs = (int) monthlyDogs; // Se trunca el valor
        System.out.println("estimatedmonthlyDogs = " + estimatedmonthlyDogs);

        // Exactitud
        int a = 30, b = 12;
        System.out.println((double) a / b);

        // Mas sobre el casting
        double c = a / b; // int / int
        c = (double) a / b; // Cast
        System.out.println("c = " + c);

        char n = '1';
        int nInt = n;
        System.out.println("nInt = " + nInt);

        short nShort = (short) n;
        System.out.println("nShort = " + nShort);
    }
}

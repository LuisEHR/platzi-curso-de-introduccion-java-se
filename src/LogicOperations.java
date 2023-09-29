public class LogicOperations {
    public static void main(String[] args) {
        int a = 8, b = 5;

        // Operadores de asignación
        System.out.println("a es igual que b? -> " + (a == b));
        System.out.println("a es diferente que b? -> " + (a != b));

        // Operadores relacionales
        System.out.println("a es menor que b? -> " + (a < b));
        System.out.println("a es mayor que b? -> " + (a > b));
        System.out.println("a es menor/igual que b? -> " + (a <= b));
        System.out.println("a es mayor/igual que b? -> " + (a >= b));

        if (a == b) {
            System.out.println("==");
        } else if (a != b) {
            System.out.println("!=");
        } else if (a < b) {
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");
        } else if (a <= b) {
            System.out.println("<=");
        } else if (a >= b) {
            System.out.println(">=");
        }
    }
}

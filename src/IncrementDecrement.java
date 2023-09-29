public class IncrementDecrement {
    public static void main(String[] args) {
        /*
        * a = a + b     ->      a += b
        * a = a - b     ->      a -= b
        * a = a * b     ->      a *= b
        * a = a / b     ->      a /= b
        * a = a % b     ->      a %= b
        * a = a + 1     ->      a++
        * a = a - 1     ->      a--
        * */
        // Ejemplo con Mario Bross
        int lives = 5;
        
        // Decremento: lives = lives - 1
        lives--;
        System.out.println("lives = " + lives); // 4
        
        // Incremento: lives = lives + 1
        lives++;
        System.out.println("lives = " + lives); // 5

        // Pre-incremento y decremento
        int gift = 100 + ++lives; // Regalo por ganar un vida
        System.out.println("gift = " + gift); // 6
    }
}

public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        System.out.println("salary = " + salary);

        // Bono: $200
        salary += 200;
        System.out.println("salary con bono = " + salary);

        // Pension: -$50
        salary -= 50;
        System.out.println("salary menos pension = " + salary);

        // 2 horas extras $30 c/u ($60)
        // Cupon de comida: -$45
        salary += 60;
        salary -= 45;
        System.out.println("salary mas horas extras, menos cupon comida = " + salary);

        // Actualizar cadenas de texto
        String employeeName = "Enrique Hernandez";
        employeeName += " Robledo";
        System.out.println("employeeName = " + employeeName);

        employeeName = "Luis " + employeeName;
        System.out.println("employeeName = " + employeeName);
    }
}

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSended++;
            System.out.println(isBluetoothEnabled + " :File sent");
        } else {
            System.out.println("Bluetooth is disabled");
        }

        System.out.println("fileSended = " + fileSended);
    }
}

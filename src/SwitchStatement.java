public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Light Mode");
                break;
            case "Night":
                System.out.println("Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Dark Mode");
                break;
            default:
                System.out.println("Default Mode");
                break;
        }
    }
}

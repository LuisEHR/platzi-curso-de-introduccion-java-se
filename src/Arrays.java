public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[4];
        String[] days = new String[7];
        String[][] cities = new String[4][2];
        int [][][] numbers = new int[2][2][2];
        int [][][][] moreNumbers = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println("androidVersions[" + i + "]: " + androidVersions[i]);
        }

        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }

        cities[0][0] = "Mexico";
        cities[0][1] = "CDMX";
        cities[1][0] = "Mexico";
        cities[1][1] = "Guadalajara";
        cities[2][0] = "Colombia";
        cities[2][1] = "Bogota";
        cities[3][0] = "Colombia";
        cities[3][1] = "Medellín";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println("cities[" + i + "][" + j + "]: " + cities[i][j]);
            }
        }

        for (String[] pair: cities) {
            for(String name: pair) {
                System.out.println(name);
            }
        }

    }
}

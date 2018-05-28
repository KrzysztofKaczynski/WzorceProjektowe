package game;

public class Main {
    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new Swamp(new Hill());
//        Terrain terrain3 = new SwampForestPlain();

        System.out.println("Swamp hill cost" + terrain2);
    }
}
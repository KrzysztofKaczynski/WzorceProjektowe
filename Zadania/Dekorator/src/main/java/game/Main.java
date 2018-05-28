package game;

public class Main {
    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new Swamp(new Hill());
        Terrain terrain3 = new Swamp(new ForestDecorator(new Plain()));
        Terrain terrain4 = new RoadDecorator(new Hill());
        System.out.println("Swamp hill cost" + terrain2.fuelCost());
        System.out.println("Swap forest plain cost" + terrain3.fuelCost());
        System.out.println(terrain4.getDescription() + "" + terrain3.fuelCost());
    }
}
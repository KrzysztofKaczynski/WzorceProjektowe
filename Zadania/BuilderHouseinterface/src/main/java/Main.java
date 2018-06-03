import house_builder.BigHouseBuilder;
import house_builder.House;
import house_builder.HouseDirector;
import house_builder.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallhouseDirector = new HouseDirector(smallHouseBuilder);
        smallhouseDirector.buildHouse();

        HouseDirector bighouseDirector = new HouseDirector(bigHouseBuilder);
        bighouseDirector.buildHouse();

        House smallHouse = smallhouseDirector.getHouse();
        House bigHouse = bighouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }
}

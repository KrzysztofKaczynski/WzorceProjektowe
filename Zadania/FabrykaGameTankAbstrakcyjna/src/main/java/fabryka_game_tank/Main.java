package fabryka_game_tank;

import fabryka_game_tank.Units.InfantryFactory;
import fabryka_game_tank.Units.InfantryUnit;
import fabryka_game_tank.Units.RedInfantryUnitFactory;
import fabryka_game_tank.Units.UnitType;

public class Main {
    public static void main(String[] args) {

        InfantryFactory factory = new RedInfantryUnitFactory();

        InfantryUnit tank = factory.createUnit(UnitType.TANK);
        InfantryUnit rifleman = factory.createUnit(UnitType.RIFLEMAN);

    }
}

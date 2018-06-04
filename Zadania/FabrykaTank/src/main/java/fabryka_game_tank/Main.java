package fabryka_game_tank;

import fabryka_game_tank.Units.Factory;
import fabryka_game_tank.Units.Unit;
import fabryka_game_tank.Units.UnitFactory;
import fabryka_game_tank.Units.UnitType;

public class Main {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

    }
}

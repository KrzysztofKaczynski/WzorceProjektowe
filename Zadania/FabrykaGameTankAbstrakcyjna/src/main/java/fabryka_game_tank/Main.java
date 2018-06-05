package fabryka_game_tank;

import fabryka_game_tank.Units.*;

public class Main {
    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit redTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);

        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);
    }
}

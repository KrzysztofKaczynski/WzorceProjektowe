package flayweight.gameRTS;

public class UnitStatsRepository {

    private static DestroyerUnitStats destroyerStats = new DestroyerUnitStats
            ("Destroyer", 500, 250, 70, 10,  800 );
    private static RiflemanUnitsStats riflemanStats = new RiflemanUnitsStats
            ("Rifleman", 25, 5, 20,25,50);
    private static TeslaTankUnitStats teslaTankStats = new TeslaTankUnitStats
            ("TeslaTank", 200, 100, 50, 25, 500);


        private UnitStatsRepository() { }

    public static DestroyerUnitStats getDestroyerStats() {
        return destroyerStats;
    }
    public static RiflemanUnitsStats getRiflemanStats() {
        return riflemanStats;
    }
    public static TeslaTankUnitStats getTeslaTankStats() {
        return teslaTankStats;
    }
    }

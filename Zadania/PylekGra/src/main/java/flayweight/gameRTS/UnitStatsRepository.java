package flayweight.gameRTS;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats
            ("Destroyer", 500, 250, 70, 10,  800 );
    private static UnitStats riflemanStats = new UnitStats
            ("Rifleman", 25, 5, 20,25,50);
    private static UnitStats teslaTankStats = new UnitStats
            ("TeslaTank", 200, 100, 50, 25, 500);


        private UnitStatsRepository() { }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }
    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }
    public static UnitStats getTeslaTankStats() {
        return teslaTankStats;
    }
    }

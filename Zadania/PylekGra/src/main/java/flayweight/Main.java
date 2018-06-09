package flayweight;

import flayweight.gameRTS.Destroyer;
import flayweight.gameRTS.Rifleman;
import flayweight.gameRTS.TeslTank;

import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        List<Object>activeUnits = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            activeUnits.add(new TeslTank("TeslaTank", 200, 100, 50, 25, 0,0, 500));
            activeUnits.add(new Rifleman("Rifleman", 25, 5, 20,25,0,0,50));
            activeUnits.add(new Destroyer("Destroyer", 500, 250, 70, 10, 0, 0, 800));


        }
    }
}

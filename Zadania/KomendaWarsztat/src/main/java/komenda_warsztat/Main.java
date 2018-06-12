package komenda_warsztat;

import komenda_warsztat.workshop.Robot;
import komenda_warsztat.workshop.WorkShopApp;

public class Main {

    public static void main(String[] args) {
        WorkShopApp workShopApp = new WorkShopApp(new Robot());
        workShopApp.run();
    }
}

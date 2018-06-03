package app_setings;

public class Main {

    public static void main(String[] args) {

        AppSettings game = AppSettings.getInstance();

        game.play();

        int score = game.getScore();

        AppSettings anotherGameReference = AppSettings.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }

    }

}
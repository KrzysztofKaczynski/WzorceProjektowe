package pylek_szachy.figury;

public class ColorRepository {

    /**
     * utworzone zostaną dwa obiekty typu Color :
     */

    static Color white = new Color(0, 0, 0);
    static Color black = new Color(255, 255, 255);

    /**
     *Klasa ta powinna mieć również dwie publiczne metody:
     * getBlack() oraz getWhite()
     * zwracające odpowiedni obiekt typu Color  (jednak nie nowy, lecz ten utworzony w repozytorium).
     */

    public static Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }

    private ColorRepository()

    {

    }
}

package memento_smartApp.smart_app;

import java.util.List;
import java.util.ArrayList;

public class SmartAppCaretaker {

    private List<SmartAppMemento> mementos = new ArrayList<SmartAppMemento>();

    public void addMemento(SmartAppMemento smartAppMemento) {
        mementos.add(smartAppMemento);
        System.out.println("Zapisana wersja: " + smartAppMemento.getVersion() + "znajduje się pod indeksem: "
                + (mementos.size() - 1));
    }

    public SmartAppMemento getMemento(int index) {
        System.out.println("Wczytaj wersję: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }


}

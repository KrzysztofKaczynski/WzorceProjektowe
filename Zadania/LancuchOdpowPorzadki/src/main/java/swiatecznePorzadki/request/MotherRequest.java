package swiatecznePorzadki.request;

import swiatecznePorzadki.children.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public Shelf getShelf() {
        return shelf;
    }

    public MotherRequest(Shelf shelf) {

        this.shelf = shelf;
    }
}

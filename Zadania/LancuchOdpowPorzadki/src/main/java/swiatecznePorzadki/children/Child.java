package swiatecznePorzadki.children;

import swiatecznePorzadki.request.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    Child getTallerChild() {
        return tallerChild;
    }


    public void setTallerChild(Child child) {

    }
}

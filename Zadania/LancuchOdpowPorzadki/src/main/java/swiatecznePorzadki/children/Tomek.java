package swiatecznePorzadki.children;

import swiatecznePorzadki.request.MotherRequest;

public class Tomek extends Child {


    @Override
    public void processRequest(MotherRequest motherRequest){

        if(motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println("Tomek zdjeła słoik z półki ");
        }else {
            getTallerChild().processRequest(motherRequest);
        }

    }
}

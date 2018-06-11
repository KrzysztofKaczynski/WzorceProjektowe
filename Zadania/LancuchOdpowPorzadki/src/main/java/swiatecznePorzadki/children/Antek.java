package swiatecznePorzadki.children;

import swiatecznePorzadki.request.MotherRequest;

public class Antek extends Child{

    @Override
    public void processRequest(MotherRequest motherRequest){

        if(motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println("Antek zdjeła słoik z półki ");
        }else {
            getTallerChild().processRequest(motherRequest);
        }

    }
}

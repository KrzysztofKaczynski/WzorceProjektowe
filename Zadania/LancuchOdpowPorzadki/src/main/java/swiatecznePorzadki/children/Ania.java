package swiatecznePorzadki.children;

import swiatecznePorzadki.request.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest){

        if(motherRequest.getShelf().equals(Shelf.LOW)){
            System.out.println("Ania zdjeła słoik z półki ");
        }else {
            getTallerChild().processRequest(motherRequest);
        }

    }


}

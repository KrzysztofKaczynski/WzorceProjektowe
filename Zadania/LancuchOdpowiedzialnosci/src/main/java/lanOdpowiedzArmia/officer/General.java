package lanOdpowiedzArmia.officer;

import lanOdpowiedzArmia.message.Message;

public class General extends Officer {

    private static final int CODE = 100;
    private static final String NAME = "General Zaborksi";



    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL)
                && message.getCode()== CODE){
            System.out.println(NAME + "otrzymał wiadomość: "+ message.getContent());
        }else {
            System.out.println("Zły adresat wiadomości lub zły kod szyfrujący");
        }

    }
}

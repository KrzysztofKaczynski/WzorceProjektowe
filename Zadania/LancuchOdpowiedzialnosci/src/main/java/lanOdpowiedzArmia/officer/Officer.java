package lanOdpowiedzArmia.officer;

import lanOdpowiedzArmia.message.Message;

public abstract class Officer {

    private Officer superiorOfficer;

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }

    public Officer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }

    public Officer getSuperiorOfficer() {

        return superiorOfficer;
    }

    public abstract void processMessage(Message message);
/**
    private boolean sergeant;
    private boolean captain;
    private boolean general;

    public void receiveMessage(Message message){
        if(sergeant){
            System.out.println("Sierzant otrzymał wiadomość: " + message.getContent());
        }
        else if (captain){
            System.out.println("Kapitan otrzymał wiadomość: " + message.getContent());
        }
        else if (general){
            System.out.println("Generał otrzymał wiadomość: " + message.getContent());
        }
        else {
            System.out.println("Zły adresat wiadomośći!");
        }
    }

    public void setSergeant(boolean sergeant) {
        this.sergeant = sergeant;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }
 */
}

package lanOdpowiedzArmia.message;

import lanOdpowiedzArmia.officer.OfficerRank;

public class Message {

    private String content;
    private int code;
    private OfficerRank officerRank;

    public Message(String content, int code, OfficerRank officerRank) {
        this.content = content;
        this.code = code;
        this.officerRank = officerRank;
    }

    public int getCode() {
        return code;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }

    public String getContent() {
        return content;
    }

    public Message(String content) {

        this.content = content;
    }
}

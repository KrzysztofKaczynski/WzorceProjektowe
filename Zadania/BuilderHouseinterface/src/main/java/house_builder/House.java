package house_builder;

public class House {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String widows;
    private String doors;
    private String garage;


    public String getWalls() {

        return walls;
    }


    public String getFloors() {
        return floors;
    }


    public String getRooms() {
        return rooms;
    }


    public String getRoof() {
        return roof;
    }


    public String getWidows() {
        return widows;
    }


    public String getDoors() {
        return doors;
    }


    public String getGarage() {
        return garage;
    }


    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", widows='" + widows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }


    }




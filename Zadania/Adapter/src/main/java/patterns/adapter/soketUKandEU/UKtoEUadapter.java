package patterns.adapter.soketUKandEU;

public class UKtoEUadapter implements EUDevice {

    UKDevice device;

    public UKtoEUadapter(UKDevice device) {
        this.device = device;
    }

    public void on() {
        device.powerOn();
    }
}
package adapter.soketUKandEU;

public class TwoWayAdapter implements UKDevice, EUDevice{

    UKDevice ukDevice;
    EUDevice euDevice;

    public TwoWayAdapter(UKDevice ukDevice, EUDevice euDevice) {
        this.ukDevice = ukDevice;
        this.euDevice = euDevice;
    }

    public void on() {
        ukDevice.powerOn();
    }

    public void powerOn() {
        euDevice.on();
    }
}

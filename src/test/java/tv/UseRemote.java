package tv;

public class UseRemote {
    public static void main(String[] args) {

        //================ on
        ElectronicDevice myRemote = TvRemote.getDevice();
        TurnTvOn onCommand = new TurnTvOn(myRemote);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //================== off
        TurnTvOff offCommand = new TurnTvOff(myRemote);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();
    }
}

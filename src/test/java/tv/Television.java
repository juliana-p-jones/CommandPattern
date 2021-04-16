package tv;

public class Television implements ElectronicDevice{

    @Override
    public void on() {
        System.out.println("TV is on!");
    }

    @Override
    public void off() {
        System.out.println("TV is off.");
    }
}

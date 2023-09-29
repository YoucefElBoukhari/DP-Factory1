// WindowsDialog.java
public class FireMaker extends MarioMaker {
    public Mario createButton() {
        return new CapeMario();
    }

    @Override
    public Mario createMario() {
        return null;
    }
}

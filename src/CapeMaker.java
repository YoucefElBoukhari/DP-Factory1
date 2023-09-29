// WebDialog.java
public class CapeMaker extends MarioMaker {
    public Mario createButton() {
        return new FireMario();
    }

    @Override
    public Mario createMario() {
        return null;
    }
}

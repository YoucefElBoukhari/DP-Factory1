// Dialog.java
public abstract class MarioMaker {
    public abstract Mario createMario();

    public void operation() {
        Mario okMario = createMario();
        okMario.name();
        okMario.jump();
        okMario.run();
    }
}

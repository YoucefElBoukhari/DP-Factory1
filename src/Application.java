// Application.java
public class Application {
    private MarioMaker marioMaker;

    public void initialize(String marioType) {
        if (marioType.equals("Fire")) {
            marioMaker = new FireMaker();
        } else if (marioType.equals("Cape")) {
            marioMaker = new CapeMaker();
        } else {
            throw new IllegalArgumentException("Erreur ! Type de Mario inconnu.");
        }
    }
    public void run() {
        Mario okMario = marioMaker.createMario();

        if (okMario != null) {
            String name = okMario();
            System.out.println("Nom de Mario : " + marioName);
        } else {
            System.out.println("L'objet Mario n'a pas été créé correctement.");
        }
    }



    public static void main(String[] args) {
        Application app = new Application();
        app.initialize("Fire"); // Choisissez le type de Mario ici.
        app.run();
    }
}

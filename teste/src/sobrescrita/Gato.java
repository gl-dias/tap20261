package sobrescrita;

public class Gato extends Animal {
    /**
     * emite som de gato.
     */
    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}

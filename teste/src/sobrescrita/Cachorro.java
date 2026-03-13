package sobrescrita;

public class Cachorro extends Animal {
    /**
     * emite som de cachorro.
     */
    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
}

package sobrescrita;

public class TestePolimorfismo {
    private static void main(final String[] args) {
        Animal meuAnimal1 = new Cachorro();
        Animal meuAnimal2 = new Gato();

        meuAnimal1.emitirSom(); // "Au au"
        meuAnimal2.emitirSom(); // "Miau"
    }
}

package sobrecarga;

public class TesteSobrecarga {
    private static void main(final String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somarDoisInteiros(2, 1)); // Chama o 1° método
        System.out.println(calc.somarTresInteiros(2, 1, 2)); // Chama o 2°método
        System.out.println(calc.somarDecimais(2.0, 1.0)); // Chama o 3° método

    }
}

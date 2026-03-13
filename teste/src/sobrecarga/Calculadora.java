package sobrecarga;
public class Calculadora {

    /**
     *
     * @param a
     * @param b
     * @return // a+b
     */
    public int somarDoisInteiros(final int a, final int b) {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return // a+b+c
     */
    public int somarTresInteiros(final int a, final int b, final int c) {
        return a + b + c;
    }

    /**
     *
     * @param a
     * @param b
     * @return // a+b decimais
     */
    public double somarDecimais(final double a, final double b) {
        return a + b;
    }
}

public class Ejem6<T, U> {

    private final T primerElemento;
    private final U segundoElemento;

    public Ejem6(T obj1, U obj2) {
        this.primerElemento = obj1;
        this.segundoElemento = obj2;
    }

    public void operar(int operacion) {
        if (primerElemento instanceof Boolean || segundoElemento instanceof Boolean) {
            System.out.println("No se pueden realizar operaciones con Boolean.");
            return;
        }

        if (sonCompatiblesConTexto(primerElemento) && sonCompatiblesConTexto(segundoElemento)) {
            if (operacion == 4) {
                System.out.println("Resultado: " + String.valueOf(primerElemento) + String.valueOf(segundoElemento));
            } else {
                System.out.println("Con cadenas o caracteres solo se puede concatenar.");
            }
            return;
        }

        if (primerElemento instanceof Number && segundoElemento instanceof Number) {
            procesarNumeros(((Number) primerElemento).doubleValue(), ((Number) segundoElemento).doubleValue(), operacion);
            return;
        }

        System.out.println("Los tipos de datos no son compatibles.");
    }

    private boolean sonCompatiblesConTexto(Object valor) {
        return valor instanceof CharSequence || valor instanceof Character;
    }

    private void procesarNumeros(double a, double b, int op) {
        if (op == 1) {
            System.out.println("Resultado: " + (a - b));
        } else if (op == 2) {
            System.out.println("Resultado: " + (a + b));
        } else if (op == 3) {
            System.out.println("Resultado: " + (a * b));
        } else {
            System.out.println("Operacion no valida.");
        }
    }
}
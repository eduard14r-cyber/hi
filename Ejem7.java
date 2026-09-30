import java.util.Scanner;

public class Ejem7<T, U> {

    private T valor1;
    private U valor2;

    public Ejem7(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        verificatipo();
    }

    public T getValor1() {
        return valor1;
    }

    public U getValor2() {
        return valor2;
    }

    public void setValor1(T valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(U valor2) {
        this.valor2 = valor2;
    }

    public void verificatipo() {
        if (valor1 == null || valor2 == null || valor1.getClass() != valor2.getClass()) {
            System.out.println("Los valores son de tipos diferentes");
            return;
        }

        String nombreTipo = valor1.getClass().getSimpleName();

        switch (nombreTipo) {
            case "String":
                concatenar();
                break;
            case "Boolean":
            case "Character":
                System.out.println("Ambos valores son de tipo " + nombreTipo);
                break;
            case "Integer":
            case "Double":
            case "Float":
                operaciones();
                break;
            default:
                System.out.println("Los valores son de tipos diferentes");
                break;
        }
    }

    private void concatenar() {
        StringBuilder union = new StringBuilder();
        union.append("La concatenacion es: ").append(valor1).append(valor2);
        System.out.println(union.toString());
    }

    public void operaciones() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Menu de operaciones\n1. Sumar\n2. Restar\n3. Multiplicar\nQue operacion desea realizar?: ");
        int eleccion = lector.nextInt();

        if (eleccion < 1 || eleccion > 3) {
            System.out.println("Opcion no valida");
            return;
        }

        Number n1 = (Number) valor1;
        Number n2 = (Number) valor2;

        if (valor1 instanceof Integer) {
            int a = n1.intValue();
            int b = n2.intValue();
            int res = (eleccion == 1) ? (a + b) : (eleccion == 2) ? (a - b) : (a * b);
            String etiqueta = (eleccion == 1) ? "suma" : (eleccion == 2) ? "resta" : "multiplicacion";
            System.out.println("La " + etiqueta + " es: " + res);
        } else if (valor1 instanceof Double) {
            double a = n1.doubleValue();
            double b = n2.doubleValue();
            double res = (eleccion == 1) ? (a + b) : (eleccion == 2) ? (a - b) : (a * b);
            String etiqueta = (eleccion == 1) ? "suma" : (eleccion == 2) ? "resta" : "multiplicacion";
            System.out.println("La " + etiqueta + " es: " + res);
        } else if (valor1 instanceof Float) {
            float a = n1.floatValue();
            float b = n2.floatValue();
            float res = (eleccion == 1) ? (a + b) : (eleccion == 2) ? (a - b) : (a * b);
            String etiqueta = (eleccion == 1) ? "suma" : (eleccion == 2) ? "resta" : "multiplicacion";
            System.out.println("La " + etiqueta + " es: " + res);
        }
    }

    public void mostrarValores() {
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
}
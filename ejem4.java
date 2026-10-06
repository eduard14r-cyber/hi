public class ejem4<T> {
    T valor;

    public ejem4(T valor) {
        this.valor = valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void mostrarValor() {
        System.out.println("El tipo de valor es: " + valor.getClass().getName());
        System.out.println("El valor es: " + valor);
    }

    public static void main(String[] args) {
        ejem4<Integer> obj1 = new ejem4<>(10);
        obj1.mostrarValor();

        ejem4<String> obj2 = new ejem4<>("Hola");
        obj2.mostrarValor();

        ejem4<Double> obj3 = new ejem4<>(3.14);
        obj3.mostrarValor();
    }
}

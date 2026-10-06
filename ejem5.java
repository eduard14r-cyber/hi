public class ejem5<T, U> {
    private T valor1;
    private U valor2;
    public ejem5(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public void mostrarValores() {
        System.out.println("Valor 1: " + valor1.getClass().getName()+"y");
        System.out.println("Valor 2: " + valor2.getClass().getName()+"y");
    }

    public static void main(String[] args) {
        ejem5<Integer, String> obj1 = new ejem5<>(10, "Hola");
        obj1.mostrarValores();

        ejem5<Double, Boolean> obj2 = new ejem5<>(3.14, true);
        obj2.mostrarValores();

        ejem5<Character, Float> obj3 = new ejem5<>('A', 2.5f);
        obj3.mostrarValores();

        ejem5<String, String> obj4 = new ejem5<>("Hola", "Mundo");
        obj4.mostrarValores();
    }

    
}
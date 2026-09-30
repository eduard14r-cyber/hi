import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practica2 {

    static class Dato {
        private String nombre;
        private int edad;
        private String correo;

        public Dato(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }

        public String getNombre() { return nombre; }
        public int getEdad() { return edad; }
        public String getCorreo() { return correo; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Dato> lista = new ArrayList<>();

        System.out.print("¿Cuántas personas deseas capturar? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Persona " + i + " ---");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.print("Correo: ");
            String correo = sc.nextLine();

            lista.add(new Dato(nombre, edad, correo));
        }

        System.out.println("\n=== DATOS CAPTURADOS ===");
        for (Dato persona : lista) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Correo: " + persona.getCorreo());
            System.out.println();
        }

        sc.close();
    }
}
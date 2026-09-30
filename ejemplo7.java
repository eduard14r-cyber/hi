import java.util.Scanner;

public class ejemplo7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] arreglo1 = new int[]{6, 7, 8, 9, 10};
        int[] arreglo2 = new int[5];
        int valor;

        System.out.println("Ingrese 5 números para llenar el arreglo2:");

        int i = 0;
        while (i < arreglo2.length) {
            System.out.print("Número " + (i + 1) + ": ");
            valor = teclado.nextInt();
            arreglo2[i] = valor;
            i++;
        }

        System.out.println("\nLos números guardados en arreglo2 son:");
        int j = 0;
        while (j < arreglo2.length) {
            System.out.println(arreglo2[j]);
            j++;
        }

        teclado.close();
    }
}
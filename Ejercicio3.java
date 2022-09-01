
// PROBLEMA 3:
// Crear métodos:
// • ingresar(): que permitan ingresar los n enteros de
// un arreglo
// • modificar(): que modifique multiplicando por 2 sus
// elementos e
// • imprimir() para imprimir sus elementos.
// Los métodos deben permitir trabajar con arreglos
// unidimensionales de cualquier tamaño. Crear un
// main() que pruebe dichos métodos
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tam;
        System.out.println("¿Cuántos elementos desea guardar?");
        tam = scan.nextInt();
        int[] a = new int[tam];
        ingresar(a);
        System.out.println("Valores guardados:");
        imprimir(a);
        modificar(a);
        System.out.println("Modificación de los valores guardados:");
        imprimir(a);
        scan.close();
    }
    // Permite ingresar los valores del arreglo
    public static void ingresar(int[] arreglo) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("¿Qué número desea guardar en esta posición (" + i + ")?:");
            arreglo[i] = scan.nextInt();
        }
        scan.close();
    }
    // Se modificara cada valor al ser multiplicados por dos
    public static void modificar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] *= 2;
        }
    }
    // Se mostrara el valor que toma un elemento del arreglo
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor de la posicion " + i + ": " + arreglo[i]);
        }
    }
}

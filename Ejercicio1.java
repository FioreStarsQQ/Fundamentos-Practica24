// PROBLEMA 1:
// Programa con un método que devuelva la suma de
// todos los elementos de un arreglo de enteros. Crear
// un main con un arreglo con datos inicializados y
// usarlo para validar el método

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] a = { 30, 10, 30, 50, 20 };
        // Muestra la suma de los elementos del arreglo, se usa el metodo suma()
        System.out.println("Resultado de la suma de los elementos del arreglo: " + suma(a));
    }

    public static int suma(int[] num) {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            // Acumula la suma de valores
            suma += num[i];
        }
        // Devuelve la suma de todos los elementos del arreglo
        return suma;
    }
}
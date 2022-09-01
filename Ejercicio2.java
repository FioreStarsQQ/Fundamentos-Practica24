
// PROBLEMA 2:
// Sumar 2 arreglos unidimensionales de tamaño 10
// con valores de notas aleatorias que vayan entre
// 0..20 y almacenar la suma en un nuevo arreglo.
// Luego que imprima los valores de la suma:
// “x + y = z”.
// Crear métodos generar(), sumar(), imprimir(),
// import java.text.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        final int tamaño = 10;
        double[] x = new double[tamaño];
        double[] y = new double[tamaño];
        double[] z = new double[tamaño];
        // Bucle para repetir la asignacion de valores y su suma
        for (int i = 0; i < x.length; i++) {            
            x[i] = generar(0.0, 20.0);
            y[i] = generar(0.0, 20.0);            
            z[i] = (double) Math.round(sumar(x,y,i)*100)/100;
            imprimir(x, y, z, i);
        }
    }
    // Genera un numero aleatorio de un rango especificado
    public static double generar(double min, double max) {
        return (double) Math.round(((Math.random() * (max - min + 0.01)) + min)*100)/100;
    }
    // Suma dos arreglos de la misma posicion
    public static double sumar(double[] a, double[] b, int posicion) {
        return a[posicion] + b[posicion];
    }
    // muestra los arreglos que se encuentran en la misma posicon y la suma de sus valores
    public static void imprimir(double[] a, double[] b, double[] c, int posicion) {
        System.out.println(a[posicion] + " + " + b[posicion] + " = " + c[posicion]);
    }
}

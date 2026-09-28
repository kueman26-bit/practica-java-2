import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese ventas del vendedor 1: ");
        double ventas1 = sc.nextDouble();

        System.out.print("Ingrese ventas del vendedor 2: ");
        double ventas2 = sc.nextDouble();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(ventas1 + " es mayor que " + ventas2 + ": " + (ventas1 > ventas2));
        System.out.println(ventas1 + " es menor que " + ventas2 + ": " + (ventas1 < ventas2));
        System.out.println(ventas1 + " es mayor o igual que " + ventas2 + ": " + (ventas1 >= ventas2));
        System.out.println(ventas1 + " es menor o igual que " + ventas2 + ": " + (ventas1 <= ventas2));
        System.out.println(ventas1 + " es igual a " + ventas2 + ": " + (ventas1 == ventas2));
        System.out.println(ventas1 + " es diferente de " + ventas2 + ": " + (ventas1 != ventas2));
        System.out.println();

        // Conclusión de quién vendió más
        if (ventas1 > ventas2) {
            System.out.println("El vendedor 1 realizó más ventas.");
        } else if (ventas2 > ventas1) {
            System.out.println("El vendedor 2 realizó más ventas.");
        } else {
            System.out.println("Ambos vendedores realizaron las mismas ventas.");
        }

        // Cálculo de la diferencia
        double diferencia = Math.abs(ventas1 - ventas2);
        System.out.println("La diferencia es: S/ " + diferencia);

        sc.close();
    }
}
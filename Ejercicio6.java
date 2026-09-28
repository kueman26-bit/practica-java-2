import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese producción de la fábrica 1: ");
        int prod1 = sc.nextInt();

        System.out.print("Ingrese producción de la fábrica 2: ");
        int prod2 = sc.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(prod1 + " es mayor que " + prod2 + ": " + (prod1 > prod2));
        System.out.println(prod1 + " es menor que " + prod2 + ": " + (prod1 < prod2));
        System.out.println(prod1 + " es mayor o igual que " + prod2 + ": " + (prod1 >= prod2));
        System.out.println(prod1 + " es menor o igual que " + prod2 + ": " + (prod1 <= prod2));
        System.out.println(prod1 + " es igual a " + prod2 + ": " + (prod1 == prod2));
        System.out.println(prod1 + " es diferente de " + prod2 + ": " + (prod1 != prod2));
        System.out.println();

        // Conclusión de cuál fábrica produjo más
        if (prod1 > prod2) {
            System.out.println("La fábrica 1 produjo más.");
        } else if (prod2 > prod1) {
            System.out.println("La fábrica 2 produjo más.");
        } else {
            System.out.println("Ambas fábricas produjeron lo mismo.");
        }

        // Cálculo de la diferencia de producción
        int diferencia = Math.abs(prod1 - prod2);
        System.out.println("Diferencia de producción: " + diferencia + " unidades.");

        sc.close();
    }
}
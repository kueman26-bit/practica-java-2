import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese asistencia del estudiante 1: ");
        int asis1 = sc.nextInt();

        System.out.print("Ingrese asistencia del estudiante 2: ");
        int asis2 = sc.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(asis1 + " es mayor que " + asis2 + ": " + (asis1 > asis2));
        System.out.println(asis1 + " es menor que " + asis2 + ": " + (asis1 < asis2));
        System.out.println(asis1 + " es mayor o igual que " + asis2 + ": " + (asis1 >= asis2));
        System.out.println(asis1 + " es menor o igual que " + asis2 + ": " + (asis1 <= asis2));
        System.out.println(asis1 + " es igual a " + asis2 + ": " + (asis1 == asis2));
        System.out.println(asis1 + " es diferente de " + asis2 + ": " + (asis1 != asis2));
        System.out.println();

        // Conclusión de quién tiene mejor asistencia
        if (asis1 > asis2) {
            System.out.println("El estudiante 1 tiene mejor asistencia.");
        } else if (asis2 > asis1) {
            System.out.println("El estudiante 2 tiene mejor asistencia.");
        } else {
            System.out.println("Ambos estudiantes tienen la misma asistencia.");
        }

        // Cálculo de la diferencia de asistencia
        int diferencia = Math.abs(asis1 - asis2);
        System.out.println("Diferencia de asistencia: " + diferencia + "%");

        sc.close();
    }
}
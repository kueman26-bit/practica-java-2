import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese kilómetros del conductor 1: ");
        int km1 = sc.nextInt();

        System.out.print("Ingrese kilómetros del conductor 2: ");
        int km2 = sc.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(km1 + " es mayor que " + km2 + ": " + (km1 > km2));
        System.out.println(km1 + " es menor que " + km2 + ": " + (km1 < km2));
        System.out.println(km1 + " es mayor o igual que " + km2 + ": " + (km1 >= km2));
        System.out.println(km1 + " es menor o igual que " + km2 + ": " + (km1 <= km2));
        System.out.println(km1 + " es igual a " + km2 + ": " + (km1 == km2));
        System.out.println(km1 + " es diferente de " + km2 + ": " + (km1 != km2));
        System.out.println();

        // Conclusión de quién recorrió más kilómetros
        if (km1 > km2) {
            System.out.println("El conductor 1 recorrió más kilómetros.");
        } else if (km2 > km1) {
            System.out.println("El conductor 2 recorrió más kilómetros.");
        } else {
            System.out.println("Ambos conductores recorrieron los mismos kilómetros.");
        }

        // Cálculo de la diferencia de kilómetros
        int diferencia = Math.abs(km1 - km2);
        System.out.println("Diferencia: " + diferencia + " km.");

        sc.close();
    }
}
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese edad del trabajador 1: ");
        int edad1 = sc.nextInt();

        System.out.print("Ingrese edad del trabajador 2: ");
        int edad2 = sc.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(edad1 + " es mayor que " + edad2 + ": " + (edad1 > edad2));
        System.out.println(edad1 + " es menor que " + edad2 + ": " + (edad1 < edad2));
        System.out.println(edad1 + " es mayor o igual que " + edad2 + ": " + (edad1 >= edad2));
        System.out.println(edad1 + " es menor o igual que " + edad2 + ": " + (edad1 <= edad2));
        System.out.println(edad1 + " es igual a " + edad2 + ": " + (edad1 == edad2));
        System.out.println(edad1 + " es diferente de " + edad2 + ": " + (edad1 != edad2));
        System.out.println();

        // Conclusión de quién es mayor
        if (edad1 > edad2) {
            System.out.println("El trabajador 1 es mayor.");
        } else if (edad2 > edad1) {
            System.out.println("El trabajador 2 es mayor.");
        } else {
            System.out.println("Ambos trabajadores tienen la misma edad.");
        }

        // Cálculo de la diferencia de edad
        int diferencia = Math.abs(edad1 - edad2);
        System.out.println("La diferencia de edad es: " + diferencia + " años.");

        sc.close();
    }
}
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese promedio del estudiante 1: ");
        int prom1 = sc.nextInt();

        System.out.print("Ingrese promedio del estudiante 2: ");
        int prom2 = sc.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(prom1 + " es mayor que " + prom2 + ": " + (prom1 > prom2));
        System.out.println(prom1 + " es menor que " + prom2 + ": " + (prom1 < prom2));
        System.out.println(prom1 + " es mayor o igual que " + prom2 + ": " + (prom1 >= prom2));
        System.out.println(prom1 + " es menor o igual que " + prom2 + ": " + (prom1 <= prom2));
        System.out.println(prom1 + " es igual a " + prom2 + ": " + (prom1 == prom2));
        System.out.println(prom1 + " es diferente de " + prom2 + ": " + (prom1 != prom2));
        System.out.println();

        // Conclusión de quién obtiene la beca
        if (prom1 > prom2) {
            System.out.println("El estudiante 1 obtiene la beca.");
        } else if (prom2 > prom1) {
            System.out.println("El estudiante 2 obtiene la beca.");
        } else {
            System.out.println("Ambos estudiantes tienen el mismo promedio.");
        }

        sc.close();
    }
}
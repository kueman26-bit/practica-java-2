import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese consumo del hogar 1: ");
        int hogar1 = sc.nextInt();

        System.out.print("Ingrese consumo del hogar 2: ");
        int hogar2 = sc.nextInt();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(hogar1 + " es mayor que " + hogar2 + ": " + (hogar1 > hogar2));
        System.out.println(hogar1 + " es menor que " + hogar2 + ": " + (hogar1 < hogar2));
        System.out.println(hogar1 + " es mayor o igual que " + hogar2 + ": " + (hogar1 >= hogar2));
        System.out.println(hogar1 + " es menor o igual que " + hogar2 + ": " + (hogar1 <= hogar2));
        System.out.println(hogar1 + " es igual a " + hogar2 + ": " + (hogar1 == hogar2));
        System.out.println(hogar1 + " es diferente de " + hogar2 + ": " + (hogar1 != hogar2));
        System.out.println();

        // Conclusión de cuál hogar consumió más
        if (hogar1 > hogar2) {
            System.out.println("El hogar 1 consumió más energía.");
        } else if (hogar2 > hogar1) {
            System.out.println("El hogar 2 consumió más energía.");
        } else {
            System.out.println("Ambos hogares consumieron lo mismo.");
        }

        // Cálculo de la diferencia de consumo
        int diferencia = Math.abs(hogar1 - hogar2);
        System.out.println("La diferencia es de " + diferencia + " kWh.");

        sc.close();
    }
}
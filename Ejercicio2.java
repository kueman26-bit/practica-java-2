import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lectura de datos
        System.out.print("Ingrese sueldo 1: ");
        double sueldo1 = sc.nextDouble();

        System.out.print("Ingrese sueldo 2: ");
        double sueldo2 = sc.nextDouble();
        System.out.println();

        // Comparaciones relacionales
        System.out.println(sueldo1 + " es mayor que " + sueldo2 + ": " + (sueldo1 > sueldo2));
        System.out.println(sueldo1 + " es menor que " + sueldo2 + ": " + (sueldo1 < sueldo2));
        System.out.println(sueldo1 + " es mayor o igual que " + sueldo2 + ": " + (sueldo1 >= sueldo2));
        System.out.println(sueldo1 + " es menor o igual que " + sueldo2 + ": " + (sueldo1 <= sueldo2));
        System.out.println(sueldo1 + " es igual a " + sueldo2 + ": " + (sueldo1 == sueldo2));
        System.out.println(sueldo1 + " es diferente de " + sueldo2 + ": " + (sueldo1 != sueldo2));
        System.out.println();

        // Conclusión de quién gana más
        if (sueldo1 > sueldo2) {
            System.out.println("El practicante 1 gana más.");
        } else if (sueldo2 > sueldo1) {
            System.out.println("El practicante 2 gana más.");
        } else {
            System.out.println("Ambos practicantes ganan lo mismo.");
        }

        // Cálculo de la diferencia salarial
        double diferencia = Math.abs(sueldo1 - sueldo2);
        System.out.println("La diferencia salarial es: S/ " + diferencia);

        sc.close();
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el promedio del estudiante 1: ");
        double promedio1 = sc.nextDouble();

        System.out.print("Ingrese el promedio del estudiante 2: ");
        double promedio2 = sc.nextDouble();
        System.out.println();

        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));
        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));
        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));
        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));
        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));
        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));
        System.out.println();

        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtuvo el mejor promedio.");
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtuvo el mejor promedio.");
        } else {
            System.out.println("Ambos estudiantes tienen el mismo promedio.");
        }

        double diferencia = Math.abs(promedio1 - promedio2);
        System.out.println("La diferencia entre ambos promedios es: " + diferencia);

        sc.close();
    }
}
import java.util.Scanner;

public class PracticaJava {
    public static void main(String[] args) {
        // Inicializa el lector de datos
        Scanner entrada = new Scanner(System.in);
        
        // --- PARTE 1: LECTURA Y SUMA ---
        System.out.print("Ingrese un valor entero: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Ingrese otro valor entero: ");
        int numero2 = entrada.nextInt();
        
        int suma = numero1 + numero2;
        System.out.println("La suma es " + suma);
        System.out.println(); // Espacio en blanco separado
        
        // --- PARTE 2: COMPARACIONES ---
        System.out.print(numero1 + " es mayor a " + numero2 + ": ");
        System.out.println(numero1 > numero2);
        
        System.out.print(numero1 + " es menor a " + numero2 + ": ");
        System.out.println(numero1 < numero2);
        
        System.out.print(numero1 + " es mayor o igual a " + numero2 + ": ");
        System.out.println(numero1 >= numero2);
        
        System.out.print(numero1 + " es menor o igual a " + numero2 + ": ");
        System.out.println(numero1 <= numero2);
        
        System.out.print(numero1 + " es igual a " + numero2 + ": ");
        System.out.println(numero1 == numero2);
        
        System.out.print(numero1 + " no es igual a " + numero2 + ": ");
        System.out.println(numero1 != numero2);
        
    } // Fin del método main
} // Fin de la clase PracticaJava
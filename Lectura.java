import java.util.Scanner;

class Lectura {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer lo que el usuario escribe
        Scanner entrada = new Scanner(System.in);
        
        // Pide y lee el primer número entero
        System.out.print("Ingrese un valor entero: ");
        int numero1 = entrada.nextInt();
        
        // Pide y lee el segundo número entero
        System.out.print("Ingrese otro valor entero: ");
        int numero2 = entrada.nextInt();
        
        // Calcula la suma de ambos números
        int suma = numero1 + numero2;
        
        // Muestra el resultado en la pantalla
        System.out.println("La suma es " + suma);
    } // Fin del método main
} // Fin de la clase Lectura
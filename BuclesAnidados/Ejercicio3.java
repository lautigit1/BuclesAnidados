import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número N:");
        int N = scanner.nextInt();
        long sumaFactoriales = 0;

        for (int i = 0; i <= N; i++) {
            sumaFactoriales += calcularFactorial(i);
        }

        System.out.println("La suma de los factoriales de los números desde 0 hasta " + N + " es " + sumaFactoriales);
    }

    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}

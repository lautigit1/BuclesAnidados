import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número N:");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println("Factorial de " + i + " es " + calcularFactorial(i));
        }
    }

    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esNumeroPerfecto(int numero) {
        int suma = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma == numero;
    }
}


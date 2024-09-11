package co.edu.uniquindio.mochila;

public class ContarNumeroEnVector {

    public static int contarVeces(int[] vector, int n, int objetivo, int indice) {

        if (indice >= n) {
            return 0;
        }

        int contador;
        if (vector[indice] == objetivo) {
            contador = 1;
        }
          else {
            contador = 0;
        }

        return contador + contarVeces(vector, n, objetivo, indice + 1);
    }

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 2, 2, 5, 2};
        int objetivo = 2;
        int n = vector.length;
        int resultado = contarVeces(vector, n, objetivo, 0);

        System.out.println("El número " + objetivo + " aparece " + resultado + " veces en el vector.");
    }
}


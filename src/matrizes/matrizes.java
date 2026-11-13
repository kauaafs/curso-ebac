package matrizes;

public class matrizes {
    public static void main(String[] args) {
        int[][] matriz = {
                {14, 25, 36},
                {49, 53, 62},
                {71, 86, 90}
        };

        System.out.println("----- Imprimindo a Matriz -----");

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
        }
            System.out.println();
    }
  }
}

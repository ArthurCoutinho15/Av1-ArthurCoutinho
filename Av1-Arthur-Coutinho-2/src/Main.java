import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[40][40];

        int xampu = 0;
        int condicionador = 0;
        int hidratante = 0;
        int tintura = 0;
        int demaquilante = 0;


        System.out.println("Entre com os códigos: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 1){
                    xampu++;
                }
                if (mat[i][j] == 2){
                    condicionador++;
                }
                if (mat[i][j] == 3){
                    hidratante++;
                }
                if (mat[i][j] == 4){
                    tintura++;
                }
                if (mat[i][j] == 5){
                    demaquilante++;
                }
            }
        }
        System.out.println("QTD Xampu: " + xampu + ", QTD Condicionador: " + condicionador +
                ", QTD hidratante: " + hidratante + ", QTD Tintura: " + tintura + ", QTD demaquilante: " + demaquilante);
    }
}

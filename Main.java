import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static int[][] transpose(int[][] matrix){

        int[][] transpose= new int[matrix[0].length][matrix.length];

        for(int i=0 ; i < matrix.length ; i++ ){

            for(int j=0; j < matrix[i].length ; j++){
                // aynı numaralı satırlar ile sütunları yer değiştirdik.
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }

    static void print(int[][] matrix){

        for(int i=0 ; i < matrix.length ; i++ ){

            for(int j=0; j < matrix[i].length ; j++){

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix= {{2,3,4} ,
                         {5,6,4}};
        System.out.println("Matris : ");
        print(matrix);
        System.out.println("Tranpose : ");
        print(transpose(matrix));

    }
}
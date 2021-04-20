/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;
import java.util.Scanner;
/**
 *
 * @author Fajar Sidiq
 */
public class matrix {
   
    public static void printMatriks(int[][] matriks){
        
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        //berlaku untuk matriks A
        System.out.println("Masukan jumlah baris Matriks A;");
        int baris = masukan.nextInt();
        System.out.println("Masukan jumlah kolom Matriks A:");
        int kolom = masukan.nextInt();
        //membuat matriks A
        int[][] matriks_a = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Matriks A["+i+" , "+j+"]");
                matriks_a[i][j] = masukan.nextInt();
            }    
        }
        System.out.println("* Matriks A *");
        printMatriks(matriks_a);
        System.out.println(// Transpose Matriks A //);
        Matriks(matriks_a);
        //berlaku untuk matriks B
        System.out.println("Masukan jumlah baris Matriks B;");
        int baris_b = masukan.nextInt();
        System.out.println("Masukan jumlah kolom Matriks B:");
        int kolom_b = masukan.nextInt();
        //membuat matriks B
        int[][] matriks_b = new int[baris_b][kolom_b];
        for (int i=0; i<baris_b; i++){
            for (int j=0; j<kolom_b; j++){
                System.out.println("Matriks B["+i+" , "+j+"]");
                matriks_b[i][j] = masukan.nextInt();
            }    
        }
        System.out.println("* Matriks B *");
        printMatriks(matriks_b);
        System.out.println("");
        System.out.println("* Transpose Matriks B *");
        tranposeMatriks(matriks_b);

    }
     public static void tranposeMatriks(int[][] matriks){
        int[][] hasilTranpose = new int[matriks[0].length][matriks.length];
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                hasilTranpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("* Tranpose *");
        for (int i=0; i<hasilTranpose.length; i++){
            for (int j=0; j<hasilTranpose[0].length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
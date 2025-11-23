//import java.util.Scanner;
//
//public class arraydua255150400111023 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Masukkan baris/kolom: ");
//        int y = sc.nextInt();
//        int[][] a = new int[y][y];
//        int[][] b = new int[y][y];
//
//        for (int i = 0; i < y; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print("Masukkan elemen untuk baris " + i + ", kolom " + j + ": ");
//                a[i][j] = sc.nextInt();
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < y; i++) {
//            for (int j = 0; j < y; j++) {
//                b[j][i] = a[i][j];
//            }
//        }
//        System.out.println("Matriks Anda:");
//        for (int i = 0; i < y; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Transpose Matriks:");
//        for (int i = 0; i < y; i++) {
//            for (int j = 0; j < y; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

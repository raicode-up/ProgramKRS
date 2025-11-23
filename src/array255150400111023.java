//import java.util.Scanner;
//import java.util.Arrays; // Import kelas Arrays untuk menampilkan output
//
//public class array255150400111023 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Masukkan ukuran array yang diinginkan: ");
//        int y = sc.nextInt(); // y adalah PANJANG array
//
//        int[] a = new int[y];
//        int[] b = new int[y];
//
//        System.out.println("\n--- Masukkan elemen untuk Array A ---");
//        for (int i = 0; i < y; i++){
//            System.out.print("Masukkan elemen a[" + i + "]: ");
//            a[i] = sc.nextInt();
//        }
//
//        System.out.println("\n--- Masukkan elemen untuk Array B ---");
//        for (int i = 0; i < y; i++){
//            System.out.print("Masukkan elemen b[" + i + "]: ");
//            b[i] = sc.nextInt();
//        }
//
//        int[] hasil = new int[y];
//
//        // Lakukan penjumlahan
//        for (int i = 0; i < y; i++) {
//            hasil[i] = a[i] + b[i];
//        }
//
//        System.out.println("a + b = [" + a[y] + "] ");
//        sc.close();
//    }
//}
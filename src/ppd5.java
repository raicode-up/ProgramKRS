//import java.util.*;
///*
//Nabila Raisiya Zahrani
//255150400111023
//*/
//
//public class ppd5 {
//    public static long faktorial (int n){
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * faktorial(n - 1);
//        }
//    }
//
//    public static long permutasi(int n, int r) {
//        if (n < r || n < 0 || r < 0) {
//            return 0;
//        } else {
//            return faktorial(n) / faktorial(n - r);
//        }
//    }
//
//    public static long kombinasi(int n, int r){
//        if (n < r || n < 0 || r < 0) {
//            return 0;
//        } else {
//            return faktorial(n) / (faktorial(n - r) * faktorial(r));
//        }
//    }
//
//    public static void main(String[] Args) {
//        Scanner sc = new Scanner(System.in);
//        int pilihan;
//        int n;
//        int r;
//
//        do {
//            System.out.printf("%s\n", "Program Penghitung Kombinasi dan Permutasi");
//            System.out.println("1. Menghitung Permutasi");
//            System.out.println("2. Menghitung Kombinasi");
//            System.out.println("3. Keluar");
//            System.out.printf("%15s : ", "Masukkan pilihan anda");
//            pilihan = sc.nextInt();
//
//
//            switch (pilihan) {
//                case 1:
//                    System.out.printf("%15s : ", "Masukkan nilai n");
//                    n = sc.nextInt();
//                    System.out.printf("%15s : ", "Masukkan nilai r");
//                    r = sc.nextInt();
//
//                    long hasilMutasi = permutasi(n, r);
//                    System.out.printf("%11s\n", "n");
//                    System.out.printf("%s = %s = %d\n", "nPr", "----------", hasilMutasi);
//                    System.out.printf("%15s\n", "(n - r)!");
//                    System.out.printf("%15s : %d\n", "Maka Hasil Permutasinya adalah", hasilMutasi);
//                    System.out.println();
//                    break;
//
//                case 2:
//                    System.out.printf("%15s : ", "Masukkan nilai n");
//                    n = sc.nextInt();
//                    System.out.printf("%15s : ", "Masukkan nilai r");
//                    r = sc.nextInt();
//
//                    long hasilKombinasi = kombinasi(n, r);
//                    System.out.printf("%14s\n", "n");
//                    System.out.printf("%s = %s = %d\n", "nPr", "---------------", hasilKombinasi);
//                    System.out.printf("%20s\n", "(n - r)! x r!");
//                    System.out.printf("%15s : %d\n", "Maka Hasil Kombinasinya adalah", hasilKombinasi);
//                    System.out.println();
//                    break;
//
//                case 3:
//                    break;
//
//                default:
//                    System.out.println("Pilihan tidak valid! Silakan masukkan pilihan yang sesuai.");
//                    System.out.println();
//            }
//        }
//        while (pilihan != 3);
//        sc.close();
//    }
//}
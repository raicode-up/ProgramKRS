//import java.util.Scanner;
///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//
//public class ppd4 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int jumlahData = 0;
//        int[] data = new int[jumlahData];
//        int menu;
//
//        do {
//            System.out.printf("%s\n", "MENU :");
//            System.out.println("1. Input Data");
//            System.out.println("2. Lihat Data");
//            System.out.println("3. Average");
//            System.out.println("4. Sum");
//            System.out.println("5. Max");
//            System.out.println("6. Min ");
//            System.out.println("0. Keluar");
//            System.out.print("Masukkan nilai : ");
//            menu = sc.nextInt();
//
//            switch (menu){
//                case 0:
//                    System.out.printf("\n%s", "PROGRAM DIHENTIKAN.");
//                    break;
//                case 1:
//                    System.out.printf("\n%-25s : ", "Jumlah data yang ingin diinput ");
//                    jumlahData = sc.nextInt();
//                    data = new int[jumlahData];
//
//                    for (int i = 0; i < jumlahData; i++){
//                        System.out.printf("%-15s : ", "Masukkan nilai ke-" + (i+1));
//                        data[i] = sc.nextInt();
//                    }
//                    System.out.println("Data berhasil ditambahkan.");
//                    System.out.println("==============================\n");
//                    break;
//
//                case 2:
//                    if (jumlahData == 0) {
//                        System.out.println("\nData masih kosong. Silakan input data terlebih dahulu.\n");
//                        break;
//                    }
//                    System.out.printf("\n%s\n", "--- Data Anda ---");
//                    for (int i = 0; i < jumlahData; i++) {
//                        System.out.printf("Data ke-%d: %d\n", (i + 1), data[i]);
//                    }
//                    System.out.println("==============================\n");
//                    break;
//
//                case 3:
//                    if (jumlahData == 0) {
//                        System.out.println("\nData masih kosong. Tidak bisa menghitung rata-rata.\n");
//                        break;
//                    }
//                    int total = 0;
//                    for (int nilai : data) {
//                        total += nilai;
//                    }
//
//                    double average = (double) total / jumlahData;
//                    System.out.printf("\nAverage : %.2f\n", average);
//                    System.out.println("===========================\n");
//                    break;
//
//                case 4:
//                    if (jumlahData == 0) {
//                        System.out.println("\nData masih kosong. Tidak bisa menghitung jumlah.\n");
//                        break;
//                    }
//                    int sum = 0;
//                    for (int nilai : data) {
//                        sum += nilai;
//                    }
//                    System.out.printf("\nSum : %d\n", sum);
//                    System.out.println("===========================\n");
//                    break;
//
//                case 5:
//                    if (jumlahData == 0) {
//                        System.out.println("\nData masih kosong. Tidak bisa mencari nilai maksimal.\n");
//                        break;
//                    }
//                    int max = data[0];
//                    for (int i = 1; i < data.length; i++) {
//                        if (max < data[i]) {
//                            max = data[i];
//                        }
//                    }
//                    System.out.printf("\nMax : %d\n", max);
//                    System.out.println("===========================\n");
//                    break;
//
//                case 6:
//                    if (jumlahData == 0) {
//                        System.out.println("\nData masih kosong. Tidak bisa mencari nilai minimal.\n");
//                        break;
//                    }
//                    int min = data[0];
//                    for (int i = 1; i < data.length; i++) {
//                        if (min > data[i]) {
//                            min = data[i];
//                        }
//                    }
//                    System.out.printf("\nMin : %d\n", min);
//                    System.out.println("===========================\n");
//                    break;
//
//                default:
//                    System.out.println("\nNILAI TIDAK VALID. SILAHKAN MEMILIH KEMBALI.\n");
//                    System.out.println("===========================\n");
//            }
//        }
//        while (menu != 0);
//        sc.close();
//    }
//}
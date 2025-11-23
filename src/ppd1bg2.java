import java.util.Scanner;
/*
Nabila Raisiya Zahrani
255150400111023
*/
//public class ppd1bg2 {
//    public static void main (String[] args) {
//        System.out.println("Program penghitung pemakaian listrik sederhana");
//        Scanner sc = new Scanner(System.in);
//
//        System.out.printf("%-35s : ", "Masukkan nama");
//            String nama = sc.nextLine();
//        System.out.printf("%-35s : ", "Kelurahan");
//            String kel = sc.nextLine();
//        System.out.printf("%-35s : ", "Masukkan posisi awal Kwh Meter");
//            int kwhawal = sc.nextInt();
//        System.out.printf("%-35s : ", "Masukkan posisi akhir Kwh Meter");
//            int kwhakhir = sc.nextInt();
//        System.out.printf("%-35s : ", "Masukkan biaya beban saat ini");
//            int beban = sc.nextInt();
//        System.out.printf("%-35s : ", "Masukkan PPJ (dalam persen)");
//            int ppj = sc.nextInt();
//
//        int totalkwh = kwhakhir - kwhawal;
//        int tarif = totalkwh * beban;
//        int ppjakhir = tarif * ppj / 100;
//        int totalbayar = tarif + ppjakhir;
//
//        System.out.printf("%s \n", "===================PLN Java===================");
//        System.out.printf("%-20s : %s\n", "Nama", nama);
//        System.out.printf("%-20s : %s\n", "Kelurahan", kel);
//        System.out.printf("%-20s : %d %s\n", "Pemakaian bulan ini", totalkwh, "Kwh Meter");
//        System.out.printf("%-20s : %s %d%s\n", "Tarif Listrik", "Rp", tarif, ",-");
//        System.out.printf("%s %d%-14s : %s %d%s\n", "PPJ", ppj, "%", "Rp", ppjakhir, ",-");
//        System.out.printf("%-20s : %s %d%s\n", "Total bayar", "Rp", totalbayar, ",-");
//        System.out.printf("%s \n", "==============================================");
//        sc.close();
//    }
//}
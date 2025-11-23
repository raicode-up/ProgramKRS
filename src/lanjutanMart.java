//import java.util.Scanner;
//
//public class lanjutanMart {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Jumlah jenis barang yang dibeli = ");
//        int jumlahJenisBarang = sc.nextInt();
//        sc.nextLine();
//
//        String[] namaBarang = new String[jumlahJenisBarang];
//        int[] jumlahBeli = new int[jumlahJenisBarang];
//        int[] hargaSatuan = new int[jumlahJenisBarang];
//
//        for (int i = 0; i < jumlahJenisBarang; i++) {
//            System.out.print("Nama Barang  " + (i + 1) + " : ");
//            namaBarang[i] = sc.nextLine();
//
//            System.out.print("Jumlah Barang " + (i + 1) + ": ");
//            jumlahBeli[i] = sc.nextInt();
//            sc.nextLine();
//
//            if (namaBarang[i].equalsIgnoreCase("Beras")) {
//                hargaSatuan[i] = 55000;
//            } else if (namaBarang[i].equalsIgnoreCase("Gula")) {
//                hargaSatuan[i] = 10000;
//            } else if (namaBarang[i].equalsIgnoreCase("Minyak Goreng")) {
//                hargaSatuan[i] = 56000;
//            } else if (namaBarang[i].equalsIgnoreCase("Sabun")) {
//                hargaSatuan[i] = 15000;
//            } else if (namaBarang[i].equalsIgnoreCase("Telur")) {
//                hargaSatuan[i] = 25000;
//            } else {
//                hargaSatuan[i] = 0;
//            }
//            System.out.println("----------------------------");
//        }
//
//        int totalKeseluruhan = 0;
//
//        System.out.println("NABILA RAISIYA ZAHRANI");
//        System.out.println("255150400111023");
//        System.out.println("============================");
//
//        for (int i = 0; i < jumlahJenisBarang; i++) {
//            int subTotal = jumlahBeli[i] * hargaSatuan[i];
//
//            System.out.printf("%-15s\n %d %s %d = Rp %,d\n",
//                    namaBarang[i],
//                    jumlahBeli[i],
//                    " x @ ",
//                    hargaSatuan[i],
//                    subTotal);
//
//            totalKeseluruhan += subTotal;
//        }
//
//        System.out.println("============================");
//        System.out.printf("TOTAL BAYAR   : Rp %,d\n", totalKeseluruhan);
//        System.out.println("============================");
//        System.out.println("Terima kasih!");
//
//        sc.close();
//    }
//}
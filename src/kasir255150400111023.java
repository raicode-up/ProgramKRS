//import java.util.Scanner;
//
//public class kasir255150400111023{
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Jumlah barang yang dibeli = ");
//        int jumlahJenisBarang = sc.nextInt();
//        sc.nextLine();
//
//        String[] namaBarang = new String[jumlahJenisBarang];
//        int[] jumlahBeli = new int[jumlahJenisBarang];
//        double[] hargaSatuan = new double[jumlahJenisBarang];
//
//        for (int i = 0; i < jumlahJenisBarang; i++) {
//            System.out.print("Nama Barang  " + (i + 1) + " : ");
//            namaBarang[i] = sc.nextLine();
//
//            System.out.print("Jumlah Barang" + (i + 1) + " : ");
//            jumlahBeli[i] = sc.nextInt();
//
//            System.out.print("Harga Satuan " + (i + 1) + " : ");
//            hargaSatuan[i] = sc.nextDouble();
//            sc.nextLine();
//        }
//        double totalKeseluruhan = 0;
//
//        System.out.printf("%s\n", "NABILA RAISIYA ZAHRANI");
//        System.out.printf("%s\n", "255150400111023");
//        System.out.println("============================");
//        for (int i = 0; i < jumlahJenisBarang; i++) {
//            double subTotal = jumlahBeli[i] * hargaSatuan[i];
//                        System.out.printf("\n%-15s\n %d %s %,.0f = Rp %,.0f\n",
//                    namaBarang[i],
//                    jumlahBeli[i],
//                    " x @ ",
//                    hargaSatuan[i],
//                    subTotal);
//
//            totalKeseluruhan += subTotal;
//        }
//        System.out.println("============================");
//        System.out.printf("TOTAL BAYAR   : Rp %,.0f\n", totalKeseluruhan);
//        sc.close();
//    }
//}
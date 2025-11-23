//import java.util.Scanner;
///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//
//public class ppd4bg2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[][] dataKA = {
//                {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
//                {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
//                {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
//                {"Pariwisata", "300000", "10", "Ada", "Ada"},
//        };
//
//        String jenisKA = null;
//        int jumlahTiket = 0;
//        int pilihan;
//        double totalHarga = 0;
//        double diskonTiket = 0;
//        double hargaAkhir = 0;
//
//        do {
//            System.out.println("\n================================================");
//            System.out.println("       PROGRAM PEMESANAN TIKET KERETA API");
//            System.out.println("================================================");
//            System.out.println("1. Melihat Daftar Kereta Api");
//            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
//            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
//            System.out.println("4. Memesan Tiket Kereta Api");
//            System.out.println("5. Melihat Pesanan Tiket");
//            System.out.println("0. Keluar");
//            System.out.print("Masukkan nilai : ");
//            pilihan = sc.nextInt();
//            sc.nextLine();
//
//            switch (pilihan) {
//                case 0:
//                    System.out.println("\nTerima kasih telah menggunakan program pemesanan tiket kereta api ini!");
//                    break;
//
//                case 1:
//                    System.out.println("\nDAFTAR SELURUH KERETA API TERSEDIA");
//                    System.out.println("-".repeat(70));
//                    System.out.printf("%-15s %-12s %-9s %-10s %-10s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
//                    System.out.println("-".repeat(70));
//                    for (String[] strings : dataKA) {
//                        System.out.printf("%-15s Rp%-11s %-8s %-10s %-10s\n",
//                                strings[0], strings[1], strings[2] + "%", strings[3], strings[4]);
//                    }
//                    System.out.println("-".repeat(70));
//                    break;
//
//                case 2:
//                    System.out.println("\nDAFTAR KERETA API DENGAN AC");
//                    System.out.println("-".repeat(70));
//                    System.out.printf("%-15s %-12s %-9s %-10s %-10s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
//                    System.out.println("-".repeat(70));
//                    for (String[] strings : dataKA) {
//                        if (strings[3].equals("Ada")) {
//                            System.out.printf("%-15s Rp%-11s %-8s %-10s %-10s\n",
//                                    strings[0], strings[1], strings[2] + "%", strings[3], strings[4]);
//                        }
//                    }
//                    System.out.println("-".repeat(70));
//                    break;
//
//                case 3:
//                    System.out.println("\nDAFTAR KERETA API DENGAN COLOKAN");
//                    System.out.println("-".repeat(70));
//                    System.out.printf("%-15s %-12s %-9s %-10s %-10s\n", "Jenis", "Harga", "Diskon", "AC", "Colokan");
//                    System.out.println("-".repeat(70));
//                    for (String[] value : dataKA) {
//                        if (value[4].equals("Ada")) {
//                            System.out.printf("%-15s Rp%-11s %-8s %-10s %-10s\n",
//                                    value[0], value[1], value[2] + "%", value[3], value[4]);
//                        }
//                    }
//                    System.out.println("-".repeat(70));
//                    break;
//
//                case 4:
//                    System.out.println("\nFORM PEMESANAN TIKET");
//                    System.out.println("-".repeat(20));
//                    System.out.print("Masukkan Jenis Kereta : ");
//                    String jenisInput = sc.nextLine();
//                    System.out.print("Masukkan Jumlah Tiket : ");
//                    int jumlahInput = sc.nextInt();
//                    sc.nextLine();
//
//                    boolean tiketDitemukan = false;
//                    for (String[] strings : dataKA) {
//                        if (strings[0].equalsIgnoreCase(jenisInput)) {
//                            tiketDitemukan = true;
//                            int harga = Integer.parseInt(strings[1]);
//                            int diskonPer = Integer.parseInt(strings[2]);
//                            double total = (double) harga * jumlahInput;
//                            double jumlahDiskon = total * (diskonPer / 100.0);
//                            double totalBayar = total - jumlahDiskon;
//
//                            jenisKA = strings[0];
//                            jumlahTiket = jumlahInput;
//                            totalHarga = total;
//                            diskonTiket = jumlahDiskon;
//                            hargaAkhir = totalBayar;
//
//                            System.out.println("PEMESANAN BERHASIL!");
//                            System.out.println("Detail Pesanan Anda:");
//                            System.out.printf("\n%-15s : %s\n", "Jenis Kereta", jenisKA);
//                            System.out.printf("%-15s : %d\n", "Jumlah Tiket", jumlahTiket);
//                            System.out.printf("%-15s : Rp %d\n", "Total Harga", (int) totalHarga);
//                            System.out.printf("%-15s : Rp %d\n", "Potongan Harga", (int) diskonTiket);
//                            System.out.println("---------------------------------");
//                            System.out.printf("%-15s : Rp %d\n", "Total Bayar", (int) hargaAkhir);
//                            break;
//                        }
//                    }
//                    if (!tiketDitemukan) {
//                        System.out.println("\nMaaf, jenis kereta '" + jenisInput + "' tidak tersedia.");
//                    }
//                    break;
//
//                case 5:
//                    System.out.println("\nDETAIL PESANAN ANDA");
//                    if (jenisKA == null) {
//                        System.out.println("Anda belum melakukan pemesanan tiket.");
//                    } else {
//                        System.out.printf("\n%-15s : %s\n", "Jenis Kereta", jenisKA);
//                        System.out.printf("%-15s : %d\n", "Jumlah Tiket", jumlahTiket);
//                        System.out.printf("%-15s : Rp %d\n", "Total Harga", (int) totalHarga);
//                        System.out.printf("%-15s : Rp %d\n", "Diskon ", (int) diskonTiket);
//                        System.out.println("---------------------------------");
//                        System.out.printf("%-15s : Rp %d\n", "Total Bayar", (int) hargaAkhir);
//                    }
//                    break;
//
//                default:
//                    System.out.println("\nPilihan tidak valid. Mohon masukkan angka sesuai menu.");
//                    break;
//            }
//        }
//        while (pilihan != 0);
//        sc.close();
//    }
//}
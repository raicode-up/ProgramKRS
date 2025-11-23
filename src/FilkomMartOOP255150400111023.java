//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class FilkomMartOOP255150400111023 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Struk strukBelanja = new Struk();
//
//        System.out.print("Jumlah jenis barang yang dibeli = ");
//        int jumlahJenisBarang = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0; i < jumlahJenisBarang; i++) {
//            System.out.print("Nama Barang  " + (i + 1) + " : ");
//            String nama = sc.nextLine();
//            System.out.print("Jumlah Barang " + (i + 1) + ": ");
//            int jumlah = sc.nextInt();
//            sc.nextLine();
//
//            int harga = DaftarHarga.getHarga(nama);
//            Barang barangBaru = new Barang(nama, jumlah, harga);
//            strukBelanja.tambahBarang(barangBaru);
//            System.out.println("----------------------------");
//        }
//
//        strukBelanja.cetakStruk();
//        sc.close();
//    }
//}
//
//class Barang {
//    private String nama;
//    private int jumlah;
//    private int hargaSatuan;
//
//    public Barang(String nama, int jumlah, int hargaSatuan) {
//        this.nama = nama;
//        this.jumlah = jumlah;
//        this.hargaSatuan = hargaSatuan;
//    }
//
//    public String getNama() { return nama; }
//    public int getJumlah() { return jumlah; }
//    public int getHargaSatuan() { return hargaSatuan; }
//    public int getSubTotal() { return this.jumlah * this.hargaSatuan; }
//}
//
//class DaftarHarga {
//    public static int getHarga(String namaBarang) {
//        if (namaBarang.equalsIgnoreCase("Beras")) {
//            return 55000;
//        } else if (namaBarang.equalsIgnoreCase("Gula")) {
//            return 10000;
//        } else if (namaBarang.equalsIgnoreCase("Minyak Goreng")) {
//            return 56000;
//        } else if (namaBarang.equalsIgnoreCase("Sabun")) {
//            return 15000;
//        } else if (namaBarang.equalsIgnoreCase("Telur")) {
//            return 25000;
//        } else {
//            return 0;
//        }
//    }
//}
//
//class Struk {
//    private ArrayList<Barang> daftarBarang;
//
//    public Struk() {
//        this.daftarBarang = new ArrayList<>();
//    }
//
//    public void tambahBarang(Barang barang) {
//        this.daftarBarang.add(barang);
//    }
//
//    public void cetakStruk() {
//        int totalKeseluruhan = 0;
//        System.out.println();
//        System.out.println("============================");
//        System.out.println("NABILA RAISIYA ZAHRANI");
//        System.out.println("255150400111023");
//        System.out.println("============================");
//
//        for (Barang item : this.daftarBarang) {
//            int subTotal = item.getSubTotal();
//            System.out.printf("%-15s\n %d %s %d = Rp %,d\n",
//                    item.getNama(),
//                    item.getJumlah(),
//                    " x @ ",
//                    item.getHargaSatuan(),
//                    subTotal);
//            totalKeseluruhan += subTotal;
//        }
//
//        System.out.println("============================");
//        System.out.printf("TOTAL BAYAR    : Rp %,d\n", totalKeseluruhan);
//        System.out.println("============================");
//        System.out.println("Terima kasih!");
//    }
//}
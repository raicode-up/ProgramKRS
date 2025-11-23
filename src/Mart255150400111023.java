//import java.util.Scanner;
//import java.util.Random;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class Mart255150400111023 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Random code = new Random();
//
//        int proPrice1, proPrice2, proPrice3, proPrice4;
//        int proAmount1, proAmount2, proAmount3, proAmount4;
//        int proTotal1, proTotal2, proTotal3, proTotal4;
//        int receiptNum = 100000 + code.nextInt(100000);
//        int orderId = 100 + code.nextInt(9000);
//
//        LocalDateTime recent = LocalDateTime.now();
//        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd MMMM yyyy");
//        DateTimeFormatter hour = DateTimeFormatter.ofPattern("HH:mm");
//        System.out.printf("%-15s : ", "Nama Kasir");
//            String cashier = sc.nextLine();
//
//        //Input Data Barang
//        System.out.printf("%-15s : ", "Harga barang 1");
//            proPrice1 = sc.nextInt();
//        System.out.printf("%-15s : ", "Jumlah barang 1");
//            proAmount1 = sc.nextInt();
//        System.out.printf("%-15s : ", "Harga barang 2");
//            proPrice2 = sc.nextInt();
//        System.out.printf("%-15s : ", "Jumlah barang 2");
//            proAmount2 = sc.nextInt();
//        System.out.printf("%-15s : ", "Harga barang 3");
//            proPrice3 = sc.nextInt();
//        System.out.printf("%-15s : ", "Jumlah barang 3");
//            proAmount3 = sc.nextInt();
//        System.out.printf("%-15s : ", "Harga barang 4");
//            proPrice4 = sc.nextInt();
//        System.out.printf("%-15s : ", "Jumlah barang 4");
//            proAmount4 = sc.nextInt();
//        sc.nextLine();
//
//        //Perhitungan subtotal
//        proTotal1 = proPrice1 * proAmount1;
//        proTotal2 = proPrice2 * proAmount2;
//        proTotal3 = proPrice3 * proAmount3;
//        proTotal4 = proPrice4 * proAmount4;
//        int subTotal = proTotal1 + proTotal2 + proTotal3 + proTotal4;
//
//        //Perhitungan diskon, total, dan kembali
//        int discPer = 0;
//        int disc = 0;
//        if (subTotal >= 500000){
//            discPer = 20;
//            disc = (int) (subTotal * (0.2));
//        } else if (subTotal >= 100000) {
//            discPer = 10;
//            disc = (int) (subTotal * (0.1));
//        } else if (subTotal >= 500000) {
//            discPer = 5;
//            disc = (int) (subTotal * (0.05));
//        }
//        int total = subTotal - disc;
//        System.out.printf("%-15s : %d\n", "Total yang harus dibayar", total);
//        System.out.printf("%-15s : ", "Jumlah bayar");
//            int paid = sc.nextInt();
//        if (paid < total){
//            System.out.printf("\n%s", "Jumlah pembayaran yang dilakukan kurang. Silahkan input kembali sesuai dengan total belanja.");
//            System.out.printf("\n%-15s : ", "Jumlah bayar");
//            paid = sc.nextInt();
//        }
//        int change = paid - total;
//
//        //Output struk
//        System.out.println("\n\n");
//        System.out.printf("%35s\n", "NABILA RAISIYA ZAHRANI");
//        System.out.printf("%32s\n", "255150400111023");
//        System.out.printf("%-24s %23s\n", recent.format(date), recent.format(hour));
//        System.out.printf("%-24s %23d\n", "Receipt Number", receiptNum);
//        System.out.printf("%-24s %23d\n", "Order ID", orderId);
//        System.out.printf("%-24s %23s\n", "Collected By", cashier);
//        System.out.println("================================================");
//        System.out.println("Nama Barang 1");
//        System.out.printf("%-20s %27d\n", proAmount1 + " x @ " + proPrice1, proTotal1);
//        System.out.println("Nama Barang 2");
//        System.out.printf("%-20s %27d\n", proAmount2 + " x @ " + proPrice2, proTotal2);
//        System.out.println("Nama Barang 3");
//        System.out.printf("%-20s %27d\n", proAmount3 + " x @ " + proPrice3, proTotal3);
//        System.out.println("Nama Barang 4");
//        System.out.printf("%-20s %27d\n", proAmount4 + " x @ " + proPrice4, proTotal4);
//        System.out.println("================================================");
//        System.out.printf("%-35s Rp. %8d\n", "Subtotal", subTotal);
//        System.out.println("Diskon");
//        System.out.printf("%-35s-Rp. %8d\n", discPer +"%", disc);
//        System.out.println("================================================");
//        System.out.printf("%-35s Rp. %8d\n", "Total", total);
//        System.out.printf("%-35s Rp. %8d\n", "Bayar", paid);
//        System.out.println("================================================");
//        System.out.printf("%-35s-Rp. %8d\n", "Kembali", change);
//        System.out.println("================================================");
//        System.out.printf("%40s\n", "Terima Kasih Telah Berbelanja di");
//        System.out.printf("%35s\n", "NABILA RAISIYA ZAHRANI");
//    }
//}
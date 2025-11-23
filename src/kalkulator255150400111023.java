//import java.util.Scanner;
//
//public class kalkulator255150400111023 {
//    public static double jumlah(double a, double b) {
//        return a + b;
//    }
//
//    public static double kurang(double a, double b) {
//        return a - b;
//    }
//
//    public static double kali(double a, double b) {
//        return a * b;
//    }
//
//    public static double bagi(double a, double b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int lanjut = 0;
//
//        do {
//            System.out.println("----- KALKULATOR -----");
//
//            double bilangan1, bilangan2;
//
//            System.out.print("Masukkan bilangan pertama: ");
//            if (sc.hasNextDouble()) {
//                bilangan1 = sc.nextDouble();
//            } else {
//                System.out.println("Input tidak valid! Harap masukkan angka.");
//                sc.next();
//                continue;
//            }
//
//            System.out.print("Masukkan bilangan kedua: ");
//            if (sc.hasNextDouble()) {
//                bilangan2 = sc.nextDouble();
//            } else {
//                System.out.println("Input tidak valid! Harap masukkan angka.");
//                sc.next();
//                continue;
//            }
//
//            System.out.print("Pilih operasi (+, -, *, /): ");
//            char operasi = sc.next().charAt(0);
//
//            double hasil = 0;
//            boolean operasiBerhasil = true;
//
//            switch (operasi) {
//                case '+':
//                    hasil = jumlah(bilangan1, bilangan2);
//                    break;
//                case '-':
//                    hasil = kurang(bilangan1, bilangan2);
//                    break;
//                case '*':
//                    hasil = kali(bilangan1, bilangan2);
//                    break;
//                case '/':
//                    if (bilangan2 == 0) {
//                        System.out.println("Error: Tidak bisa membagi dengan nol!");
//                        operasiBerhasil = false;
//                    } else {
//                        hasil = bagi(bilangan1, bilangan2);
//                    }
//                    break;
//                default:
//                    System.out.println("Operasi tidak valid. Silakan pilih +, -, *, atau /");
//                    operasiBerhasil = false;
//                    break;
//            }
//
//            if (operasiBerhasil) {
//                System.out.println("Hasil: " + hasil);
//            }
//
//            System.out.print("\nApakah Anda ingin melanjutkan dengan perhitungan lain? (1/0): ");
//            lanjut = sc.nextInt();
//
//        } while (lanjut == 1);
//
//        System.out.println("Terima kasih telah menggunakan kalkulator!");
//        sc.close();
//    }
//}
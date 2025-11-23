//import java.util.Scanner;
///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//public class ppd2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int pilihan; double a, b, r, hasil;
//
//        System.out.println("Menu :");
//        System.out.println("1. Menghitung luas dan keliling persegi panjang");
//        System.out.println("2. Menghitung luas dan keliling lingkaran");
//        System.out.println("3. Menghitung luas dan keliling segitiga siku-siku");
//        System.out.printf("%-25s : ", "Pilihan Anda");
//        pilihan = sc.nextInt();
//
//        switch (pilihan) {
//            case 1:
//                System.out.printf("\n%-25s : ", "Masukkan a (panjang)");
//                a = sc.nextDouble();
//                System.out.printf("%-25s : ", "Masukkan b (lebar)");
//                b = sc.nextDouble();
//                hasil = a + a + b + b;
//                System.out.printf("\n%-25s : %.1f %s\n", "Keliling persegi panjang", hasil, "cm");
//                hasil = a * b;
//                System.out.printf("%-25s : %.1f %s\n", "Luas persegi panjang", hasil, "cm2");
//                break;
//            case 2:
//                System.out.printf("\n%-25s : ", "Masukkan r (jari-jari)");
//                r = sc.nextDouble();
//                hasil = Math.PI * (2 * r);
//                System.out.printf("\n%-25s : %.1f %s \n", "Keliling lingkaran", hasil, "cm");
//                hasil = Math.PI * Math.pow(r,2);
//                System.out.printf("%-25s : %.1f %s \n", "Luas lingkaran", hasil, "cm2");
//                break;
//            case 3:
//                System.out.printf("\n%-25s : ", "Masukkan a (alas)");
//                a = sc.nextDouble();
//                System.out.printf("%-25s : ", "Masukkan b (tinggi)");
//                b = sc.nextDouble();
//                System.out.printf("%-25s : ", "Masukkan r (sisi miring)");
//                r = sc.nextDouble();
//                hasil = a + b + r;
//                System.out.printf("\n%-25s : %.1f %s\n", "Keliling segitiga", hasil, "cm");
//                hasil = (a * b) / 2;
//                System.out.printf("%-25s : %.1f %s\n", "Luas segitiga", hasil, "cm2");
//                break;
//            default:
//                System.out.printf("\n%s", "Data tak ditemukan, program dihentikan ...");
//        }
//        sc.close();
//    }
//}
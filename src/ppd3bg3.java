//import java.util.Scanner;
///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//public class ppd3bg3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int pilihan;
//
//        do {
//            System.out.printf("\n%s\n", "MENU :");
//            System.out.println("0. KELUAR");
//            System.out.println("1. HITUNG VOLUME BALOK");
//            System.out.println("2. HITUNG VOLUME BOLA");
//            System.out.println("3. HITUNG VOLUME KERUCUT");
//            System.out.println("4. HITUNG VOLUME SILINDER");
//            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
//            System.out.printf("%-30s : ", "MASUKKAN PILIHAN ANDA");
//            pilihan = sc.nextInt();
//
//            switch (pilihan) {
//
//                case 0:
//                    System.out.printf("\n%s", "PROGRAM DIHENTIKAN.");
//                    break;
//
//                case 1:
//                    System.out.printf("\n%-30s : ", "MASUKKAN PANJANG BALOK");
//                        int panjangBalok = sc.nextInt();
//                    System.out.printf("%-30s : ", "MASUKKAN LEBAR BALOK");
//                        int lebarBalok = sc.nextInt();
//                    System.out.printf("%-30s : ", "MASUKKAN TINGGI BALOK");
//                        int tinggiBalok = sc.nextInt();
//                    double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
//                    System.out.printf("%-30s : %.1f\n", "VOLUME BALOK", volumeBalok);
//                    break;
//
//                case 2:
//                    System.out.printf("\n%-30s : ", "MASUKKAN JARI-JARI BOLA");
//                        int radiusBola = sc.nextInt();
//                    double volumeBola = ((4.0 / 3.0) * Math.PI * Math.pow(radiusBola, 3));
//                    System.out.printf("%-30s : %.1f\n", "VOLUME BOLA", volumeBola);
//                    break;
//
//                case 3:
//                    System.out.printf("\n%-30s : ", "MASUKKAN JARI-JARI KERUCUT");
//                        int radiusKerucut = sc.nextInt();
//                    System.out.printf("%-30s : ", "MASUKKAN TINGGI KERUCUT");
//                        int tinggiKerucut = sc.nextInt();
//                    double volumeKerucut = ((1.0 / 3.0) * Math.PI * Math.pow(radiusKerucut,2) * tinggiKerucut);
//                    System.out.printf("%-30s : %.1f\n", "VOLUME KERUCUT", volumeKerucut);
//                    break;
//
//                case 4:
//                    System.out.printf("\n%-30s : ", "MASUKKAN JARI-JARI SILINDER");
//                        int radiusSilinder = sc.nextInt();
//                    System.out.printf("%-30s : ", "MASUKKAN TINGGI SILINDER");
//                        int tinggiSilinder = sc.nextInt();
//                    double volumeSilinder = (Math.PI * Math.pow(radiusSilinder,2) * tinggiSilinder);
//                    System.out.printf("%-30s : %.1f\n", "VOLUME SILINDER", volumeSilinder);
//                    break;
//
//                case 5:
//                    System.out.printf("\n%-30s : ", "MASUKKAN ALAS SEGITIGA");
//                    int alasSegitigaLimas = sc.nextInt();
//                    System.out.printf("%-30s : ", "MASUKKAN TINGGI SEGITIGA");
//                    int tinggiSegitigaLimas = sc.nextInt();
//                    System.out.printf("%-30s : ", "MASUKKAN TINGGI LIMAS ");
//                    int tinggiLimas = sc.nextInt();
//                    double alasLimas = 0.5 * alasSegitigaLimas * tinggiSegitigaLimas;
//                    double volumeLimasSegitiga = ((1.0/3.0) * alasLimas * tinggiLimas);
//                    System.out.printf("%-30s : %.1f\n", "VOLUME LIMAS SEGITIGA", volumeLimasSegitiga);
//                    break;
//
//
//                default:
//                    System.out.printf("\n%s\n", "PILIHAN TIDAK VALID. SILAHKAN MEMILIH KEMBALI.");
//            }
//        }
//        while (pilihan != 0);
//        sc.close();
//    }
//}
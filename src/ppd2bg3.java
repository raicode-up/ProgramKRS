//import java.util.Scanner;
///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//public class ppd2bg3 {
//    public static void main(String[] Args){
//
//        Scanner input = new Scanner(System.in);
//        int jamkerja, upah, lembur, denda, total;
//
//        System.out.printf("%-15s : ", "Jam kerja");
//            jamkerja = input.nextInt();
//        lembur = 0;
//        denda = 0;
//
//        if (jamkerja >= 50 && jamkerja <= 60) {
//            upah = jamkerja * 5000;
//        } else {
//            if(jamkerja < 50){
//                upah = jamkerja * 5000;
//                denda = (50 - jamkerja) * 1000;
//            } else {
//                upah = 60 * 5000;
//                lembur = (jamkerja - 60) * 6000;
//            }
//        }
//        total = upah + lembur - denda;
//
//        System.out.printf("%-15s = %s %d\n", "Upah", "Rp.", upah);
//        System.out.printf("%-15s = %s %d\n", "Lembur", "Rp.", lembur);
//        System.out.printf("%-15s = %s %d\n", "Denda", "Rp.", denda);
//        System.out.println("---------------------------------");
//        System.out.printf("%-15s = %s %d\n", "Total", "Rp.", total);
//        input.close();
//    }
//}
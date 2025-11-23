//import java.util.*;
///*
//Nabila Raisiya Zahrani
//255150400111023
//*/
//
//public class ppd5bg2 {
//    public static String prima(int bilangan, int i) {
//        if (bilangan <= 1) {
//            return "Tidak";
//        } else if (bilangan == 2) {
//            return "Ya";
//        } else if (bilangan % i == 0) {
//            return "Tidak";
//        } else if (i > bilangan / 2) {
//            return "Ya";
//        } else {
//            return prima(bilangan, i + 1);
//        }
//    }
//
//    public static void main(String[] Args) {
//        Scanner sc = new Scanner(System.in);
//        int bilangan;
//        int i = 2;
//        String hasil;
//
//        System.out.println("Program Cek Bilangan Prima");
//        bilangan = sc.nextInt();
//
//        if (bilangan < 1 || bilangan > 100){
//            System.out.println("Input bilangan hanya dalam batas 1 - 100");
//        } else {
//            hasil = prima(bilangan, i);
//            System.out.println(hasil);
//        }
//
//        sc.close();
//    }
//}
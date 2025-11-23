//import java.util.Scanner;
///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//public class ppd2bg2 {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        double b, t, IMT;
//
//        System.out.printf("%-20s : ", "Berat badan (kg)");
//            b = input.nextDouble();
//        System.out.printf("%-20s : ", "Tinggi badan (m)");
//            t = input.nextDouble();
//
//        IMT = b / Math.pow(t,2);
//        System.out.printf("%-20s = %.2f", "IMT", IMT);
//
//        if (IMT <= 18.5){
//            System.out.printf("%22s", "Termasuk kurus");
//        } else if (IMT > 18.5 && IMT <= 25) {
//            System.out.printf("%22s", "Termasuk normal");
//        } else if (IMT > 25 && IMT <= 30) {
//            System.out.printf("%22s", "Termasuk gemuk");
//        } else if (IMT > 30) {
//            System.out.printf("%22s", "Termasuk kegemukan");
//        }
//    input.close();
//    }
//}
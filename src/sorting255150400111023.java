//import java.util.Scanner;
//
//public class sorting255150400111023 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Masukkan jumlah elemen : ");
//        int panjangArray = sc.nextInt();
//
//        int[] array = new int [panjangArray];
//
//        System.out.println("Masukkan elemen-elemen array : ");
//        for (int i = 0; i < panjangArray; i++){
//            System.out.print("Elemen ke-" + (i+1) + " : ");
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println("Array sementara : ");
//        for (int sort : array) {
//            System.out.print(sort + " ");
//            System.out.println();
//        }
//
//        System.out.println("Hasil sorting array : ");
//        sortingArray(array);
//        for (int sort : array) {
//            System.out.print(sort + " ");
//        }
//
//        sc.close();
//    }
//
//    public static void sortingArray(int[] array) {
//        int panjangArray = array.length;
//        for (int i = 0; i < panjangArray - 1; i++) {
//            for (int j = 0; j < panjangArray - i - 1; j++) {
//                if (array[j] < array[j + 1]) {
//                    int pindah = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = pindah;
//                }
//            }
//        }
//
//    }
//}

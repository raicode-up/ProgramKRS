//import java.util.*;
//
//public class latian {
//    public static void main(String[] Args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dataAwal = new int[n];
//
//        for (int i = 0; i < n; i++){
//            dataAwal[i] = sc.nextInt();
//        }
//
//        // --- INI CARA BARU TANPA .GET() ---
//
//        // 1. Hitung dulu jumlah bilangan genap
//        int jumlahGenap = 0;
//        for (int i = 0; i < n; i++){
//            if (dataAwal[i] % 2 == 0){
//                jumlahGenap++;
//            }
//        }
//
//        // 2. Buat array baru HANYA untuk angka genap, dengan ukuran yang pas
//        int[] daftarGenap = new int[jumlahGenap];
//
//        // 3. Loop untuk MENGISI 'daftarGenap'
//        int indexGenap = 0; // Penunjuk untuk 'daftarGenap'
//        for (int i = 0; i < n; i++){
//            if (dataAwal[i] % 2 == 0){
//                // Masukkan angka genap ke array terpisah
//                daftarGenap[indexGenap] = dataAwal[i];
//                indexGenap++; // Pindahkan penunjuk
//            }
//        }
//
//        // 4. Sortir array genap tersebut
//        Arrays.sort(daftarGenap);
//        // Contoh: jika [2, 8, 4], setelah ini menjadi [2, 4, 8]
//
//        // 5. Loop untuk MENGGANTI nilai di 'dataAwal'
//        indexGenap = 0; // Reset penunjuk ke 0
//
//        for (int i = 0; i < n; i++){
//            // Cek lagi, jika slot di 'dataAwal' adalah slot genap
//            if (dataAwal[i] % 2 == 0){
//                // Ambil angka dari 'daftarGenap' yang sudah urut
//                dataAwal[i] = daftarGenap[indexGenap];
//                // Pindahkan penunjuk ke angka genap berikutnya
//                indexGenap++;
//            }
//        }
//
//        // 6. Cetak hasil akhir
//        for (int i = 0; i < n; i++){
//            System.out.print(dataAwal[i] + " ");
//        }
//    }
//}
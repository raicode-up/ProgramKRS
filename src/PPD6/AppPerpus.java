///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//
//package PPD6;
//
//import java.util.*;
//
//public class AppPerpus {
//    static Scanner sc = new Scanner(System.in);
//    static kategoriBuku[] perpustakaan = new kategoriBuku[7];
//
//    public static void isiKategori() {
//        System.out.println("Memuat data awal perpustakaan...");
//
//        kategoriBuku tekno = new kategoriBuku("Teknologi");
//        tekno.tambahBuku(new buku("Clean Code", new String[]{"Robert C. Martin"}));
//        tekno.tambahBuku(new buku("The Pragmatic Programmer", new String[]{"Andrew Hunt", "David Thomas"}));
//        tekno.tambahBuku(new buku("Design Patterns", new String[]{"Erich Gamma", "Richard Helm"}));
//        tekno.tambahBuku(new buku("Artificial Intelligence", new String[]{"Stuart Russell", "Peter Norvig"}));
//        tekno.tambahBuku(new buku("Code Complete", new String[]{"Steve McConnell"}));
//        perpustakaan[0] = tekno;
//
//        kategoriBuku filsafat = new kategoriBuku("Filsafat");
//        filsafat.tambahBuku(new buku("Thus Spoke Zarathustra", new String[]{"Friedrich Nietzsche"}));
//        filsafat.tambahBuku(new buku("Meditations", new String[]{"Marcus Aurelius"}));
//        filsafat.tambahBuku(new buku("The Republic", new String[]{"Plato"}));
//        filsafat.tambahBuku(new buku("Critique of Pure Reason", new String[]{"Immanuel Kant"}));
//        filsafat.tambahBuku(new buku("Being and Time", new String[]{"Martin Heidegger"}));
//        perpustakaan[1] = filsafat;
//
//        kategoriBuku sejarah = new kategoriBuku("Sejarah");
//        sejarah.tambahBuku(new buku("Sapiens", new String[]{"Yuval Noah Harari"}));
//        sejarah.tambahBuku(new buku("Guns, Germs, and Steel", new String[]{"Jared Diamond"}));
//        sejarah.tambahBuku(new buku("The Rise and Fall of the Third Reich", new String[]{"William L. Shirer"}));
//        sejarah.tambahBuku(new buku("A People's History of the US", new String[]{"Howard Zinn"}));
//        sejarah.tambahBuku(new buku("1491", new String[]{"Charles C. Mann"}));
//        perpustakaan[2] = sejarah;
//
//        kategoriBuku agama = new kategoriBuku("Agama");
//        agama.tambahBuku(new buku("Mere Christianity", new String[]{"C.S. Lewis"}));
//        agama.tambahBuku(new buku("The Purpose Driven Life", new String[]{"Rick Warren"}));
//        agama.tambahBuku(new buku("The Case for Christ", new String[]{"Lee Strobel"}));
//        agama.tambahBuku(new buku("Tafsir Al-Mishbah", new String[]{"Quraish Shihab"}));
//        agama.tambahBuku(new buku("The God Delusion", new String[]{"Richard Dawkins"}));
//        perpustakaan[3] = agama;
//
//        kategoriBuku psikologi = new kategoriBuku("Psikologi");
//        psikologi.tambahBuku(new buku("Thinking, Fast and Slow", new String[]{"Daniel Kahneman"}));
//        psikologi.tambahBuku(new buku("Man's Search for Meaning", new String[]{"Viktor Frankl"}));
//        psikologi.tambahBuku(new buku("Influence", new String[]{"Robert Cialdini"}));
//        psikologi.tambahBuku(new buku("The Interpretation of Dreams", new String[]{"Sigmund Freud"}));
//        psikologi.tambahBuku(new buku("Atomic Habits", new String[]{"James Clear"}));
//        perpustakaan[4] = psikologi;
//
//        kategoriBuku politik = new kategoriBuku("Politik");
//        politik.tambahBuku(new buku("The Prince", new String[]{"Niccolò Machiavelli"}));
//        politik.tambahBuku(new buku("Das Kapital", new String[]{"Karl Marx"}));
//        politik.tambahBuku(new buku("The Road to Serfdom", new String[]{"Friedrich Hayek"}));
//        politik.tambahBuku(new buku("The Origins of Totalitarianism", new String[]{"Hannah Arendt"}));
//        politik.tambahBuku(new buku("Why Nations Fail", new String[]{"Daron Acemoglu", "James A. Robinson"}));
//        perpustakaan[5] = politik;
//
//        kategoriBuku fiksi = new kategoriBuku("Fiksi");
//        fiksi.tambahBuku(new buku("1984", new String[]{"George Orwell"}));
//        fiksi.tambahBuku(new buku("Brave New World", new String[]{"Aldous Huxley"}));
//        fiksi.tambahBuku(new buku("Dune", new String[]{"Frank Herbert"}));
//        fiksi.tambahBuku(new buku("The Lord of the Rings", new String[]{"J.R.R. Tolkien"}));
//        fiksi.tambahBuku(new buku("Laskar Pelangi", new String[]{"Andrea Hirata"}));
//        perpustakaan[6] = fiksi;
//
//        System.out.println("\nData awal berhasil dimuat. Masuk ke menu utama.\n");
//    }
//
//    public static void menuUtama() {
//        System.out.println("\n===== PERPUSTAKAAN KAMPUS X =====");
//        System.out.println("1. Tambah Buku");
//        System.out.println("2. Tampilkan Semua Kategori");
//        System.out.println("0. Keluar");
//        System.out.print("Pilih menu (0-2): ");
//    }
//
//    public static void tampilkanKategori() {
//        System.out.println("\n===== DAFTAR SEMUA BUKU DI PERPUSTAKAAN =====");
//        for (kategoriBuku kat : perpustakaan) {
//            kat.display();
//        }
//    }
//
//    public static void nambahBuku() {
//        System.out.println("Pilih Kategori Buku yang Akan Ditambahkan");
//
//        for (int i = 0; i < perpustakaan.length; i++) {
//            kategoriBuku kategori = perpustakaan[i];
//            System.out.println((i + 1) + ". " + kategori.nama +
//                    " (" + kategori.jumBukuSem + "/" + kategori.daftarBuku.length + ")");
//        }
//
//        System.out.println("0. Batal");
//        System.out.print("Pilih kategori (0-7): ");
//
//        int pilKategori = sc.nextInt();
//        sc.nextLine();
//
//        if (pilKategori == 0) {
//            System.out.println("Penambahan buku dibatalkan.");
//            return;
//        }
//
//        if (pilKategori > 0 && pilKategori <= perpustakaan.length) {
//            kategoriBuku kategoriPilihan = perpustakaan[pilKategori - 1];
//
//            if (kategoriPilihan.jumBukuSem >= kategoriPilihan.daftarBuku.length) {
//                System.out.println("Maaf, Kategori " + kategoriPilihan.nama + " sudah penuh (Maks 7).");
//            } else {
//                System.out.println("\nInput Buku untuk Kategori: " + kategoriPilihan.nama);
//                inputBuku(kategoriPilihan);
//            }
//        } else {
//            System.out.println("Pilihan kategori tidak valid.");
//        }
//    }
//
//    public static void inputBuku(kategoriBuku kat) {
//        System.out.printf("%-15s : ", "Masukkan Judul");
//        String judulInput = sc.nextLine();
//
//        System.out.printf("%-15s : ", "Jumlah Penulis (angka)");
//        int jumPenulis = sc.nextInt();
//        sc.nextLine();
//
//        String[] penulis = new String[jumPenulis];
//        for (int j = 0; j < jumPenulis; j++) {
//            System.out.print("Masukkan nama Penulis ke-" + (j + 1) + ": ");
//            penulis[j] = sc.nextLine();
//        }
//        buku bukuInput = new buku(judulInput, penulis);
//        kat.tambahBuku(bukuInput);
//    }
//
//    public static void main(String[] args) {
//        isiKategori();
//
//        while (true) {
//            menuUtama();
//            int pilihan = sc.nextInt();
//            sc.nextLine();
//
//            if (pilihan == 1) {
//                nambahBuku();
//            } else if (pilihan == 2) {
//                tampilkanKategori();
//            } else if (pilihan == 0) {
//                System.out.println("Terima kasih!");
//                break;
//            } else {
//                System.out.println("Pilihan tidak valid.");
//            }
//        }
//
//        sc.close();
//    }
//}
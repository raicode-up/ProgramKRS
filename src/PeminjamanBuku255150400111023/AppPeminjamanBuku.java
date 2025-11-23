package PeminjamanBuku255150400111023;

import java.util.Scanner;

public class AppPeminjamanBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s\n", "=".repeat(88));
        System.out.printf("%62s\n", "APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN");
        System.out.printf("%s\n", "=".repeat(88));

        System.out.print("Masukkan NIM Mahasiswa             : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama Mahasiswa            : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jumlah Buku yang Dipinjam : ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);

        System.out.printf("\n%s\n", "-".repeat(88));
        System.out.printf("%-88s\n", "                              INPUT DATA BUKU");
        System.out.printf("%s\n", "-".repeat(88));

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.printf("\nBuku ke-%d\n", (i + 1));
            System.out.print("  ISBN       : ");
            String isbn = scanner.nextLine();

            System.out.print("  Judul Buku : ");
            String judul = scanner.nextLine();

            Buku buku = new Buku(isbn, judul);
            mahasiswa.pinjam(buku);
        }

        System.out.printf("\n%s\n", "=".repeat(88));
        System.out.printf("%s%-21s%s\n", " ".repeat(33), "DATA PEMINJAMAN BUKU", " ".repeat(34));
        System.out.printf("%s\n", "=".repeat(88));
        System.out.printf("\n");
        mahasiswa.cetakDataPeminjaman();

        scanner.close();
    }
}


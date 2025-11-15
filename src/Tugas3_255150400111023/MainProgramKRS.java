package Tugas3_255150400111023;

import java.util.*;

public class MainProgramKRS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%41s\n","PROGRAM PENGISIAN KRS");
        System.out.println("=".repeat(60));
        System.out.printf("%s %1s ", "Masukkan Nama Anda", ":");
        String namaMahasiswa = sc.nextLine();
        System.out.printf("%s %2s ", "Masukkan NIM Anda", ":");
        String NIMMahasiswa = sc.nextLine();

        mahasiswa idMahasiswa = new mahasiswa(namaMahasiswa, NIMMahasiswa);
        System.out.printf("%s, %-16s!\n", "Selamat datang", idMahasiswa.getNamaMahasiswa());
        System.out.printf("%15s %d %s\n", "Jumlah maksimal SKS yang dapat Anda ambil adalah", idMahasiswa.sksMax, "SKS.");

        while (true) {
            System.out.println("-".repeat(40));

            if (idMahasiswa.getJumSks() == mahasiswa.sksMax) {
                System.out.println("SKS Anda sudah penuh (24 SKS).");
                break;
            }

            System.out.print("Apakah Anda ingin menambah mata kuliah? (y/t): ");
            String tambah = sc.nextLine();
            if (!tambah.equalsIgnoreCase("y")) {
                break;
            }

            System.out.println("\nSilakan masukkan data mata kuliah:");
            System.out.printf("%s %7s", "Kode MK", ": ");
            String kodeMk = sc.nextLine();
            System.out.printf("%s %7s", "Nama MK", ": ");
            String namaMk = sc.nextLine();

            int sks = 0;
            while (true) {
                try {
                    System.out.printf("%s %4s", "Jumlah SKS", ": ");
                    sks = Integer.parseInt(sc.nextLine());
                    if (sks <= 0) {
                        System.out.println("SKS harus angka positif. Coba lagi.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input SKS tidak valid. Harap masukkan angka. Coba lagi.");
                }
            }
            mataKuliah mkBaru = new mataKuliah(kodeMk, namaMk, sks);

            idMahasiswa.tambahMk(mkBaru);
        }

        System.out.printf("%s %1s ", "Masukkan Nama PDA Anda", ":");
        String namaDPA = sc.nextLine();

        System.out.println("\n===== Pengisian KRS Selesai =====");
        System.out.println("Berikut adalah hasil cetak KRS Anda:");

        idMahasiswa.printKrs(namaDPA);

        sc.close();
    }
}

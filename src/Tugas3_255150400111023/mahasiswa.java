package Tugas3_255150400111023;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class mahasiswa {
    private String namaMahasiswa;
    private String NIM;
    private ArrayList<mataKuliah> listMk;
    private int jumSKS;

    public static final int sksMax = 24;

    public mahasiswa(String namaMahasiswa, String NIM) {
        this.NIM = NIM;
        this.namaMahasiswa = namaMahasiswa;
        this.listMk = new ArrayList<>();
        this.jumSKS = 0;
    }

    public String getNamaMahasiswa() {
        return this.namaMahasiswa;
    }

    public int getJumSks() {
        return this.jumSKS;
    }

    public void tambahMk(mataKuliah matkul) {
        if (this.jumSKS + matkul.getSks() > sksMax) {
            System.out.println("Penambahan Mata Kuliah Gagal! Total SKS akan melebihi batas " + sksMax + " SKS.");
            System.out.printf("%-10s : %d%n", "       Total SKS Anda saat ini", this.jumSKS);
            System.out.printf("%-10s : %d%n%n", "       SKS Mata Kuliah " + matkul.getNamaMk(), matkul.getSks());return;
        }

        this.listMk.add(matkul);
        this.jumSKS += matkul.getSks();
        System.out.println("Penambahan Mata Kuliah Berhasil!");
        System.out.println("Total SKS Anda saat ini: " + this.jumSKS + " / " + sksMax + "\n");
    }

    public void printKrs(String namaDPA) {
        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%42s\n","KARTU RENCANA STUDI (KRS)");
        System.out.println("=".repeat(60));
        System.out.printf("Nama       : %s%n", this.namaMahasiswa);
        System.out.printf("NIM        : %s%n", this.NIM);
        System.out.println("-".repeat(60));
        System.out.println("Daftar Mata Kuliah yang Diambil:");

        if (this.listMk.isEmpty()) {
            System.out.println("Belum ada mata kuliah yang didaftarkan.");
        } else {
            System.out.println("-".repeat(60));
            System.out.println(String.format("%-3s | %-10s | %-30s | %s", "No", "KODE", "NAMA MATA KULIAH", "SKS"));
            System.out.println("-".repeat(60));

            int no = 1;
            for (mataKuliah mk : this.listMk) {
                System.out.printf("%-3d | %-10s | %-30s | %d SKS%n", no++, mk.getKodeMk(), mk.getNamaMk(), mk.getSks()
                );
            }
            System.out.println("-".repeat(60));
            System.out.printf("TOTAL SKS  : %d%n", this.jumSKS);
            System.out.println("=".repeat(60));
            System.out.println("\n");

            Locale localeIndonesia = new Locale("id", "ID");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", localeIndonesia);
            String tanggalHariIni = LocalDate.now().format(formatter);
            String tanggalCetak = "Malang, " + tanggalHariIni;

            System.out.printf("%60s%n", tanggalCetak);
            System.out.printf("%60s%n", "Mengetahui,");
            System.out.printf("%60s%n%n%n%n", "Dosen Pembimbing Akademik");
            System.out.printf("%60s%n", "( " + namaDPA + " )");
            System.out.printf("%60s%n", "------------------------------");
            System.out.printf("%60s%n", "(KPS untuk " + this.namaMahasiswa + " - " + this.NIM + ")");
            System.out.println("\n");
        }
    }
}
package PeminjamanBuku255150400111023;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Buku[] daftarBukuPinjam;
    private int jumlahBuku;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.daftarBukuPinjam = new Buku[100]; // maksimal 100 buku
        this.jumlahBuku = 0;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Buku[] getDaftarBukuPinjam() {
        return daftarBukuPinjam;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void pinjam(Buku buku) {
        if (jumlahBuku < daftarBukuPinjam.length) {
            daftarBukuPinjam[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Maaf, kapasitas peminjaman penuh!");
        }
    }

    public void cetakDataPeminjaman() {
        System.out.printf("%s\n", "=".repeat(88));
        System.out.printf("Nim  : %s\n", nim);
        System.out.printf("Nama : %s\n", nama);
        System.out.printf("%s\n", "-".repeat(88));
        System.out.printf("| %-2s | %-33s | %-44s |\n", "No", "Isbn", "Judul");
        System.out.printf("%s\n", "-".repeat(88));

        for (int i = 0; i < jumlahBuku; i++) {
            Buku buku = daftarBukuPinjam[i];
            System.out.printf("| %-2d | %-33s | %-44s |\n",
                (i + 1), buku.getIsbn(), buku.getJudul());
        }

        System.out.printf("%s\n", "-".repeat(88));
    }
}


package PeminjamanBuku255150400111023;

public class Buku {
    private String isbn;
    private String judul;

    public Buku(String isbn, String judul) {
        this.isbn = isbn;
        this.judul = judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}


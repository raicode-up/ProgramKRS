package Tugas3_255150400111023;

public class mataKuliah {
    private String kodeMk;
    private String namaMk;
    private int sks;

    public mataKuliah(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String getNamaMk(){
        return this.namaMk;
    }

    public String getKodeMk(){
        return this.kodeMk;
    }

    public int getSks() {
        return this.sks;
    }
}
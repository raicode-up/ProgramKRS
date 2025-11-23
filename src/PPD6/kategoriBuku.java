///*
//Nabila Raisiya Zahrani
//255150400111023
// */
//
//package PPD6;
//
//public class kategoriBuku {
//    String nama;
//    buku[] daftarBuku = new buku[7];
//    int jumBukuSem = 0;
//
//    public kategoriBuku(String namaKategori){
//        nama = namaKategori;
//    }
//
//    public void tambahBuku(buku bukuBaru){
//        if (jumBukuSem < 7){
//            daftarBuku[jumBukuSem] = bukuBaru;
//            jumBukuSem ++;
//            System.out.println("'" + bukuBaru.judul + "'" + " berhasil ditambahkan.");
//        } else {
//            System.out.println("Kategori " + nama + " sudah penuh (Maks: 7)!");
//            System.out.println(bukuBaru.judul + " tidak bisa ditambahkan");
//        }
//    }
//
//    public void display(){
//        System.out.printf("%-10s : %s (%s %d/%d)\n", "Kategori", nama, "Terisi", jumBukuSem, 7);
//        System.out.println("--------------------");
//
//        for (int i = 0; i < jumBukuSem; i++){
//            daftarBuku[i].display();
//            System.out.println("\n");
//        }
//
//        System.out.println("=================================\n");
//    }
//}
public class Buku{
    String kodeBuku;
    String judul;
    int tahun;

    Buku(String kodeBuku, String judul, int tahun){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampilBuku(){
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul +" | Tahun: " + tahun);
    }
}
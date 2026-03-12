package KuisPrak;

public class Mahasiswa {
    String nim;
    String nama;
    Buku [] bukuDipinjam;
    int jumlahBukuDipinjam;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new Buku[2];
        this.jumlahBukuDipinjam = 0;
    }

    public void tampilBukuDipinjam() {
        System.out.println("Buku yang dipinjam oleh " + nama + ":");
        for (int i = 0; i < jumlahBukuDipinjam; i++) {
            System.out.println("- " + bukuDipinjam[i].judulBuku);
            if (i < jumlahBukuDipinjam - 1) {
                System.out.println("  |");
            }
        }
    }
}

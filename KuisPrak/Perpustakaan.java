package KuisPrak;

public class Perpustakaan {
    Buku [] daftarBuku = new Buku[50];
    Mahasiswa [] daftarMahasiswa = new Mahasiswa[50];
    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Kapasitas buku sudah penuh.");
        }
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (jumlahMahasiswa < daftarMahasiswa.length) {
            daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
            jumlahMahasiswa++;
        } else {
            System.out.println("Kapasitas mahasiswa sudah penuh.");
        }
    }

    public void pinjamBuku(String nim, String kodeBuku) {
        Mahasiswa mhs = cariMahasiswa(nim);
        Buku buku = cariBuku(kodeBuku);

        if (mhs != null && buku != null) {
            if (buku.statusPeminjaman) {
                System.out.println("Gagal meminjam buku: " + buku.judulBuku + " karena sudah dipinjam orang lain.");
                return;
            }
            if (mhs.jumlahBukuDipinjam >= 2) {
                System.out.println("Gagal meminjam: " + mhs.nama + " sudah mencapai maksimal peminjaman (2 buku).");
                return;
            }
            
            buku.statusPeminjaman = true;
            mhs.bukuDipinjam[mhs.jumlahBukuDipinjam] = buku;
            mhs.jumlahBukuDipinjam++;
            System.out.println(mhs.nama + " berhasil meminjam " + buku.judulBuku);
        } else {
            System.out.println("Mahasiswa atau Buku tidak ditemukan.");
        }
    }

    public void kembalikanBuku (String nim, String kodeBuku) {
        Mahasiswa mhs = cariMahasiswa(nim);
        if (mhs != null) {
            for (int i = 0; i < mhs.jumlahBukuDipinjam; i++) {
                if (mhs.bukuDipinjam[i].kodeBuku.equals(kodeBuku)){
                    mhs.bukuDipinjam[i].statusPeminjaman = false;
                    System.out.println(mhs.nama + " mengembalikan " + mhs.bukuDipinjam[i].judulBuku);
                }

                for (int j = i; j < mhs.jumlahBukuDipinjam -1; j++) {
                    mhs.bukuDipinjam[j] = mhs.bukuDipinjam[j+1];
                }
                mhs.bukuDipinjam[mhs.jumlahBukuDipinjam - 1] = null;
                mhs.jumlahBukuDipinjam--;
                return;
            }
        }
        System.out.println("Buku tidak ditemukan di daftar pinjaman mahasiswa");   
    }

    public void tampilkanPeminjaman() {
        System.out.println("Daftar Peminjaman Buku:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            daftarMahasiswa[i].tampilBukuDipinjam();
        }
    }

    private Mahasiswa cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    private Buku cariBuku(String kodeBuku) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kodeBuku.equals(kodeBuku)) {
                return daftarBuku[i];
            }
        }
        return null;
    }
    
}
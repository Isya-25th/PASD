package KuisPrak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do{
            System.out.println("Menu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode buku: ");
                    String kodeBuku = scanner.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judulBuku = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    perpus.tambahBuku(new Buku(kodeBuku, judulBuku, penulis, false));
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    perpus.tambahMahasiswa(new Mahasiswa(nim, nama));
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    kodeBuku = scanner.nextLine();
                    perpus.pinjamBuku(nim, kodeBuku);
                    break;
                case 4:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    nim = scanner.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    kodeBuku = scanner.nextLine();
                    perpus.kembalikanBuku(nim, kodeBuku);
                    break;
                case 5:
                    perpus.tampilkanPeminjaman();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak tersedia. Silakan coba lagi.");
            } 
        } while (pilihan != 6);
    }
}

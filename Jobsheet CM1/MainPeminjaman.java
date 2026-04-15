import java.util.Scanner;

/**
 * Nama  : Isya Putra Ragil
 * Kelas : SIB-1B
 * NIM   : 254107060116
 */

public class MainPeminjaman {

    // Method Insertion Sort
    static void insertionSortByDenda(Peminjaman[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman key = arr[i];
            int j = i - 1;
            // Sorting descending berdasarkan denda
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Method Insertion Sort
    static void insertionSortByNim(Peminjaman[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman key = arr[i];
            int j = i - 1;
            // Sorting ascending berdasarkan NIM
            while (j >= 0 && arr[j].mhs.nim.compareTo(key.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Method Binary Search (menggunakan clone)
    static void binarySearchByNim(Peminjaman[] arr, String searchNim) {
        // Clone array untuk menjaga data asli tetap utuh
        Peminjaman[] tempArr = arr.clone();
        
        // Pastikan array diurutkan berdasarkan NIM sebelum melakukan binary search
        insertionSortByNim(tempArr); 
        
        int left = 0;
        int right = tempArr.length - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = tempArr[mid].mhs.nim.compareTo(searchNim);
            
            if (cmp == 0) {
                foundIndex = mid;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Data Peminjaman Ditemukan:");
            
            int start = foundIndex;
            while (start > 0 && tempArr[start - 1].mhs.nim.equals(searchNim)) {
                start--;
            }
            
            int end = foundIndex;
            while (end < tempArr.length - 1 && tempArr[end + 1].mhs.nim.equals(searchNim)) {
                end++;
            }

            for (int i = start; i <= end; i++) {
                tempArr[i].tampilPeminjaman();
            }
        } else {
            System.out.println("Data peminjaman dengan NIM " + searchNim + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] daftarMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] daftarBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] daftarPinjam = {
            new Peminjaman(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman(daftarMhs[0], daftarBuku[1], 4)
        };

        int menu;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    // Memanggil method sorting
                    insertionSortByDenda(daftarPinjam);
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM: ");
                    String cariNim = sc.nextLine();
                    // Memanggil method searching
                    binarySearchByNim(daftarPinjam, cariNim);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 0);

        sc.close();
    }
}
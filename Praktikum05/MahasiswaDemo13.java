import java.util.Scanner;

public class MahasiswaDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            Mahasiswa13 m = new Mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK DESC (Bubble Sort): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK ASC (Selection Sort): ");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK ASC (Insertion Sort): ");
        list.insertionSort();
        list.tampil();
        
        sc.close();
    }
}
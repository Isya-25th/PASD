import java.util.Scanner;

public class SLLMain13 {
    public static void main(String[] args) {
        SingleLinkedList13 sll = new SingleLinkedList13();
        Scanner sc = new Scanner(System.in);
        String konfirmasi;

        do {
            System.out.println("=== Masukkan Data Mahasiswa ===");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa13 mhsBaru = new Mahasiswa13(nim, nama, kelas, ipk);

            sll.addLast(mhsBaru);

            System.out.print("Tambah data mahasiswa lagi? (y/n): ");
            konfirmasi = sc.nextLine();
            System.out.println();

        } while (konfirmasi.equalsIgnoreCase("y"));

        System.out.println("=== Hasil Akhir Linked List ===");
        sll.print();
    }
}
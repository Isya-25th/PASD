import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas maksimal antrian hari ini: ");
        int kapasitas = sc.nextInt();
        QueueLinkedList antrianLayanan = new QueueLinkedList(kapasitas);

        int menu;
        do {
            System.out.println("\n=== Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Daftar Antrian Baru (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Tampilkan Seluruh Antrian & Jumlah");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (!antrianLayanan.isFull()) {
                        System.out.print("Masukkan NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Keperluan: ");
                        String keperluan = sc.nextLine();
                        Mahasiswa mhsBaru = new Mahasiswa(nim, nama, keperluan);
                        antrianLayanan.enqueue(mhsBaru);
                    } else {
                        System.out.println("Kapasitas antrian penuh! Silakan datang kembali nanti.");
                    }
                    break;
                case 2:
                    antrianLayanan.dequeue();
                    break;
                case 3:
                    antrianLayanan.peekFrontAndRear();
                    break;
                case 4:
                    antrianLayanan.printQueue();
                    break;
                case 5:
                    antrianLayanan.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program layanan. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 0);
    }
}

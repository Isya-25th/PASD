import java.util.Scanner;

public class MainSurat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat13 tumpukanSurat = new StackSurat13(10);
        int menu;

        do {
            System.out.println("\n Sistem Pengelolaan Surat Izin Mahasiswa:");
            System.out.println("1. Terima Surat Izin  (Masukkan ke tumpukan)");
            System.out.println("2. Proses Surat Izin (Validasi surat teratas)");
            System.out.println("3. Lihat Surat Izin Terakhir (Cek surat teratas)");
            System.out.println("4. Cari Surat Izin (Berdasarkan Nama)");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n-- Masukkan Data Surat Baru --");
                    System.out.print("ID Surat      : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis (S/I)   : ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = sc.nextInt();
                    
                    Surat13 suratBaru = new Surat13(id, nama, kelas, jenis, durasi);
                    tumpukanSurat.push(suratBaru);
                    System.out.println("Surat berhasil diterima dan ditumpuk!");
                    break;

                case 2:
                    Surat13 suratDiproses = tumpukanSurat.pop();
                    if (suratDiproses != null) {
                        System.out.println("\n-- Memproses Surat --");
                        System.out.println("Memproses surat ID " + suratDiproses.idSurat + " atas nama " + suratDiproses.namaMahasiswa);
                        System.out.println("status: Tervalidasi dan dikeluarkan dari tumpukan.");
                    }
                    break;

                case 3:
                    Surat13 suratTeratas = tumpukanSurat.pop();
                    if (suratTeratas != null) {
                        System.out.println("\n-- Informasi Surat Paling Atas --");
                        System.out.println("ID Surat      : " + suratTeratas.idSurat);
                        System.out.println("Nama Mahasiswa: " + suratTeratas.namaMahasiswa);
                        System.out.println("Kelas         : " + suratTeratas.kelas);
                        System.out.println("Jenis Izin    : " + (suratTeratas.jenisIzin == 'S' || suratTeratas.jenisIzin == 's' ? "Sakit" : "Izin Lainnya"));
                        System.out.println("Durasi        : " + suratTeratas.durasi + " hari");
                    }
                    break;
                
                case 4:
                    System.out.print("\nMasukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    tumpukanSurat.cariSurat(cariNama);
                    break;
                
                case 0:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (menu!= 0);
    }
}

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int menu;

        do {
            System.out.println("Menu Data Dosen:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC berdasar usia (Bubble Sort)");
            System.out.println("4. Sorting DSC berdasar usia (Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();
                    Boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    
                    Dosen dsnBaru = new Dosen(kode, nama, jk, usia);
                    data.tambah(dsnBaru);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (menu != 5);

        sc.close();
    }
}
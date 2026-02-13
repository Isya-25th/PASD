import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Input Jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }

    static void tampilkanSemua(String[][] jadwal, int n) {
        System.out.println("=== Jadwal Kuliah ===");
        System.out.printf("%-20s %-20s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-20s %-10s %-15s\n", 
                              jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    static void tampilkanHari(String[][] jadwal, int n, String hari) {
        System.out.println("=== Jadwal Hari " + hari + " ===");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-20s %-20s %-10s %-15s\n", 
                                  jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    static void tampilkanMatkul(String[][] jadwal, int n, String matkul) {
        System.out.println("=== Jadwal Mata Kuliah " + matkul + " ===");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-20s %-20s %-10s %-15s\n", 
                                  jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilkanSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilkanHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        tampilkanMatkul(jadwal, n, matkul);
    }
}

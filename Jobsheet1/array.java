import java.util.Scanner;

public class array{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "CTPS", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "K3"};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        double totalBobotNilai = 0.0;
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
            totalBobotNilai += bobotNilai[i];
        }
        double ipSemester = totalBobotNilai / mataKuliah.length;
        System.out.println("================================");
        System.out.println("hasil Konversi Nilai:");
        System.out.println("================================");
        System.out.println("Mata Kuliah\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-25s\t\t%.2f\t\t%s\t\t%.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("================================");
        System.out.printf("IP: %.2f\n", ipSemester);
        sc.close();
    }
}
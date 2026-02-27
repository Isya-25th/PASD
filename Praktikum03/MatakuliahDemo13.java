package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah Matakuliah yang akan diinput : ");
        dummy = sc.nextLine();
        int jumlahMatakuliah = Integer.parseInt(dummy);

        Matakuliah13[] arrayOfMatakuliah13 = new Matakuliah13[jumlahMatakuliah];

        for (int i=0; i < jumlahMatakuliah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode    : ");
            kode = sc.nextLine();
            System.out.print("Nama    : ");
            nama = sc.nextLine();
            System.out.print("Sks     : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");

            arrayOfMatakuliah13[i] = new Matakuliah13();
            arrayOfMatakuliah13[i].tambahData(kode, nama, sks, jumlahJam);
        }

        int index = 1;
        for (Matakuliah13 matakuliah : arrayOfMatakuliah13) {
            System.out.println("Data Matakuliah ke-"+ index++);
            matakuliah.cetakInfo();
            System.out.println("--------------------------------------");
        }
    }
}
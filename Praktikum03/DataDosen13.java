package Praktikum03;

public class DataDosen13 {
    public void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        for (int i=0; i < 3; i++) {
            System.out.println("Data Dosen ke-"+ (i + 1));
            System.out.println("Kode            :"+ arrayOfDosen[i].kode);
            System.out.println("Nama            :"+ arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin   :"+ arrayOfDosen[i].jenisKelamin);
            System.out.println("Usia            :"+ arrayOfDosen[i].usia);
            System.out.println("--------------------------------------");
        }
    }
    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan : " + jumlahPerempuan);
        System.out.println("--------------------------------------");
    }
    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahLakiLaki++;
                totalUsiaLakiLaki += dosen.usia;
            } else {
                jumlahPerempuan++;
                totalUsiaPerempuan += dosen.usia;
            }
        }

        double rerataUsiaLakiLaki = jumlahLakiLaki > 0 ? (double) totalUsiaLakiLaki / jumlahLakiLaki : 0;
        double rerataUsiaPerempuan = jumlahPerempuan > 0 ? (double) totalUsiaPerempuan / jumlahPerempuan : 0;

        System.out.println("Rerata Usia Dosen Laki-laki : " + rerataUsiaLakiLaki);
        System.out.println("Rerata Usia Dosen Perempuan : " + rerataUsiaPerempuan);
        System.out.println("--------------------------------------");
    }
    public void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        Dosen13 dosenPalingTua = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode            : " + dosenPalingTua.kode);
        System.out.println("Nama            : " + dosenPalingTua.nama);
        System.out.println("Jenis Kelamin   : " + dosenPalingTua.jenisKelamin);
        System.out.println("Usia            : " + dosenPalingTua.usia);
        System.out.println("--------------------------------------");
    }
    public void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        Dosen13 dosenPalingMuda = arrayOfDosen[0];

        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen;
            }
        }

        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode            : " + dosenPalingMuda.kode);
        System.out.println("Nama            : " + dosenPalingMuda.nama);
        System.out.println("Jenis Kelamin   : " + dosenPalingMuda.jenisKelamin);
        System.out.println("Usia            : " + dosenPalingMuda.usia);
        System.out.println("--------------------------------------");
    }

}

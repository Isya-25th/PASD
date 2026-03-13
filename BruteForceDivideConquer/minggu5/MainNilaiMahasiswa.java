package minggu5;

public class MainNilaiMahasiswa {

    static int cariMaxUTSDC(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lMax = cariMaxUTSDC(arr, l, mid);
        int rMax = cariMaxUTSDC(arr, mid + 1, r);
        return Math.max(lMax, rMax);
    }

    static int cariMinUTSDC(NilaiMahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lMin = cariMinUTSDC(arr, l, mid);
        int rMin = cariMinUTSDC(arr, mid + 1, r);
        return Math.min(lMin, rMin);
    }

    static double rataRataUASBF(NilaiMahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        NilaiMahasiswa[] mhs = new NilaiMahasiswa[8];
        mhs[0] = new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88);
        mhs[2] = new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84);

        System.out.println("Hasil :");
        
        int maxUTS = cariMaxUTSDC(mhs, 0, mhs.length - 1);
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer) : " + maxUTS);

        int minUTS = cariMinUTSDC(mhs, 0, mhs.length - 1);
        System.out.println("b) Nilai UTS terendah (Divide and Conquer)  : " + minUTS);

        double rataUAS = rataRataUASBF(mhs);
        System.out.println("c) Rata-rata nilai UAS (Brute Force)        : " + rataUAS);
    }
}
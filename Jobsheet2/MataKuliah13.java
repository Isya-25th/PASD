public class MataKuliah13 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah13() {
    }

    public MataKuliah13(String kode, String nm, int s, int jam) {
        kodeMK = kode;
        nama = nm;
        sks = s;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK   : " + kodeMK);
        System.out.println("Nama MK   : " + nama);
        System.out.println("SKS       : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("-------------------------");
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS mata kuliah " + nama + " telah diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan! Jam tersisa tidak mencukupi.");
        }
    }
}
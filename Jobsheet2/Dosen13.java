public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen13() {
    }

    public Dosen13(String id, String nm, boolean status, int thn, String bidang) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("-------------------------");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}

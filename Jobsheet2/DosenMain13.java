public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dosen1 = new Dosen13();
        dosen1.idDosen = "D001";
        dosen1.nama = "Rafa Achyana, S.Kom., M.Kom.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Jaringan Komputer";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Sistem Informasi");
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2026) + " tahun");
        dosen1.tampilInformasi();

        Dosen13 dosen2 = new Dosen13("D002", "Masando Fami M, Ph.D.", true, 2020, "Kecerdasan Buatan");
        dosen2.tampilInformasi();
        System.out.println("Masa kerja dosen 2: " + dosen2.hitungMasaKerja(2026) + " tahun");
    }
}
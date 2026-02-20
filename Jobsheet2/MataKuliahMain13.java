public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 mk1 = new MataKuliah13();
        mk1.kodeMK = "ASD25";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah13 mk2 = new MataKuliah13("BD5", "Basis Data", 2, 4);
        mk2.tampilInformasi();
        mk2.kurangiJam(5);
    }
}
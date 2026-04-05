public class MahasiswaDemo13 {
    public static void main(String[] args) {
        MahasiswaBerprestasi13 list = new MahasiswaBerprestasi13();
        
        Mahasiswa13 m1 = new Mahasiswa13("123", "Zidan", "2A", 3.2);
        Mahasiswa13 m2 = new Mahasiswa13("124", "Ayu", "2A", 3.5);
        Mahasiswa13 m3 = new Mahasiswa13("125", "Sofi", "2A", 3.1);
        Mahasiswa13 m4 = new Mahasiswa13("126", "Sita", "2A", 3.9);
        Mahasiswa13 m5 = new Mahasiswa13("127", "Miki", "2A", 3.7);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}
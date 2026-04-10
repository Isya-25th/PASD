public class Mahasiswa13 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa13(){
        
    }

    Mahasiswa13(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
        System.out.println("-----------------------------");
    }
}
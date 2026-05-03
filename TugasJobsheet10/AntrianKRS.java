public class AntrianKRS {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahSelesai;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
        jumlahSelesai = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian KRS berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Mahasiswa tidak dapat masuk antrian.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada mahasiswa yang diproses.");
            return;
        }

        System.out.println("\nMemproses KRS untuk Mahasiswa:");
        int jumlahDipanggil = 0;
        
        while (!isEmpty() && jumlahDipanggil < 2 && jumlahSelesai < 30) {
            Mahasiswa mhs = data[front];
            System.out.print("- ");
            mhs.tampilkanData();
            
            front = (front + 1) % max;
            size--;
            jumlahDipanggil++;
            jumlahSelesai++;
        }
        
        if (isEmpty() && jumlahDipanggil > 0) {
            front = rear = -1;
        }
        
        if (jumlahSelesai >= 30) {
            System.out.println("PERHATIAN: Kuota DPA sudah terpenuhi (30 Mahasiswa).");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n--- Daftar Semua Antrian KRS ---");
            System.out.println("NIM | NAMA | PRODI | KELAS");
            int i = front;
            int counter = 1;
            while (i != rear) {
                System.out.print(counter + ". ");
                data[i].tampilkanData();
                i = (i + 1) % max;
                counter++;
            }
            System.out.print(counter + ". ");
            data[i].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n--- 2 Antrian Terdepan ---");
            int batas = Math.min(size, 2);
            for (int i = 0; i < batas; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n--- Antrian Paling Akhir ---");
            data[rear].tampilkanData();
        }
    }

    public void infoKRS() {
        System.out.println("\n--- Informasi KRS DPA ---");
        System.out.println("Jumlah Antrian Saat Ini: " + size);
        System.out.println("Jumlah Mahasiswa Selesai KRS: " + jumlahSelesai);
        System.out.println("Sisa Kuota DPA (Belum Proses): " + (30 - jumlahSelesai));
    }
}
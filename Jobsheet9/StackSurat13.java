public class StackSurat13 {
    int size;
    int top;
    Surat13[] stack;

    public StackSurat13(int size) {
        this.size = size;
        this.top = -1;
        this.stack =new Surat13[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public void push(Surat13 srt) {
        if (!isFull()) {
            top ++;
            stack[top] = srt;
        } else {
            System.out.println("Tumpukan surat penuh! Tidak bisa menerima surat baru.");
        }
    }

    public Surat13 pop() {
        if (!isEmpty()) {
            Surat13 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tumpukan surat kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat13 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tumpukan surat kosong!");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.println("\nSurat atas nama " + nama + " DITEMUKAN:");
                    System.out.println("Posisi dari atas: Ke-" + (top - i + 1));
                    System.out.println("ID Surat: " + stack[i].idSurat);
                    System.out.println("Kelas: " + stack[i].kelas);
                    System.out.println("Jenis Izin: " + (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's'? "Sakit" : "Izin Lainnya"));
                    System.out.println("Durasi: " + stack[i].durasi + " hari");
                    ditemukan = true;
                    break;
                }
            }
        }

        if (!ditemukan) {
            System.out.println("\nSurat izin atas nama " + nama + " tidak ditemukan di dalam tumpukan.");
        }
    }
}

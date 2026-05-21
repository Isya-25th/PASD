public class DLLAntrian {
    NodeAntrian head, tail;
    int currentAntrian = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String nama, String noHp) {
        Pembeli pembeliBaru = new Pembeli(currentAntrian, nama, noHp);
        NodeAntrian newNode = new NodeAntrian(tail, pembeliBaru, null);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + currentAntrian);
        currentAntrian++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        
        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.data.noAntrian, current.data.namaPembeli, current.data.NoHp);
            current = current.next;
        }
    }

    public Pembeli hapusAntrian() {
        if (isEmpty()) {
            return null;
        }
        Pembeli p = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return p;
    }
}

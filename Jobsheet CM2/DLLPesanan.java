public class DLLPesanan {
    NodePesanan head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kode, String nama, int harga) {
        Pesanan pesananBaru = new Pesanan(kode, nama, harga);
        NodePesanan newNode = new NodePesanan(tail, pesananBaru, null);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void sortNamaPesanan() {
        if (isEmpty() || head.next == null) return;
        
        boolean swapped;
        NodePesanan current;
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void cetakPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan masuk.");
            return;
        }
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        NodePesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            current = current.next;
        }
        System.out.println("======================================");
    }
}

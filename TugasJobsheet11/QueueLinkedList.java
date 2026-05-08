import java.nio.channels.Pipe.SourceChannel;

public class QueueLinkedList {
    Node front, rear;
    int size;
    int capacity;

    public QueueLinkedList(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Maaf, antrian sudah penuh!");
        } else {
            Node newNode = new Node(data, null);
            if (isEmpty()) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println(data.nama + " berhasil masuk antrian");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada yang bisa dipanggil.");
        } else {
            Mahasiswa dipanggil = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            System.out.println("\n Memanggil Antrian Atas Nama: " + dipanggil.nama);
            dipanggil.printData();
        }
    }

    public void peekFrontAndRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Posisi antrian:");
            System.out.println("Terdepan: ");
            front.data.printData();
            System.out.println("Terakhir: ");
            rear.data.printData();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n Daftar Antrian Layanan");
            Node temp = front;
            int i = 1;
            while (temp != null) {
                System.out.print(i + ". ");
                temp.data.printData();
                temp = temp.next;
                i++;
            }
            System.out.println("Jumlah mahasiswa mengantre: " + size + " orang.");
        }
    }
}

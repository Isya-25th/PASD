public class MahasiswaBerprestasi13 {
    Mahasiswa13[] listMhs = new Mahasiswa13[5];
    int idx;

    void tambah(Mahasiswa13 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa13 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------------");
            }
        }
    }

    // Bubble Sort (DESC)
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j] != null && listMhs[j - 1] != null) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa13 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;
                    }
                }
            }
        }
    }

    // Selection Sort (ASC)
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j] != null && listMhs[idxMin] != null) {
                    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                        idxMin = j;
                    }
                }
            }
            Mahasiswa13 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // Insertion Sort (ASC)
    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            if (listMhs[i] != null) {
                Mahasiswa13 temp = listMhs[i];
                int j = i;
                while (j > 0 && listMhs[j - 1] != null && listMhs[j - 1].ipk > temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
                listMhs[j] = temp;
            }
        }
    }
}
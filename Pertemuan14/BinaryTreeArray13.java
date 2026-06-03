public class BinaryTreeArray13 {
    Mahasiswa13[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray13() {
        this.dataMahasiswa = new Mahasiswa13[10];
        this.idxLast = -1;
    }

    void populateData (Mahasiswa13 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    public void add(Mahasiswa13 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
        } else {
            int currentIdx = 0;
            while (true) {
                if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                    currentIdx = 2 * currentIdx + 1;
                } else {
                    currentIdx = 2 * currentIdx + 2;
                }

                if (dataMahasiswa[currentIdx] == null) {
                    dataMahasiswa[currentIdx] = data;
                    if (currentIdx > idxLast) {
                        idxLast = currentIdx;
                    }
                    break;
                }
            }
        }
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}

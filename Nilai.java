public class Nilai {
    String nama[];
    String nim[];
    int tahunMasuk[];
    int nilaiUts[];
    int nilaiUas[];

    Nilai(int jumlahMahasiswa) {
        nama = new String[jumlahMahasiswa];
        nim = new String[jumlahMahasiswa];
        tahunMasuk = new int[jumlahMahasiswa];
        nilaiUts = new int[jumlahMahasiswa];
        nilaiUas = new int[jumlahMahasiswa];
    }

    // a) Nilai UTS tertinggi menggunakan Divide and Conquer
    int utsTertinggiDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int leftMax = utsTertinggiDC(arr, l, mid);
        int rightMax = utsTertinggiDC(arr, mid + 1, r);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    // b) Nilai UTS terendah menggunakan Divide and Conquer
    int utsTerendahDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int leftMin = utsTerendahDC(arr, l, mid);
        int rightMin = utsTerendahDC(arr, mid + 1, r);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    // c) Rata-rata nilai UAS menggunakan Brute Force
    double rataRataUasBF() {
        int total = 0;
        for (int i = 0; i < nilaiUas.length; i++) {
            total = total + nilaiUas[i];
        }
        return (double) total / nilaiUas.length;
    }
}

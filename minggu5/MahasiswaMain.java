public class MahasiswaMain {
    public static void main(String[] args) {
        int jumlah = 5;
        Nilai nilai = new Nilai(jumlah);

        // Data dummy 5 mahasiswa
        nilai.nama[0] = "Andi Pratama";
        nilai.nim[0] = "2341720001";
        nilai.tahunMasuk[0] = 2023;
        nilai.nilaiUts[0] = 80;
        nilai.nilaiUas[0] = 75;

        nilai.nama[1] = "Budi Santoso";
        nilai.nim[1] = "2341720002";
        nilai.tahunMasuk[1] = 2023;
        nilai.nilaiUts[1] = 90;
        nilai.nilaiUas[1] = 85;

        nilai.nama[2] = "Citra Dewi";
        nilai.nim[2] = "2341720003";
        nilai.tahunMasuk[2] = 2023;
        nilai.nilaiUts[2] = 65;
        nilai.nilaiUas[2] = 70;

        nilai.nama[3] = "Dian Saputra";
        nilai.nim[3] = "2341720004";
        nilai.tahunMasuk[3] = 2023;
        nilai.nilaiUts[3] = 75;
        nilai.nilaiUas[3] = 90;

        nilai.nama[4] = "Eka Fitriani";
        nilai.nim[4] = "2341720005";
        nilai.tahunMasuk[4] = 2023;
        nilai.nilaiUts[4] = 88;
        nilai.nilaiUas[4] = 60;

        // Tampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + nilai.nama[i] + " (" + nilai.nim[i] + ") - Tahun Masuk: " + nilai.tahunMasuk[i] + " | UTS: " + nilai.nilaiUts[i] + " | UAS: " + nilai.nilaiUas[i]);
        }

        System.out.println("\n=== Hasil ===");
        System.out.println("a) Nilai UTS tertinggi (Divide and Conquer): " + nilai.utsTertinggiDC(nilai.nilaiUts, 0, jumlah - 1));
        System.out.println("b) Nilai UTS terendah (Divide and Conquer): " + nilai.utsTerendahDC(nilai.nilaiUts, 0, jumlah - 1));
        System.out.println("c) Rata-rata nilai UAS (Brute Force): " + nilai.rataRataUasBF());
    }
}

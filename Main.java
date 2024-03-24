package PEMLAN_3;

public class Main {
    public static void main(String[] args) {
        // Buat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("12345", "Budi Santoso");

        // Buat objek KHS
        KHS khs1 = new KHS(mhs1);

        // Tambahkan beberapa mata kuliah ke dalam KHS
        khs1.addMataKuliah(new MataKuliah("MK101", "Pemrograman Dasar", 85));
        khs1.addMataKuliah(new MataKuliah("MK102", "Algoritma dan Struktur Data", 78));
        khs1.addMataKuliah(new MataKuliah("MK103", "Jaringan Komputer", 65));

        // Cetak KHS
        khs1.cetakKHS();
    }
}

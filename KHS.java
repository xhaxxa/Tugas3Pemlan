package PEMLAN_3;

import java.util.ArrayList;

public class KHS {
    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> mataKuliahs;

    public KHS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliahs = new ArrayList<>(); // Initialize the ArrayList here
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        mataKuliahs.add(mataKuliah);
    }

    public void cetakKHS() {
        System.out.println("==== KHS ====");
        System.out.println("Mahasiswa: " + mahasiswa.getNim() + " - " + mahasiswa.getNama());
        System.out.println();
        System.out.println("| Kode MK | Nama MK | Nilai Angka | Nilai Huruf |");
        System.out.println("|---|---|---|---|");
        for (MataKuliah mataKuliah : mataKuliahs) {
            System.out.printf("| %s | %s | %d | %s |\n", mataKuliah.getKodeMK(), mataKuliah.getNamaMK(),
                    mataKuliah.getNilaiAngka(), mataKuliah.getNilaiHuruf());
        }
    }
}


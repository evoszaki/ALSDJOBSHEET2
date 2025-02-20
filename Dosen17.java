public class Dosen17 {
    String idDosen;
    String nama;
    Boolean StatusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        if (StatusAktif) {
            System.out.println("Status Aktif: Aktif");
        } else {
            System.out.println("Status Aktif: Tidak Aktif");
        }
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void ubahStatusAktif(Boolean statusBaru) {
        StatusAktif = statusBaru;
    }

    void updateTahunBergabung(int tahunBaru) {
        if (tahunBaru >= 0) {
            tahunBergabung = tahunBaru;
            return;
        } else {
            System.out.println("Tahun bergabung tidak valid. Harus lebih dari 0");
        }
    }

    void updateBidangKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
    }

    public Dosen17() {
    }

    public Dosen17(String idDosen, String nama, Boolean StatusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.StatusAktif = StatusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}

public class MataKuliah17 {
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Jumlah jam tidak bisa kurang dari 0");
            return;     
        } else {
            jumlahJam -= jam;
        }
    }

    public MataKuliah17() {
    }

    public MataKuliah17(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
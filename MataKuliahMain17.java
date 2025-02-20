public class MataKuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 = new MataKuliah17();
        mk1.kodeMK = "IF1234";
        mk1.namaMK = "Pemrograman Berorientasi Objek";
        mk1.sks = 3;
        mk1.jumlahJam = 2;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(4);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        MataKuliah17 mk2 = new MataKuliah17("IF2345", "Struktur Data", 4, 3);
        mk2.ubahSKS(5);
        mk2.kurangiJam(4);
        mk2.tampilInformasi();

        MataKuliah17 mk3 = new MataKuliah17("IF23456", "Basis Data", 2, 3);
        mk3.tambahJam(4);
        mk3.tampilInformasi();
    }
}
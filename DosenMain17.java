public class DosenMain17 {
    public static void main(String[] args) {
        Dosen17 dsn1 = new Dosen17();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi";
        dsn1.StatusAktif = true;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Pemrograman";
        
        dsn1.tampilkanInformasi();
        dsn1.ubahStatusAktif(false);
        dsn1.updateTahunBergabung(2015);
        dsn1.updateBidangKeahlian("Pemrograman Web");
        dsn1.tampilkanInformasi();
        
        Dosen17 dsn2 = new Dosen17("D002", "Ani", false, 2012, "Jaringan Komputer");
        dsn2.ubahStatusAktif(true);
        dsn2.updateTahunBergabung(2013);
        dsn2.updateBidangKeahlian("Keamanan Informasi");
        dsn2.tampilkanInformasi();
        
        Dosen17 dsn3 = new Dosen17("D003", "Cici", true, 2014, "Sistem Informasi");
        dsn3.ubahStatusAktif(false);
        dsn3.updateTahunBergabung(2016);
        dsn3.updateBidangKeahlian("Big Data");
        dsn3.tampilkanInformasi();
    }
    
} 
    

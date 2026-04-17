public class Gopay extends EWallet {

    public Gopay(String namaUser, int jumlahTopUp) {
        super(namaUser, jumlahTopUp);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama User   : " + namaUser);
        System.out.println("Jumlah TopUp: " + jumlahTopUp);
        System.out.println("Jenis Wallet: GOPAY");
    }
}
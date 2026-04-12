public class Gopay extends EWallet {

    public Gopay(String namaUser, int jumlahTopUp) {
        super(namaUser, jumlahTopUp);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Wallet: GOPAY");
    }
}
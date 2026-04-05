public class Dana extends EWallet {

    public Dana(String namaUser, int jumlahTopUp) {
        super(namaUser, jumlahTopUp);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Wallet: DANA");
    }
}
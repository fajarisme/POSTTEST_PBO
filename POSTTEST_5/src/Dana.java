public class Dana extends EWallet {

    public Dana(String namaUser, int jumlahTopUp) {
        super(namaUser, jumlahTopUp);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama User   : " + namaUser);
        System.out.println("Jumlah TopUp: " + jumlahTopUp);
        System.out.println("Jenis Wallet: DANA");
    }
}
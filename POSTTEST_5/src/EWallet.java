public abstract class EWallet implements Transaksi {

    protected String namaUser;
    protected int jumlahTopUp;

    public EWallet(String namaUser, int jumlahTopUp) {
        this.namaUser = namaUser;
        this.jumlahTopUp = jumlahTopUp;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public int getJumlahTopUp() {
        return jumlahTopUp;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public void setJumlahTopUp(int jumlahTopUp) {
        if (jumlahTopUp > 0) {
            this.jumlahTopUp = jumlahTopUp;
        } else {
            System.out.println("Jumlah top up harus lebih dari 0!");
        }
    }

    // 🔹 ABSTRACT METHOD
    public abstract void tampilkanInfo();

    // 🔹 OVERLOADING
    public void topUp(int jumlah) {
        this.jumlahTopUp += jumlah;
    }

    public void topUp(int jumlah, String bonus) {
        System.out.println("Mendapat bonus: " + bonus);
        this.jumlahTopUp += jumlah;
    }

    // 🔹 IMPLEMENT INTERFACE
    @Override
    public void prosesTransaksi(int jumlah) {
        topUp(jumlah);
    }

    @Override
    public void cetakStruk() {
        System.out.println("=== STRUK TRANSAKSI ===");
        System.out.println("Nama User : " + namaUser);
        System.out.println("Total TopUp : " + jumlahTopUp);
    }
}
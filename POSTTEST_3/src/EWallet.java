public class EWallet {

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

    public void tampilkanInfo() {
        System.out.println("Nama User   : " + namaUser);
        System.out.println("Jumlah TopUp: " + jumlahTopUp);
    }
}
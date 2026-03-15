public class EWallet {
    private String namaUser;
    private String jenisWallet;
    private int jumlahTopUp;

    public EWallet(String namaUser, String jenisWallet, int jumlahTopUp) {
        this.namaUser = namaUser;
        this.jenisWallet = jenisWallet;
        this.jumlahTopUp = jumlahTopUp;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public String getJenisWallet() {
        return jenisWallet;
    }

    public int getJumlahTopUp() {
        return jumlahTopUp;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public void setJenisWallet(String jenisWallet) {
        this.jenisWallet = jenisWallet;
    }

    public void setJumlahTopUp(int jumlahTopUp) {
        if (jumlahTopUp > 0) {
            this.jumlahTopUp = jumlahTopUp;
        } else {
            System.out.println("Jumlah top up tidak boleh negatif.");
        }
    }

}
class EWallet {

    String namaUser;
    String jenisWallet;
    int jumlahTopUp;
    
    EWallet(String namaUser, String jenisWallet, int jumlahTopUp) {
        this.namaUser = namaUser;
        this.jenisWallet = jenisWallet;
        this.jumlahTopUp = jumlahTopUp;
    }
    void tampilData() {
        System.out.println("Nama User   : " + namaUser);
        System.out.println("E-Wallet    : " + jenisWallet);
        System.out.println("Jumlah TopUp: " + jumlahTopUp);
        System.out.println("--------------------------");
    }
}
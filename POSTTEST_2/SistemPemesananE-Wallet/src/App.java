import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<EWallet> dataTopUp = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN TOP UP E-WALLET ===");
            System.out.println("1. Tambah Data Top Up");
            System.out.println("2. Lihat Data Top Up");
            System.out.println("3. Update Data Top Up");
            System.out.println("4. Hapus Data Top Up");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Nama User: ");
        String nama = input.nextLine();

        System.out.print("Jenis E-Wallet (Dana/Gopay/Ovo/Shopeepay): ");
        String wallet = input.nextLine();

        System.out.print("Jumlah Top Up: ");
        int jumlah = input.nextInt();
        input.nextLine();

        EWallet data = new EWallet(nama, wallet, jumlah);
        dataTopUp.add(data);
        System.out.println("Data berhasil ditambahkan!");
    }

    static void lihatData() {
        if (dataTopUp.isEmpty()) {
            System.out.println("Data masih kosong.");
            return;
        }
        System.out.println("\n=== DATA TOP UP ===");

        for (int i = 0; i < dataTopUp.size(); i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Nama User   : " + dataTopUp.get(i).getNamaUser());
            System.out.println("E-Wallet    : " + dataTopUp.get(i).getJenisWallet());
            System.out.println("Jumlah TopUp: " + dataTopUp.get(i).getJumlahTopUp());
            System.out.println("--------------------------");
        }
    }

    static void updateData() {
        lihatData();
        if (dataTopUp.isEmpty()) return;
        System.out.print("Pilih nomor data yang ingin diupdate: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < dataTopUp.size()) {
            System.out.print("Nama User Baru: ");
            String nama = input.nextLine();

            System.out.print("Jenis E-Wallet Baru: ");
            String wallet = input.nextLine();

            System.out.print("Jumlah Top Up Baru: ");
            int jumlah = input.nextInt();
            input.nextLine();

            dataTopUp.get(index).setNamaUser(nama);
            dataTopUp.get(index).setJenisWallet(wallet);
            dataTopUp.get(index).setJumlahTopUp(jumlah);
            System.out.println("Data berhasil diupdate!");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    static void hapusData() {
        lihatData();
        if (dataTopUp.isEmpty()) return;
        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = input.nextInt() - 1;
        input.nextLine();

        if (index >= 0 && index < dataTopUp.size()) {
            dataTopUp.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }
}
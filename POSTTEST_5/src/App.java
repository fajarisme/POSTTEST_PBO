import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static ArrayList<EWallet> dataTopUp = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan = 0;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN TOP UP E-WALLET ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Exit");

            while (true) {
                try {
                    System.out.print("Pilih Menu: ");
                    pilihan = Integer.parseInt(input.nextLine());

                    if (pilihan >= 1 && pilihan <= 4) break;
                    else System.out.println("Menu harus 1-4!");

                } catch (Exception e) {
                    System.out.println("Input harus angka!");
                }
            }

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    lihatData();
                    break;
                case 3:
                    hapusData();
                    break;
            }

        } while (pilihan != 4);

        System.out.println("Program selesai.");
    }

    static void tambahData() {

        String nama;
        do {
            System.out.print("Nama User: ");
            nama = input.nextLine();
            if (nama.isEmpty()) System.out.println("Tidak boleh kosong!");
        } while (nama.isEmpty());

        int jenis = 0;

        while (true) {
            try {
                System.out.println("1. DANA");
                System.out.println("2. GOPAY");
                System.out.print("Pilih jenis: ");
                jenis = Integer.parseInt(input.nextLine());

                if (jenis == 1 || jenis == 2) break;
                else System.out.println("Pilih 1 atau 2!");

            } catch (Exception e) {
                System.out.println("Harus angka!");
            }
        }

        int jumlah = 0;
        while (true) {
            try {
                System.out.print("Jumlah Top Up: ");
                jumlah = Integer.parseInt(input.nextLine());

                if (jumlah > 0) break;
                else System.out.println("Harus lebih dari 0!");

            } catch (Exception e) {
                System.out.println("Harus angka!");
            }
        }

        EWallet wallet;

        if (jenis == 1) {
            wallet = new Dana(nama, 0);
            wallet.topUp(jumlah, "Cashback 10%");
        } else {
            wallet = new Gopay(nama, 0);
            wallet.prosesTransaksi(jumlah); // dari interface
        }

        wallet.cetakStruk(); // dari interface
        dataTopUp.add(wallet);

        System.out.println("Data berhasil ditambahkan!");
    }

    static void lihatData() {

        if (dataTopUp.isEmpty()) {
            System.out.println("Data kosong!");
            return;
        }

        for (int i = 0; i < dataTopUp.size(); i++) {
            System.out.println("\nData ke-" + (i + 1));
            dataTopUp.get(i).tampilkanInfo();
            System.out.println("----------------------");
        }
    }

    static void hapusData() {

        lihatData();
        if (dataTopUp.isEmpty()) return;

        int index = -1;

        while (true) {
            try {
                System.out.print("Pilih nomor data: ");
                index = Integer.parseInt(input.nextLine()) - 1;

                if (index >= 0 && index < dataTopUp.size()) break;
                else System.out.println("Index tidak valid!");

            } catch (Exception e) {
                System.out.println("Harus angka!");
            }
        }

        dataTopUp.remove(index);
        System.out.println("Data berhasil dihapus!");
    }
}
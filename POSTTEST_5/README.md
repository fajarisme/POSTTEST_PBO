# 📘 LAPORAN PRAKTIKUM PEMROGRAMAN BERORIENTASI OBJEK
## Sistem Manajemen Top Up E-Wallet

---

## 👤 Identitas Mahasiswa
- Nama  : Muhammad Fajar Dafita
- NIM   : 2409106030
- Kelas : A2'24

---

## 📌 Deskripsi Program
Program ini merupakan aplikasi berbasis **Java Console** yang digunakan untuk mengelola data **Top Up E-Wallet**.  
User dapat melakukan beberapa operasi seperti:
- Menambahkan data top up
- Melihat data top up
- Menghapus data top up

Program ini juga mengimplementasikan konsep **Object Oriented Programming (OOP)** seperti:
- Inheritance
- Polymorphism
- Method Overloading
- Abstract Class
- Interface

---

## 🎯 Tujuan Praktikum
1. Memahami konsep **Abstract Class**
2. Menerapkan **Abstract Method**
3. Mengimplementasikan **Interface**
4. Menggabungkan konsep OOP dalam satu program

---

## 🧱 Struktur Program

Program terdiri dari beberapa class:

### 1. `App.java`
Class utama yang berisi:
- Menu program
- Input user
- Proses tambah, lihat, dan hapus data

---

### 2. `EWallet.java` (Abstract Class)
Merupakan superclass dari semua jenis e-wallet.

Fitur:
- Atribut: `namaUser`, `jumlahTopUp`
- Method getter & setter
- Method **overloading**:
  - `topUp(int jumlah)`
  - `topUp(int jumlah, String bonus)`
- Method abstract:
  - `tampilkanInfo()`
- Implementasi interface:
  - `prosesTransaksi()`
  - `cetakStruk()`

---

### 3. `Dana.java`
Subclass dari `EWallet`.

Fitur:
- Override method `tampilkanInfo()`
- Menampilkan jenis wallet: **DANA**

---

### 4. `Gopay.java`
Subclass dari `EWallet`.

Fitur:
- Override method `tampilkanInfo()`
- Menampilkan jenis wallet: **GOPAY**

---

### 5. `Transaksi.java` (Interface)
Interface yang berisi minimal 2 method:
- `prosesTransaksi(int jumlah)`
- `cetakStruk()`

---

## 🔄 Konsep OOP yang Digunakan

### ✅ 1. Inheritance
Class `Dana` dan `Gopay` mewarisi class `EWallet`.

---

### ✅ 2. Polymorphism (Override)
Method `tampilkanInfo()` dioverride di setiap subclass.

---

### ✅ 3. Method Overloading
Method `topUp()` memiliki dua versi:
- Dengan parameter jumlah
- Dengan parameter jumlah + bonus

---

### ✅ 4. Abstract Class
Class `EWallet` dijadikan abstract dan memiliki abstract method `tampilkanInfo()`.

---

### ✅ 5. Interface
Interface `Transaksi` digunakan untuk:
- Proses transaksi
- Cetak struk

---

## ▶️ Cara Menjalankan Program

1. Compile semua file:
javac *.java
2. Jalankan program:
java App

---

## 🧪 Contoh Alur Program

1. User memilih menu **Tambah Data**
2. User memasukkan:
- Nama
- Jenis E-Wallet (DANA / GOPAY)
- Jumlah Top Up
3. Program memproses transaksi
4. Program menampilkan struk
5. Data tersimpan dalam list

---

## 📌 Kesimpulan
Program ini berhasil mengimplementasikan berbagai konsep penting dalam OOP, yaitu:
- Abstract Class
- Interface
- Inheritance
- Polymorphism
- Method Overloading

Dengan adanya program ini, pengguna dapat mengelola data top up e-wallet dengan lebih terstruktur.

---
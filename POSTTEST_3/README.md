# Sistem Manajemen Top Up E-Wallet (PBO)

## Deskripsi

Program ini merupakan sistem sederhana berbasis Java untuk mengelola data top up E-Wallet.
Program dibuat menggunakan konsep Object Oriented Programming (OOP) dengan penerapan inheritance serta dilengkapi error handling untuk validasi input pengguna.

---

## Fitur Program

* Menambah data top up
* Melihat data top up
* Menghapus data
* Validasi input agar tidak terjadi error

---

## Konsep OOP

### Inheritance

Program menggunakan inheritance dengan struktur:

* **Superclass:**

  * EWallet

* **Subclass:**

  * Dana
  * Gopay

Subclass mewarisi atribut dan method dari superclass.

---

### Tipe Inheritance

Menggunakan **Single Inheritance**.

---

### Method Overriding

Method `tampilkanInfo()` dioverride pada subclass untuk menampilkan jenis wallet.

---

## Error Handling

Program dilengkapi validasi:

* Input menu harus angka
* Nama tidak boleh kosong
* Jumlah top up harus angka dan > 0
* Index harus valid
* Program tidak akan crash jika input salah

---

## Struktur Project

```
App.java
EWallet.java
Dana.java
Gopay.java
```

---

## Cara Menjalankan

1. Compile:

   ```
   javac *.java
   ```
2. Jalankan:

   ```
   java App
   ```

---

## Kesimpulan

Program ini berhasil menerapkan konsep inheritance secara logis dalam sistem top up E-Wallet serta dilengkapi validasi input agar lebih aman dan stabil.

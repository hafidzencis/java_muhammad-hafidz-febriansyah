# 13_Database Schema, DDL, DML

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi Database dan RDBMS<br />
2. Definsi DDL <br />
3. Konsep Polymorphism <br />

### Definisi Database dan RDBMS

Definisi Database adalah sekumpulan data atau informasi yang tersimpan secara sistematis. Basis data ini dibutuhkan ketika mengakses perangkat lunak.<br />
<br />
Definisi RDBMS adalah sistem yang mendukung adanya hubungan atau relationship antar tabel pada suatu database. Setiap tabel memiliki kunci yang disebut dengan primary key untuk dihubungkan ke tabel berikutnya yang memiliki foreign key.<br /><br />

### Definisi DDL

Definisi DDL adalah Data Definition Language, yaitu sebuah bahasa pemrograman komputer yang digunakan untuk membuat dan memodifikasi struktur sebuah objek database di database terutama dalam bentuk skema.Fungsi DDL antara lain <br />

- CREATE
- ALTER
- RENAME
- DROP
- TRUNCATE
- COMMENT

### Definisi DML

Definisi DML adalah Data Manipulation Language, memanipulasi database seperti: menambah data, merubah/mengganti data dan menghapus data.Fungsi DML antara lain <br />

- INSERT
- DELETE
- UPDATE
- SELECT

## Task

### Task 1

- Gambar ERD Alta_Online_Shop(Digital Outlet Pulsa)<br />
  ![output]()<br />

### Task 2

1. Membuat database alta_online_shop <br />
   ![output]()<br />

2. a. Membuat table user <br />
   ![output]()<br />
   b. Membuat table product, product type, operators. product description, payment method <br />
   ![output]()<br />
   c. Membuat table transaction, transaction detail <br />
   ![output]()<br />
3. Membuat tabel kurir field id, name, created_at, updated_at<br />
   ![output]()<br />

4. Menambahkan kolom ongkos_dasar di tabel kurir<br />
   ![output]()<br />
5. Rename tabel kurir menjadi shipping<br />
   ![output]()<br />
6. Hapus table shipping<br />
   ![output]()<br />
7. a. 1-to-1 payment method description<br />
   ![output]()<br />
   b. 1-to-many user dengan alamat<br />
   ![output]()<br />
   c. many-to-many user dengan payment method menjadi user_payment_method_detail<br />
   ![output]()<br />

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
  ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/no1erd.png)<br /><br />

### Task 2

1. Membuat database alta_online_shop <br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/1.JPG)<br /><br />

2. a. Membuat table user <br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/2-a.JPG)<br /><br />
   b. Membuat table product, product type, operators. product description, payment method <br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/2-b.JPG)<br /><br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/2-c.JPG)<br /><br />

   c. Membuat table transaction, transaction detail <br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/2-c1.JPG)<br /><br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/2-b2.JPG)<br /><br />

3. Membuat tabel kurir field id, name, created_at, updated_at<br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/3dan%204.JPG)<br /><br />

4. Menambahkan kolom ongkos_dasar di tabel kurir<br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/3dan%204.JPG)<br /><br />
5. Rename tabel kurir menjadi shipping<br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/5.JPG)<br /><br />
6. Hapus table shipping<br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/13_SCHEMA%2CDML%2CDDL/screenshot/6.JPG)<br /><br />
7. a. 1-to-1 payment method description<br />
   ![output]()<br /><br />
   b. 1-to-many user dengan alamat<br />
   ![output]()<br /><br />
   c. many-to-many user dengan payment method menjadi user_payment_method_detail<br />
   ![output]()<br /><br />

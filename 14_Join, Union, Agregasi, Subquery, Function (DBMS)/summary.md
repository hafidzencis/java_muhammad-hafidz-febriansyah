# 14_Join, Union, Agregasi, Subquery, Function (DBMS)

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi Join dan Union<br />
2. Definsi Agregasi <br />
3. Konsep Subquery, Function DBMS <br />

### Definisi Join dan Union

Definisi Join adalah cara untuk mengkombinasikan record dari dua atau lebih tabel.<br />
Macam - macam join <br />

- INNER JOIN = join dengan pengembalian baris - baris dari dua tabel yang memenuhi syarat.<br />
- LEFT JOIN = join yang mengembalikan seluruh baris dari tabel sebelah kiri yang dikenai kondisi ON dan hanya baris dari tabel disebelah kanan yang memenuhi kondisi join.<br />
- RIGHT JOIN = join yang mengembalikan semua baris dari tabel sebelah kananyang dikenai kondisi ON dan hanya baris dari tabel disebelah kanan yang memenuhi kondisi join.<br /><br />

Definisi Union adalah cara untuk menggabungkan kumpulan hasil dari dua atau lebih pernyataan SELECT.Syarat dari union antara lain <br />

- Setiap pernyataan SELECT dalam UNION harus memiliki jumlah kolom yang sama.<br />
- Kolom juga harus memiliki tipe data yang serupa.<br />
- Kolom di setiap pernyataan SELECT juga harus dalam urutan yang sama.

### Definsi Agregasi

Definsi Agregasi adalah suatu fungsi yang digunakan untuk membuat data yang berawal dari beberapa data lalu disatukan menjadi bentuk nilai tunggal.<br /> Fungsi dari Agregasi antara lain <br />

- MIN <br />
- MAX <br />
- SUM <br />
- AVG <br />
- COUNT <br />
- HAVING

### Konsep Subquery, Function DBMS

Subquery disebut juga nested query adalah query di dalam query.Subquery ini digunakan untuk mengembalikan data yang akan digunakan query utama dengan data yang spesifik.<br /><br />

Function adalah kumpulan statement yang akan mengembalikan sebuah nilai balik dari pemanggilnya.<br />
Fungsi dari function DMS ini antara lain <br />

- DELIMITER<br />
- RETURN <br />
- BEGIN END<br />
- DECLARE<br />
- NEW<br />

## Task

### Task 1 INSERT,SELECT,UPDATE,DELETE

1. Insert <br />
   a. Insert 5 operators pada table operators.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/a.JPG>)<br /><br /><br />
   b. Insert 3 product type.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/b.JPG>)<br /><br /><br />
   c. Insert 2 product dengan product type id - 1, dan operators id - 3.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/c.JPG>)<br /><br /><br />
   d. Insert 3 product dengan product type id - 2, dan operators id - 1.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/d.JPG>)<br /><br /><br />
   e. Insert 3 product dengan product type id - 3, dan operators id - 4.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/e.JPG>)<br /><br /><br />
   f. Insert product description pada setiap product.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/f.JPG>)<br /><br /><br />
   g. Insert 3 payment methods.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/g.JPG>)<br /><br /><br />
   h. Insert 5 user pada tabel user.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/h.JPG>)<br /><br /><br />
   i. Insert 3 transaksi di masing-masing user.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/i.JPG>)<br /><br /><br />
   j. Insert 3 product di masing-masing transaksi.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/insert/j.JPG>)<br /><br /><br />

2. Select<br />
   a. Tampilkan nama user / pelanggan dengan gender Laki-laki / M.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/select/a.JPG>)<br /><br /><br />
   b. Tampilkan product dengan id - 3.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/select/b.JPG>)<br /><br /><br />
   c. Tampilkan data pelanggan yang created at dalam range 7 hari kebelakang mempunyai nama mengandung kata 'a'.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/select/c.JPG>)<br /><br /><br />
   d. Hitung jumlah user / pelanggan dengan status gender Perempuan.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/select/d.JPG>)<br /><br /><br />
   e. Tampilkan data pelanggan dengan urutan sesuai nama abjad<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/select/e.JPG>)<br /><br /><br />
   f. Tampilkan 5 data pada data product<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/select/f.JPG>)<br /><br /><br />

3. Update<br />
   a. Ubah data product id 1 dengan nama 'product dummy'.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/update/a.JPG>)<br /><br /><br />

4. Delete<br />
   a. Delete data pada tabel product dengan id 1.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/delete/a.JPG>)<br /><br /><br />

### Task 2 JOIN

1. Gabungkan data transaksi dari user id 1 dan user id 2.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/join/a.JPG>)<br /><br /><br />
2. Tampilkan jumlah harga transaksi user id 1.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/join/b.JPG>)<br /><br /><br />
3. Tampilkan total transaksi dengan product type 2.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/join/c.JPG>)<br /><br /><br />
4. Tampilkan semua field table product dan field name table product type yang saling berhubungan.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/join/d.JPG>)<br /><br /><br />
5. Tampilkan semua field table transaction, field name table product dan field name table user.<br />
   ![xx](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/14_Join%2C%20Union%2C%20Agregasi%2C%20Subquery%2C%20Function%20(DBMS)/screenshot/join/e.JPG>)<br /><br /><br />

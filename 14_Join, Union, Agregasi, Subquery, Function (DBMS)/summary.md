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

### Task 1

Link Code : [Code-Task-1](https://drive.google.com/drive/folders/1jOK370AVOTvjlbmvIc6-DMfq_3WA8KUa?usp=sharing)

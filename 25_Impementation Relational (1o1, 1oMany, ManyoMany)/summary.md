# 25_Impementation Relational (1o1, 1oMany, ManyoMany)

## Resume

Dalam materi ini, mempelajari <br />

1. SQL Advance Aggregation <br />
2. SQL Advance JOIN <br />
3. Database Relationship<br /><br />

### SQL Advance Aggregation

- Like <br />
  adalah query untuk mencari value <br />
  cth : Select \* from products prds where prds.product_name Like %n%<br /><br />

- Limit dan Offset<br />
  -> Limit = query untuk melakukan membatasi data<br />
  -> Offset = query untuk memulai awalan data<br />
  cth : Select \* from products prds where prds.product_name limit 5 offset 0<br /><br />

- AVG <br />
  adalah query untuk mencari rata - rata<br /><br />

- SUM <br />
  adalah query untuk melakukan total jumlah data<br /><br />

- MIN <br />
  adalah query untuk mencari data minimum <br /><br />

- Max <br />
  adalah query untuk mencari data maximum <br /><br />

- Group By <br />
  adalah query untuk melakukan penentuan kelompok <br /><br />

- Order By <br />
  adalah query unuk mengurutkan data<br /><br />

### SQL Advance JOIN

- SQL INNER JOIN<br />
  adalah query untuk menggabungkan kedua tabel dengan syarat ada keduan id yang sama.<br /><br />

- SQL LEFT JOIN<br />
  adalah query untuk mengambil semua data yang ada di tabel sebelah kiri dari perintah LEFT JOIN, dan akan mencoba menggabungkannya dengan tabel kanan. Jika tidak ada pasangannya, nilai dari table kiri tetap ada dan nilai yang tidak ada di tabel kanan akan menjadi NULL.<br /><br />

- SQL RIGHT JOIN<br />
  adalah query untuk mengambil semua data yang ada di tabel sebelah kanan dari perintah RIGHT JOIN. Perintah ini akan mencoba menggabungkannya dengan tabel yang ada di sebalah kiri. Jika tidak ada pasangannya, nilai dari table kanan tetap ada dan nilai yang tidak ada di tabel kiri akan menjadi NULL.<br /><br />

- SQL FULL JOIN<br />
  adalah FULL OUTER JOIN akan mengambil semua data dari kedua tabel. Perintah ini akan mencoba menggabungkan kedua data sesuai dengan syarat. Jika tidak ada pasangannya, nilai akan dijadikan NULL.<br /><br />

### Database Relationship

- One to One <br />
  adalah relasi yang mana setiap satu baris data pada tabel pertama hanya berhubungan dengan satu baris pada tabel kedua.<br /><br />

- One to Many<br />
  adalah One to Many adalah relasi yang mana setiap satu baris data pada tabel pertama berhubungan dengan lebih dari satu baris pada tabel kedua. <br /><br />

- Many to Many<br />
  adalah Many to Many adalah relasi yang mana setiap lebih dari satu baris data dari tabel pertama berhubungan dengan lebih dari satu baris data pada tabel kedua. Artinya, kedua tabel masing-masing dapat mengakses banyak data dari tabel yang direlasikan<br /><br />

## Task

### Task 1

Buatlah sebuah project yang dapat
melakukan CRUD lengkap yang memuat REST API Endpoint, Repository, dan Service<br /><br />

- a. GET /v1/posts <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/GET.JPG>)<br /><br/><br />
- b. POST /v1/posts <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />
- c. DELETE /v1/posts/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/DELETE.JPG>)<br /><br/><br />

### Task 2

Tambahkan sebuah CRUD lagi dalam project tersebut <br /><br />

# 18_System Design

## Resume

Dalam materi ini, mempelajari <br />

1. Definsi System Design Diagram & System Design Distributed <br />
2. Definisi System Design Job Queue & Microservices<br />
3. Definisi System Design SQL & NoSQL dan System Design Cache & Indexing <br /><br />

### Definsi System Design Diagram & System Design Distributed

System Design Diagram adalah simbol yang memrepresentasikan suatu informasi<br /><br />

->Macam - macam System Design Diagram :<br /><br />

- Flowchart<br />
- Use Case <br />
- ERD (Entity Relations Diagram)<br />
- HLA (High Level Architecture)<br /><br />

System Design Distributed adalah Sistem yang menggunakan multi server atau komputer.Biasanya Sistem ini sudah mencapai transaksi data cukup tinggi.<br /><br />

->Karakteristik System Design Distributed<br /><br />

- Scalability<br />
  terdapat 2 macan scalability<br />

-> Vertical Scaling<br />
Increase Ability, example = transaction 20 data/second to 30 data/second
Increase ability take long time because refactor code, analysis code make algorithm efficiency and add ssd or ram<br /><br />
-> Horizontal Scaling<br />
Duplicate, example = transction 10 data/second to 30 data/second & 30 data/second
Duplicate, take short time because buy new server<br /><br />

- Reliability(kehandalan)<br />
  Reliability membahas multiple server apabila salah satu server terkena masalah masih ada server yang mengatasi untuk melakukan transaksi data'<br /><br />

- Availability(Ketersediaan)<br />
  Availability membahas bagaimana multiple server harus bekerja 24 jam<br /><br />

- Efficiency<br />
  Efficiency membahas distributed item with low time, minimum 2 second
  <br /><br />
- Serviceability & Manageability<br />
  Serviceability & Manageability ini membahas penggunaan clean code dan melakukan maintain pada code<br /><br />

### Definisi System Design Job Queue & Microservices

->Job Queue<br />
Job Queue bertugas untuk melakukan manajemen tugas dari user ke suatu tujuann user<br /><br />

->Load Balancing<br />
Load balancing adalah suatu tindakan untuk mengurangi kesenjagan dalam pembagian data server,misalkan terdapat dua server data, ketika ingin melakukan<br />
transaksi data, yang terjadi satu data server tersebut terjadi penumpukan data sehingga satu data tersebut bisa mengurangin penayimpanan data, bisa menyebabkan<br />
data server tersebut lelet padahal satu data server yang lain nya masih ada, Maka terbentuk lah LOAD BALANCER, dimana 2 data server tersebut digunakan<br />
semua maksudnya 2 data semua ketika ada transaksi maka ada 2 load balancer yang menuju ke 2 data server agar tidak terjadi penumpukan data pada salah satu
data server<br /><br />

-> Monolithic<br />
Monolithic adalah arsitektur dimana keseluruhan kode akan dikompilasi menjadi satu aplikasi (biasanya menjadi satu binary atau artifact)
dimana aplikasi tersebut menjalankan seluruh proses yang dibutuhkan.
<br /><br />
-> Microservices<br />
Microservices adalah model service yang berada di sekililing domain bisnis dimana dia berkomunikasi sebagai arsitektur dengan pilihan banyak opsi layanan
server.Microservice arsitektur ini terdapat banyak pilihan kolaborasi microservices<br /><br />

### Definisi System Design SQL & NoSQL dan System Design Cache & Indexing

System Design SQL & NoSQL<br /><br />

-> SQL<br />
SQL mempunyai skema yang harus dibuat terlebih dahulu, properti yang harus didefine terlebih dahulu.SQL ini mempunyai banyak tools.
SQL ini mempunyai prinsip ACID:<br /><br />

- Atomicity : transaksi terjadi semua atau tidak sama sekali.<br /> Contoh : apabila mempunyai sistem data pembayaran dan checkout apabila sistemdata pembayaran tidak menyimpan data maka sistem checkout tidak menyimpan juga<br />
- Consistency : struktur dan penentuan tipe data sudah di tentukan sejak awal
- Isolation : apabila terjadi request bersamaan maka akan di eksekusi secara berurutan<br />
- Durability : data itu akan tersimpan terus apabila di tampilan ui user sudah terhapus<br /><br />

-> No SQL<br />
No SQL mempunyai skema less,kompleksitas cukup rendah, menghindari ACID, flexsibel dalam penggunaan data.<br />
No SQL tidak cocok untuk data transaksi dan finance<br /><br />

System Design Caching & Indexing<br />

-> Cache<br />
Cache adalah data penyimpanan sementera dan apabila terdapat request yang sama dari data sebelumnya maka mengembalikannya seperti data sebelumnya.<br />
Cache ini mempunyai tempat penyimpanan di RAM<br /><br />

-> Indexing<br />
Indexing adalah teknik struktur data yang memungkinkan Anda dengan cepat mengambil catatan dari file database. Indeks adalah tabel kecil yang hanya memiliki dua kolom.<br /><br />

## Task

### Task 1

1. Create <br />
   a. Buatlah design ERD dari diagram diatas <br /><br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/18_System%20Design/screenshot/NO1.png)<br />

   b. Gambarkan use case diagram tersebut <br /><br />
   ![output](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/18_System%20Design/screenshot/NO2.png)<br />

2. QUERY, Menampilkan SELECT From users dengan berbagai tipe NoSQL <br />
   a. Redis<br /><br/>

   SORT users:all-items BY users : item : <br /><br />

   b. Neo4j <br /><br />
   Match (u: users) Return u<br /><br />

   c. Cassandra <br /><br />
   SELECT (bintang, shift + angka 8) FROM users <br /><br />

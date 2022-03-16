# 16&17_NoSQL & MongoDB

## Resume

Dalam materi ini, mempelajari <br />

1. Apa itu NoSQL <br />
2. Macam - macam No SQL <br />
3. Sintaks MongoDB <br />

### Apa itu NoSQL

NoSQL adalah non relational database bisa disebut Database Manangement System (DBMS).<br />
DBMS bersifat flexibel, melakukan penyimapanan data sementara, terdistribusi dan skema less.<br />
NoSQL ini mempunyai kaidah : <br />

- Consistency = Setiap proses baca mendapatkan data dari proses penulisan terakhir. <br />
- Availability = Setiap request mendapatkan respon yang bukan error.<br />
- Partition = DBMS tetap dapat beroperasi meskipun ada kesalahan jaringan.<br />

### Macam - macam No SQL

Macam - macam NoSQL berikut ini adalah <br />

- Key Value, terdapat aplikasi redis<br />
- Column-family, terdapat aplikasi cassandra<br />
- Graph, terdapat aplikasi neo4j<br />
- Document-based,terdapat aplikasi mongoDB

### Sintaks MongoDB

Berikut ini sintaks mongoDB :<br /><br />

-> membuat db <br />
use namadb <br />

-> melihat db <br />
show dbs <br />

->membuat collection<br />
db.createcollection("namacollection")<br />

->melihat collections<br />
show collections<br />

->menambah dokumentasi<br />
db.namacolletions.insert({ nama:'hafidz',gender:'male',jurusan:'informatika'})<br />
-banyak data<br />
db.namacolletions.insert([{ nama:'febrian',gender:'male',jurusan:'matematika'},{nama:'driana',gender:'female',jurusan:'statistika'}])<br />

->mencari data <br />
db.namacollections.find()<br />
db.namacollections.find().pretty()<br />

->update data <br />

- db.namacolletions.update({jurusan:'matematika'},{ nama:'jokowi',gender:'male',jurusan:'matematika'}) <br />
- db.Mahasiswa.update({nama:'jokowi'},{ $set :{ jurusan: 'kehutanan',age :50}}) <br />

->remove data<br />

db.collections.remove({nama:'jokowi'})<br />

## Task

### Task 1

1. Create <br />
   a. Insert 5 Operators pada table operators<br />
   ![output]()<br />
   b. Insert 3 product type<br />
   ![output]()<br />
   c. Insert 2 product dengan product type id = 1 dan operator id = 3<br />
   ![output]()<br />
   d. Insert 3 product dengan product type id = 2 dan operator id = 1<br />
   ![output]()<br />
   e. Insert 3 product dengan product type id = 3 dan operator id = 4<br />
   ![output]()<br />
   f. Insert product description pada setiap product<br />
   ![output]()<br />
   g. Insert 3 payment methods<br />
   ![output]()<br />
   h. Insert 5 user pada tabel user<br />
   ![output]()<br />

2. Read <br />
   a. Tampilkan nama user dengan gender Laki laki<br />
   ![output]()<br />
   b. Tampilkan product dengan id = 3<br />
   ![output]()<br />
   c. Hitung jumlah user dengan status gender Perempuan<br />
   ![output]()<br />
   d. Tampilkan data pelanggan dengan urutan seusai nama abjad<br />
   ![output]()<br />
   e. Tampilkan 5 data product<br />
   ![output]()<br />

3. Update <br />
   a. Ubah data product id 1 dengan nama 'product dummy'<br />
   ![output]()<br />

4. Delete <br />
   a. Delete data pada tabel product dengan id = 1<br />
   ![output]()<br />
   b. Delete data pada tabel product dengan product type id = 1<br />
   ![output]()<br />

### Task 2

1. Menampilkan data buku dari author id 1 dan author id 2<br />
   ![output]()<br />

2. Tampilkan daftar buku dan harga author id = 1<br />
   ![output]()<br />

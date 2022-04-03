# 29_Integration Test

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi Software Testing <br />
2. Definsi dari Setiap tipe Software Testing <br />
3. Definisi Unit Test dan Integration Test <br />

### Definisi Software Testing

Software Testing adalah metode untuk memeriksa software apakah sudah sesuai dengan persyaratan yang diharapkan dan untuk memastikan bahwa software tersebut tidak ada cacat.

### Definsi dari Setiap tipe Software Testing

- A. Functional Testing <br />
  adalah jenis pengujian yang memverifikasi bahwa setiap fungsi aplikasi telah beroperasi sesuai dengan requirement specification. Functional testing berfokus pada manual dan automation testing<br />

  Jenis dari Functional Testing <br />
  -> Unit Testing<br />
  -> Integration Testing<br />
  -> System Testing<br />
  -> Interface Testing<br />
  -> Regression Testing<br />
  -> User Acceptance Testing<br />

- B. Non Functional Testing <br />
  adalah pengujian yang melakukan verifikasi pada kebutuhan non-fungsional seperti performa dan kegunaan sebuah aplikasi. Non-functional testing lebih kepada meningkatkan kualitas sebuah aplikasi.<br />

  Jenis dari Functional Testing <br />
  -> Security, Reliability,Survivalibity<br />
  -> Availabiliy, Usability,Scalability,Interoperabiliy<br />
  -> Efficiency, Flexibility, Portability, Reusability<br />

- C. Maintenance Testing <br />
  adalah pengujian yang dilakukan setelah atau sebelum melakukan rilis suatu produk softwarr<br />

### Definisi Unit Test dan Integration Test

- A. Unit Test <br />
  Unit test dilakukan untuk mengetes sebuah class atau unit terkecil code/program kita.Tujuannya tentu saja untuk memastikan bahwa Input, Proses, dan Output dari fungsi-fungsi yang ada di class kita tersebut sesuai dengan requirement.<br />

- B. Integration Test <br />
  testing untuk mengecek integrasi antara banyak class atau unit yang terlibat dalam sebuah alur proses.Tujuannya tentu saja untuk memastikan bahwa alur proses berjalan secara sempurna. Biasanya untuk memastikan konfigurasi integrasi sudah sesuai dengan yang diharapkan atau tidak.<br />

## Task

### Task 1

Berikan masing - masing endpoint yang sudah dibuat cover dengan integration test dan unit test nya<br /><br />

- a. GET /v1/posts <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/GET.JPG>)<br /><br/><br />
- b. POST /v1/posts <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />
- c. DELETE /v1/posts/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/DELETE.JPG>)<br /><br/><br />

### Task 2

Tambahkan sebuah CRUD lagi dalam project tersebut <br /><br />

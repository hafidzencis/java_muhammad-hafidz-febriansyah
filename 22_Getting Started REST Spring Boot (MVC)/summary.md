# 22_Getting Started REST Spring Boot (MVC)

## Resume

Dalam materi ini, mempelajari <br />

1. Definsi Spring Boot <br />
2. Kenapa menggunakan Spring Boot ?<br />
3. Spring Boot Architecture<br /><br />

### Definsi Spring Boot

Spring Boot make it easy to create stand-alone,
production-grade Spring based Applications that you can "just run" <br />

We take an opinionated view of the Spring platform and third-party libralies so you can get started with minimum fuss.
Most Spring Boot applications need minimal Spring configuration

### Kenapa menggunakan Spring Boot ?

Benefit dan fitur dari Spring Boot antara lain: <br />
It provides a flexible way to configure Java Beans, XML configurations and Database Transactions <br />
It provides a powerful batch processing and manages REST endpoints. <br />
In Spring Boot, everything is auto configured. <br />
It offers annotation-based spring application, Easy dependency management <br />
It includes Embedded Servlet Container(java menggunakan apache tomcat untuk running aplikasi)

### Spring Boot Architecture

Spring Boot ini menggunakan clean architecture <br /><br />

Controller Access --> Presentation Layer
<br />
Service Class ---> Bussiners Logic Layer
<br />
Repository Classes ---> Data Access Layer --> Database dijalankan

## Task

### Task 1

Buatlah project Spring Boot dengan database H2 dan struktrur MVC yang memiliki 3 endpoint<br /><br />

- a. GET /v1/posts <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/GET.JPG>)<br /><br/><br />
- b. POST /v1/posts <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />
- c. DELETE /v1/posts/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/DELETE.JPG>)<br /><br/><br />

### Task 2

Coba Gunakan CrudRepository dan JPARepository dan jelaskan perbedaannyan<br /><br />

- PagingAndSortingRepository meenggunakan CrudRepository sedangkan JpaRepository menggunakan Pagination

- Antarmuka CrudRepository menyediakan metode untuk operasi CRUD, sehingga memungkinkan Anda untuk membuat, membaca, memperbarui, dan menghapus catatan tanpa harus menentukan metode Anda sendiri sedangkan JpaRepository menambahkan beberapa fungsionalitas lagi yang khusus untuk JPA.

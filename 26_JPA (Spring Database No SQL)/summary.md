# 26_JPA (Spring Database No SQL)

## Resume

Dalam materi ini, mempelajari <br />

1. Database NoSQL <br />
2. Penggunaan Dependicies menggunakan Database NoSQL <br />
3. Struktur Folder MVC pada Spring Database No SQL<br /><br />

### Database NoSQL

adalah sistem pengelolaan database yang tidak dilakukan melalui manajemen relasional (Relational Database Management System).Semua bentuk dokumen dari NoSQL adalah JSON yang mudah dibaca dan dimengerti.<br /> NoSQL banyak diminati karena memiliki performa yang tinggi dan bersifat non-relasional sehingga dapat memakai berbagai model data. Beberapa contoh dari database NoSQL yaitu MongoDB, MarkLogic, Couchbase, CloudDB, dan Dynamo DB.

### Penggunaan Dependicies menggunakan Database NoSQL

- Spring Web
  Build web, including RESTful, applications using Spring MVC.Uses Apache
  Tomcat as the default embededd container.<br /><br />

- Spring Data MongoDB
  Store data in flexible, JSON-like documents, meaning fields, can very from
  document to document and data structure can be changed over time.<br /><br />

- Lombok
  Java annotation library which helps to reduce boilerplate code<br /><br />

### Struktur Folder MVC pada Spring Database No SQL

- Controller
  Controller sebagai kumpulan routing REST API, atau sering di sebut endpoint

- Model
  Sebagai bentuk dasar dari bussines model, POJO(Plain Old Java Object)

- Repository
  Sebagai interface yang berhubungan langsung dengan database

- Service
  Kumpulan interface digunakan untuk bussines process / rules / logic

## Task

### Task 1

Buatlah sebuah project yang dapat
melakukan CRUD lengkap yang memuat REST API Endpoint, Repository, dan Service<br /><br />

- Product <br /><br />

==> Repository<br />
![XX](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/repository/prod.JPG>)<br />
==> Service<br />
[ProductService](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/praktikum/Section26/src/main/java/com/Alterra/Section26/service/ProductService.java>)<br />
==> Endppoint<br />
-> a. GET /api/v1/product <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/getprod.JPG>)<br /><br/><br />

-> b. POST /api/v1/product <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/Postprod.JPG>)<br /><br/><br />

-> c. PUT /api/v1/product/{id}
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/putprod.JPG>)<br /><br/><br />

-> d. DELETE /api/v1/product/{id} <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/delprod.JPG>)<br /><br/><br />

- Transaction <br /><br />

==> Repository<br />
![XX](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/repository/trannsc.JPG>)<br />
==> Service<br />
[TransactionService](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/praktikum/Section26/src/main/java/com/Alterra/Section26/service/TransactionService.java>)<br />
==> Endppoint<br />
-> a. GET /api/v1/transaction <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/gettransac.JPG>)<br /><br/><br />
-> b. POST /api/v1/transaction <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/posttransac.JPG>)<br /><br/><br />

-> c. PUT /api/v1/transaction/{id}
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/puttransac.JPG>)<br /><br/><br />

-> d. DELETE /api/v1/transaction/{id} <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/deltransac.JPG>)<br /><br/><br />

- Transaction Detail <br /><br />

==> Repository<br />
![XX](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/repository/trannscdetail.JPG>)<br />
==> Service<br />
[TransactionDetailService](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/praktikum/Section26/src/main/java/com/Alterra/Section26/service/TransactionDetailsService.java>)<br />
==> Endppoint
-> a. GET /api/v1/transactiondetail <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/gettransacdetai.JPG>)<br /><br/><br />
-> b. POST /api/v1/transactiondetail <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/posttransacdetai.JPG>)<br /><br/><br />

-> c. PUT /api/v1/transactiondetail/{id}
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/puttransacdetai.JPG>)<br /><br/><br />

-> d. DELETE /api/v1/transactiondetail{id} <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/26_JPA%20(Spring%20Database%20No%20SQL)/screenshot/deltransacdetai.JPG>)<br /><br/><br />

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
![XX]()<br />
==> Service<br />
[ProductService]()<br />
==> Endppoint<br />
-> a. GET /api/v1/product <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/GET.JPG>)<br /><br/><br />

-> b. POST /api/v1/product <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />

-> c. PUT /api/v1/product/{id}
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />

-> d. DELETE /api/v1/product/{id} <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/DELETE.JPG>)<br /><br/><br />

- Transaction <br /><br />

==> Repository<br />
![XX]()<br />
==> Service<br />
[TransactionService]()<br />
==> Endppoint<br />
-> a. GET /api/v1/transaction <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/GET.JPG>)<br /><br/><br />
-> b. POST /api/v1/transaction <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />

-> c. PUT /api/v1/transaction/{id}
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />

-> d. DELETE /api/v1/transaction/{id} <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/DELETE.JPG>)<br /><br/><br />

- Transaction Detail <br /><br />

==> Repository<br />
![XX]()<br />
==> Service<br />
[TransactionDetailService]()<br />
==> Endppoint
-> a. GET /api/v1/transactiondetail <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/GET.JPG>)<br /><br/><br />
-> b. POST /api/v1/transactiondetail <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />

-> c. PUT /api/v1/transactiondetail/{id}
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/POST.JPG>)<br /><br/><br />

-> d. DELETE /api/v1/transactiondetail{id} <br />
![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/22_Getting%20Started%20REST%20Spring%20Boot%20(MVC)/screenshot/DELETE.JPG>)<br /><br/><br />

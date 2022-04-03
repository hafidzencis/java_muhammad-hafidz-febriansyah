# 24_JPA (Spring Database SQL)

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

Buatlah sebuah project yang dapat
melakukan CRUD lengkap yang memuat REST API Endpoint, Repository, dan Service<br /><br />

- Product<br/><br />

  -> Repository<br />
  [Product-Repository](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/praktikum/section24/src/main/java/com/alterra/section24/repository/ProductRepository.java>)<br /><br/>

  -> Service<br />
  [Product-Service](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/praktikum/section24/src/main/java/com/alterra/section24/service/ProductService.java>)<br /><br/>

  -> a. GET /v1/product <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/getprod.JPG>)<br /><br/><br />
  -> b. POST /v1/product <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/postproduct.JPG>)<br /><br/><br />
  -> c. PUT /v1/product/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/puttproduct.JPG>)<br /><br/><br />
  -> d. DELETE /v1/product/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/delprod.JPG>)<br /><br/><br />

### Task 2

Tambahkan sebuah CRUD lagi dalam project tersebut <br /><br />

- Price<br/><br />
  -> Repository<br />
  [Price-Repository](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/praktikum/section24/src/main/java/com/alterra/section24/repository/PriceRepository.java>)<br /><br/>

  -> Service<br />
  [Price-Service](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/praktikum/section24/src/main/java/com/alterra/section24/service/PriceService.java>)<br /><br/>

  -> a. GET /v1/price <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/getprice.JPG>)<br /><br/><br />
  -> b. POST /v1/price <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/postprice.JPG>)<br /><br/><br />
  -> c. PUT /v1/price/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/puttprice.JPG>)<br /><br/><br />
  -> d. DELETE /v1/price/{id} <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/24_JPA%20(Spring%20Database%20SQL)/screenshot/delprice.JPG>)<br /><br/><br />

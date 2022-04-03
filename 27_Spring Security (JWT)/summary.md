# 27_Spring Security (JWT)

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi JWT <br />
2. Dependencies Spring Security <br />
3. Struktur Folder MVC pada Spring Security<br />

### Definisi JWT

JWT singkatan dari JSON Web Token adalah buah token berbentuk JSON yang padat (ukurannya) maksud dari padat ini ialah berbentuk kecil, dapat dikirim melalui URL, Parameter HTTP POST atau default di dalam Headet Http.<br />JWT ini berisi informasi mandiri untuk ditransmisikan antar pihak yang terkait. Token tersebut ini dapat diverifikasi dan dipercaya karena sudah di-sign secara digital. Token JWT bisa di-sign dengan menggunakan secret (algoritma HMAC) atau pasangan public / private key (algoritma RSA).

### Dependencies Spring Security

- Spring Web <br />
  Build web, including RESTful, applications using Spring MVC.
  Uses Apache Tomcat as the default embedded container.<br />

- Spring Security <br />
  Highly customizable authentication and access-control
  framework for Spring applications.<br />

- PostgreSQL Driver<br />
  A JDBC and R2DBC driver that allows Java programs to
  connect to a PostgreSQL database.<br />

- Spring Data JPA<br />
  Persist data in SQL stores with Java Persistence API using
  Spring Data and Hibernate.<br />

- Lombok<br />
  Java annotation library which helps to reduce boilerplate code.<br />

- JJWT<br />
  lo.jsonwebtoken..jjwt cari di maven repository. Digunakan
  sebagai generator dan validasi jwt<br />

### Struktur Folder MVC pada Spring Security

- Config<br />
  Kumpulan Konfigurasi, Security, Bean<br />

- Controller<br />
  Controller sebagai kumpulan routing Rest API, atau sering di
  sebut endpoint<br />

- Model<br />
  Sebagai Bentuk Dasar dari business model, POJO (Plain Old
  Java Object)<br />

- Repository<br />
  Sebagai Interface yang berhubungan langsung dengan
  database<br />

- Security<br />
  Penyedia Token JWT, Security Filter<br />

- Service
  Kumpulan Interface digunakan untuk business proccess /
  rules / logic

## Task

### Task 1

![CODE-JSON-NO-2]()<br /><br />

- Jawaban <br /><br />
  ![CODE-JSON-NO-2]()

### Task 2

![CODE-JSON-NO-2]()<br /><br />

- Jawaban <br /><br />
  ![CODE-JSON-NO-2]()

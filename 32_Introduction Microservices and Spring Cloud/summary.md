# 32_Introduction Microservices and Spring Cloud

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi Arsitukter Monolith dengan Arsitektur Microservices <br />
2. Kelebihan Arsitektur Monolith dengan Arsitektur Microservices <br />
3. Kekurangan Arsitektur Monolith dengan Arsitektur Microservices <br />

### Definisi Arsitukter Monolith dengan Arsitektur Microservices

Arsitektur Monolith

- Singel Deployment
- Fitur tersebut ditaruh di aplikasi yang sama sehingga aplikasi tersebut menjadi besar

Arsitektur Microservices

- Aplikasi-aplikasi kecil yang saling bekerja sama
- Bisa fokus karena mengerjakan satu pekerjaan
- Dapat di deploy dan diubah tanpa tergantung aplikasi lain

### Kelebihan Arsitektur Monolith dengan Arsitektur Microservices

Kelebihan Arsitektur Monolith

- Mudah di Develop
- Mudah di Deploy
- Mudah di Test
- Mudah di Scale

Kelebihan Arsitektur Microservices

- Mudah dimengerti karena ukuran service relatif kecil
- Lebih Mudah mudah di develop, dimantain
- Dapat diganti bahasa pemrograman

### Kekurangan Arsitektur Monolith dengan Arsitektur Microservices

Kekurangan Arsitektur Monolith

- Menyulitkan developer yang baru bergabung
- Development skala besar dengan banyak developer agak menyulitkan
- Running di Aplikasi Monolith

Kekurangn Arsitektur Microservice

- Distributed System ini bisa menjadi kelebihan atau kekurangan
- Rawan terjadi error antar service
- Sulit melakukan testing service karena perbedaan bahasa pemrograman

## Task

### Task 1

Problem 1 Centralized and Decentralized Database<br />

![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/32_Introduction%20Microservices%20and%20Spring%20Cloud/screenshot/no1.jpg)<br /><br /><br />

### Task 2

Problem 2 Services Communication<br /><br />

- a. Menggunakan RPC<br />
  ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/32_Introduction%20Microservices%20and%20Spring%20Cloud/screenshot/no2a.jpg)<br /><br />

- b. Menggunakan Messaging<br />
  ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/32_Introduction%20Microservices%20and%20Spring%20Cloud/screenshot/no2b.jpg)<br /><br />

### Task 3

Problem 3 Implementation Microservices <br /><br />

- a. Customer Service<br/>
  Link : [Customer-Service-File](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/33_Implementation%20Microservices/Praktikum/section33customerservice)<br/><br/>

- b. Product Service<br/>
  Link : [Product-Service-File](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/33_Implementation%20Microservices/Praktikum/section33productservice)<br/><br/>

- c. Order Service<br/>
  Link : [Order-Service-File](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/33_Implementation%20Microservices/Praktikum/section33orderservice)<br/><br/><br/>

  Output : <br/><br/>

  ![Order-Service-File](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/32_Introduction%20Microservices%20and%20Spring%20Cloud/screenshot/msorder/msorder.jpg)<br/><br/>
  ![Order-Service-File](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/32_Introduction%20Microservices%20and%20Spring%20Cloud/screenshot/msorder/response.jpg)<br/><br/>

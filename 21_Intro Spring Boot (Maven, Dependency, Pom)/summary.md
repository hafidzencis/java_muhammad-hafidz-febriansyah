#21_INTRO SPRING BOOT(MAVEN, DEPENDENCY, POM)

## Resume

Dalam materi ini, mempelajari <br />

1. Definsi HTTP <br />
2. HTTP Request Example and HTTP Error<br />
3. Definisi MAVEN<br /><br />

### Definsi HTTP

HTTP : Hypertext Transfer Protocol <br />
HTTP adalah protocol itu transmite hypermedia document seperti HTML,Javascript,CSS,Image,Audio,Video<br />
HTTP ini berawal dari desain komunikasi diantara Web Browser dan Web Server, tetapi
sekarang tidak di gunakan banyak aplikasi.<br /><br />

### HTTP Request Example and HTTP Error <br>

POST /product HTTP/1.1 -----> Request Line <br /><br />

Content-Type: application/json
User-Agent: PostmanRuntime/7.28.4
Accept: _/_
Postman-Token: ac10e9a4-9538-4eb0-b7fa-8d3efc77fb28
Host: localhost:8044
Accept-Encoding: gzip, deflate, br
Connection: keep-alive
Contenct-Length: 122 -----> Request Headers <br /><br />

{"name" : "Melon Import",
"price": 13000,
"quantity" : 100,
"category" : 100,
{"id":1}
} -----> Request Message Body <br /><br />

### Definisi MAVEN

Maven adalah alat manajemen proyek dan perangkat pemahaman proyek yang mengelola pembuatan proyek, laporan, dan dokumen, sementara Gradle adalah alat otomatisasi pembangunan sumber terbuka yang berfokus pada fleksibilitas dan kinerja.

## Task

### Task 1

PROBLEM SAY HELLO FROM SPRINGBOOT<br /><br />

- a. GET <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/21_Intro%20Spring%20Boot%20(Maven%2C%20Dependency%2C%20Pom)/screenshot/GET.JPG>)<br /><br/><br />
- b. POST <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/21_Intro%20Spring%20Boot%20(Maven%2C%20Dependency%2C%20Pom)/screenshot/POST.JPG>)<br /><br/><br />
- c. DELETE <br />
  ![CODE-JSON-NO-2](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/21_Intro%20Spring%20Boot%20(Maven%2C%20Dependency%2C%20Pom)/screenshot/DELETE.JPG>)<br /><br/><br />

### Task 2

ENDPOINT DESCRIPTION<br /><br />

- a. GET <br />
  adalah metode HTTP Request yang paling simpel, metode ini digunakan untuk membaca atau mendapatkan data dari sumber.<br /><br/><br />
- b. POST <br />
  adalah metode HTTP Request yang digunakan untuk membuat / menambahkan data baru dengan menyisipkan data dalam body saat request dilakukan.<br /><br/><br />
- c. DELETE <br />
  adalah metode HTTP Request yang digunakan untuk menghapus suatu data.<br /><br/><br />

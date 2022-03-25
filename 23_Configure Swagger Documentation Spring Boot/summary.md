# 23_Configure Swagger Documentation Spring Boot

## Resume

Pada materi ini, saya mempelajari <br />

1. Definisi API documentation <br />
2. Tools API documentation <br />
3. Definisi OpenAPI Specification <br /><br />

### Definisi API documentation

adalah content teknikal yang didalam terdapat intruksi cara efisien penggunaan API dan juga menyediakan update lifecycle API yang ada new version dan versi yang
tidak digunakan lagi.<br />
API documentation ini penting untuk melakukan trace fitur update pada suatu aplikasi.

### Tools API documentation

Tools untuk pembuatan API documentation antara lain<br />
Redacly,Swagger, Stoplight, Apiary dan Postman. <br />
Tetapi memilih Swagger karena open source, terdapat OpenAPI Specification,Great API Docs UI for fronted or mobile developer dan digunakan oleh big company.

### Definisi OpenAPI Specification

OpenAPI Specification ini dahulu adalah Swagger Specification. OAS ini memungkinkan developer untuk desain teknologi API interface.

## Task

### Task 1

Buat aplikasi CRUD <br /><br />
product<br />
id<br />
name<br />
description<br />
stock<br />
price<br />
lalu diintegrasikan dengan Swagger untuk API dokumentasi

- a. GET /v1/posts <br />
  ![CODE-JSON-NO-2]()<br /><br/><br />
- b. POST /v1/posts <br />
  ![CODE-JSON-NO-2]()<br /><br/>
  ![CODE-JSON-NO-2]()<br /><br/><br />
- c. DELETE /v1/posts/{id} <br />
  ![CODE-JSON-NO-2]()<br /><br/><br />
- d. PUT /v1/posts/{id} <br />
  ![CODE-JSON-NO-2]()<br /><br/>
  ![CODE-JSON-NO-2]()<br /><br/><br />

### Task 2

Custom payload response atau request di model dengan annotation di Swagger API Docs<br /><br/>
![CODE-JSON-NO-2]()<br /><br/>

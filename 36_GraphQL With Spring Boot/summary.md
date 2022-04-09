# 36_Graph QL With Spring Boot

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi GraphQL <br />
2. Kelebihan GraphQL <br />
3. Karakteristik GraphQL<br />

### Definisi GraphQL

GraphQL adalah bahasa query dan runtime sisi server untuk Application Programming Interfaces (API) yang memprioritaskan untuk memberi klien data sesuai dengan apa yang mereka minta. Pada intinya, GraphQL merupakan bahasa untuk query database dari aplikasi sisi klien.<br/>

### Kelebihan GraphQL

1. Tipe data akan terdefinisi dengan baik sehingga dapat mengurangi miskomunikasi antara klien dan server.<br/>
2. Memungkinkan API aplikasi untuk berkembang tanpa memecah kueri yang ada.<br/>
3. Memiliki banyak ekstensi yang bersifat open source sehingga beberapa fitur yang tidak tersedia dapat ditambahkan.<br/>
4. Bersifat introspective. Klien dapat melakukan permintaan list tipe data yang tersedia sehingga sangat ideal untuk auto-generating documentation.<br/>
5. Klien mendapat apa yang mereka minta tanpa over fetching atau menerima lebih banyak data dari yang dibutuhkan.

### Karakteristik GraphQL

1. Memungkinkan klien untuk menentukan data yang dibutuhkan secara spesifik.<br/>
2. Mudah untuk mengumpulkan data dari berbagai sumber.<br/>
3. Menggunakan GraphQL type system untuk menggambarkan data.<br/>

## Task

### Task 1

Write graphql using schemas below on spring boot project<br/><br/>

1. Controller<br />
   ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/36_GraphQL%20With%20Spring%20Boot/praktikum/section36/src/main/java/com/alterra/section36/controller)<br /><br />
2. Domain<br />

   - Dao<br />
     ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/36_GraphQL%20With%20Spring%20Boot/praktikum/section36/src/main/java/com/alterra/section36/domain/dao)<br /><br />
   - Dto<br />
     ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/36_GraphQL%20With%20Spring%20Boot/praktikum/section36/src/main/java/com/alterra/section36/domain/dto)<br /><br />

3. Repository<br />
   ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/36_GraphQL%20With%20Spring%20Boot/praktikum/section36/src/main/java/com/alterra/section36/repository)<br /><br />
4. Service<br />
   ![xx](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/tree/master/36_GraphQL%20With%20Spring%20Boot/praktikum/section36/src/main/java/com/alterra/section36/service)<br /><br />

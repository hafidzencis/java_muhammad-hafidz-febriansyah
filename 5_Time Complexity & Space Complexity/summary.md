# 5_Time Complexity & Space Complexity

## Resume

Dalam materi ini, mempelajari :<br />

1. Apa itu time complexity <br />
2. Perbandingan Time Complexity <br />
3. Rata - rata komputer untuk melakukan perform.<br />

### Apa itu time complexity

Time Complexity adalah ukuran waktu berapa lama pada operasi - operasi yang dapat dilakukan<br />
operasi tersebut adalah operasi assignment dan operasi aritmatika.Untuk mengukur time complexity,harus melihat operasi yang cukup dominan.

### Perbandingan Time Complexity

1. Constant Time = tidak ada operasi seperti for loop atau while loop.Hanya terdapat variabel.<br />
   Apabila dimasukkan input yang cukup besar/panjang maka waktunya tetap berjalan secara konstan.
2. Linier Time = terdapat operasi seperti for loop atau while loop dimana ada diberi batasan yaitu N.<br />
   untuk mencapai batasan tersebut terdapat sebuah seperti increment contoh i = i + 1.<br />
   Apabila dimasukkan input yang cukup besar/panjang maka waktunya akan bertambah cukup signifikan.
3. Logarithm Time = terdapat operasi for loop atau while loop dimana for loop tersebut mempunyai batasan.<br />
   Untuk mencapai batasan tersebut mempunyai pertambahan yang cukup cepeat contoh nya dengan incerement (i += 2).<br />
   Apabila dimasukkan input yang cukup besar/panjang maka waktunya akan bertambah sedikit.
4. Quadric Time = terdapat operasi for loop atau while loop dimana for loop tersebut adanya percabangan lagi.<br />
   Apabila dimasukkan input yang cukup besar/panjang maka waktunya akan bertambah cukup banyak.

### Rata - rata komputer untuk melakukan perform dan penggunaan O(n),O(1),O(n log n),O(n pangkat 2),O(n pangkat 3)

Untuk sekarang rata - rata komputer bisa mempunyai perform 10 pangkat 8 kurang dari sedetik.<br /><br />

Apabila besar/panjang inputan itu kurang dari sama dengan 1.000.000 itu menggunakan O(n) or O (n log n)<br />
Apabila besar/panjang inputan itu kurang dari sama dengan 10.000 itu menggunakan O(n pangkat 2)<br />
Apabila besar/panjang inputan itu kurang dari sama dengan 500 itu menggunakan O(n pangkat 3)<br /><br />

Pernyataan diatas tersebut tidak punya batasan yang persis.Itu hanya untuk memncapai dan menyelesaikan suatu tugas

## Task

### Task 1

Link Code : [Code-Task-1](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/praktikum/src/com/soal1.java)<br />

Berikut gambar input dengan output <br />
![input-output-no-1](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/screenshot/soal1.JPG) <br />
Dalam satuan milisekon

### Task 2

Link Code : [Code-Task-2](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/praktikum/src/com/soal2.java)<br />

Berikut dan gambar input dengan output <br />
![input-output-no-2](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/5_Time%20Complexity%20%26%20Space%20Complexity/screenshot/soal2.JPG)<br />
Dalam satuan nanosekon

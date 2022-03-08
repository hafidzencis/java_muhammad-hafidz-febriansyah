# 10_Dynamic Programming

## Resume

Dalam materi ini, mempelajari <br />

1. Definisi Dynamic Programming <br />
2. Karakteristik Dynamic Programming <br />
3. Metode Dynamic Programming <br />

### Definisi Dynamic Programming

Dynamic Programming adalah menyelesaikan masalah dengan memecah problem - problem agar lebih mudah
dikerjakan tetapi mengutakan optimasi(minimum dan maksimum).<br />
Contoh dari dyanimic programming adalah penyelesaian soal dari Fibonacci number

### Karakterisitik Dynamic Programming

1. Overlapping Subproblems
   adalah 1 solusi dari subproblem bisa menyelesaikan subproblem yang sama atau yang ganda.<br />
   Contoh : mencari bilangan fibonacci, mencari fibonacci ke 4.<br /> Saat mencari bilangan fibonacci ke 4,
   membagi menjadi 2 yaitu fib(3) dan fib(2).<br />Dibawah fibonacci 4, terdapat fib(3) dibagi menjadi fib(2) dan fib(1).<br />Di bawah fibonacci 3 terdapat fib(2) dibagi menjadi fib(1) dan fib(0).<br />Di bawah fibonacci 4 terdapat fib(2), di bagi menjadi fib(1) dan fib(0).<br /> <br />
   Di atas dapat disimpulkan bahwa, terdapat pemanggilan 2x terhadapa fib(2) dan pemanggilan 3x fib(1)
   <br />

2. Optimal Subctructure Property
   adalah keseluruhan solusi yang optimal bisa dibangun dari subproblem yang sudah mempunyai solusi.<br />
   Contohnya fibonacci. Dimana 'n' bisa dikurangi menjadi subproblems yaitu 'n-1' dan 'n-2'.

### Metode Dynamic Programming

1. Top-down with Memoization
   Dalam menyelesaikan masalah yang besar, menggunakan rekursif dimana mencari soluti dari setiap subproblems.<br />
   Ketika menyelesaikan subproblems, dimana hasilnya disimpan ke dalam sub data / temporary / cache agar tidak melakukan penyelesaian masalah secara berulang sehingga bisa mengembalikan hasil penyimapanan tersebut.<br />
   Teknik ini, menyimpan hasil ke dalam solusi subpbroblem yang sudah jadi dinamakan MEMOIZATION

2. Bottom-up with Tabulation
   Metode ini berkebalikan dengan Top-down Memoizatopn.Dimana kita menyelesaikan masalah tidak menggunakan rekursif dan di mulai dari bawah hingga sampai ke atas.<br />
   Metode ini mencari nilai dari kecil sampai besar dan menggunakan 'n' dimensional.

## Task

### Task 1

Link Code : [Code-Task-1](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/10_Dynamic%20Programming/praktikum/src/soal1.java)<br />

Berikut gambar input dengan output <br />
![input-output-no-1](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/10_Dynamic%20Programming/screenshot/no1.JPG)<br />

### Task 2

Link Code : [Code-Task-2](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/10_Dynamic%20Programming/praktikum/src/soal2.java)<br />

Berikut gambar input dengan output <br />
![input-output-no-1](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/10_Dynamic%20Programming/screenshot/no2.JPG)<br />

### Task 3

Link Code : [Code-Task-3](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/10_Dynamic%20Programming/praktikum/src/soal3.java)<br />

### Task 4

Link Code : [Code-Task-4](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/10_Dynamic%20Programming/praktikum/src/soal4.java)<br />

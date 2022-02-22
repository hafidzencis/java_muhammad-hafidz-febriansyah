# 2_Version Control and Branch Management (Git)

## Resume

Dalam materi ini, mempelajari :
1.Pengertian VCS
2.Tools yang digunakan untuk melakukan VCS
3.Perintah dasar GIT

### Pengertian VCS

VCS (version control sytem) ini digunakan untuk melakukan kontrol(tracking,melihat) file system supaya dapat melihat
file awal dibuat sampai file yg terakhir dibuat

### Tools yang digunakan untuk melakukan VCS

Salah satu version control system populer yang digunakan para developer untuk
mengembangkan software secara bersamaan adalah GIT
GIT adalah software VCS (version control sytem) berguna
untuk mencatat perubahan repository(GITHUB)

### Perintah dasar GIT

Beberapa dasar commands pada GIT:
...
git remote add origin <link github> digunakan untuk sebagai jalan awal suatu branch
git add . digunakan untuk menandai semua file ke staging area
git add commit -m <pesan disampaikan> digunakan untuk memberi pesan pada dari staging area ke repository.File tersebut sudah siap untuk sinkronisasi ke repository
git push origin <nama branch> digunakan untuk menyinkronisasi file yang sudah siap ke dalam repository
...
dan masih banyak lainnya

## Task

### 1.Membuat sebuah repository GITHUB

Task ini saya membuat repository dengan nama java_muhammad-hafidz-febriansyah dengan folder awal section 2 yaitu Version Control and Branch Management (Git)

![SS repo](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/1.Buat%20repo.JPG>)

### 2.Implementasikan branching master, development, featureA, featureB

1. Master
   ![SS repo msttr](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/2.1%20mstr.JPG>)
2. Development
   ![SS repo dev](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/2.2%20dev.JPG>)
3. Feature A
   ![SS repo feat A](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/2.3%20featA.JPG>)
4. Feature B
   ![SS repo feat B](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/2.4%20featB.JPG>)

### 3. Implementasikan intruksi git untuk push, pull, stash and merge

1. GIT PUSH
   Pada hal ini, saya melakukan push pada branch development
   Berikut kode nya **Enter**
   [master.java](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/4329e858711e4e2bb787000e79e3bfcc5a8de937/2_Version%20Control%20and%20Branch%20Management%20(Git)/praktikum/src/com/Master.java>)
   ![SS push](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/1-git%20push.JPG>)
2. GIT PULL
   Pada hal ini, saya melakukan pull dari branch featureA meminta pull kepada development **Enter**
   [pullhistory](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/commit/8340c27bad3b38ab6718f17b362b77f4cb19fa94)
   **Enter**
   ![SS pull](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/3-git%20pull.JPG>)
3. GIT STASH
   Pada hal ini, melakukan stash lalu melakukan stash apply**Enter**
   [stashistory1](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/commit/6b08f7cd3a303cffe7df845687441a511dea231e)**Enter**
   [stashhistory2](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/commit/78f74a73917b0878536a34ddef0c6378c6654aac)**Enter**
   ![SS stash](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/2-git%20stash.JPG>)
4. GIT MERGE
   Pada hal ini saya melakukan merge menggunakan merge fast forward dari branch featureA merge ke development**Enter**
   [mergeff](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/commit/e02441984ea8e62118e45d07ef87f05a4cca4db1)**Enter**
   Maaf, saya salah melakukan penamaan commit seharusnya merge ff**Enter**
   ![SS merge](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/4-merge%20ff%20foward.JPG>)

### 4.Implementasikan penanganan konflik ketika di branch development stlh merge dari featureA seteleh itu featureB

Pada hal ini saya melakukan merge dari branch featureA merge fast forward ke development
![SS mergeff](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/4-merge%20ff%20foward.JPG>)

Setelah itu, saya melakukan merge dari branch featureB merge no fast forward ke development
![SS mergenoff](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/4-merge%20noff%20accepting%20incoming.JPG>)

dan terjadi konflik, penanganan saya adalah malakukan incoming change/ memilih file dari featureB**Enter**
[penanganankonnflik](https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/commit/2225a709421199c8844a9b3df3c73db8596a2485)**Enter**
![SS nonkonflik](<https://github.com/hafidzencis/java_muhammad-hafidz-febriansyah/blob/master/2_Version%20Control%20and%20Branch%20Management%20(Git)/screenshot/4-merge%20noff%20conflict.JPG>)

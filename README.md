# Sistem Manajemen Salon PBO

## Identitas Mahasiswa

**Nama:** ADELIA GITHA NAVEEZHA HERMAWAN

**NIM:** 2509116110

## 1. Penjelasan Studi Kasus

Studi kasus yang dipilih pada tugas ini adalah Sistem Manajemen Salon. Program ini merupakan aplikasi berbasis konsol (Command Line Interface) yang dibuat menggunakan bahasa pemrograman Java dengan menerapkan prinsip Pemrograman Berorientasi Objek.

Sebuah salon kecantikan setiap harinya melayani banyak pelanggan dengan berbagai jenis perawatan, mulai dari potong rambut, creambath, facial, manicure pedicure, hingga smoothing rambut. Setiap pelanggan yang datang perlu dicatat identitasnya, setiap jenis perawatan perlu dicatat harganya, dan setiap pemesanan perlu dicatat jadwalnya. Apabila seluruh data tersebut dicatat secara manual di buku atau kertas, pengelola salon akan kesulitan ketika ingin mencari data tertentu, mengubah data yang salah, maupun menghapus data yang sudah tidak diperlukan. Selain itu, catatan manual juga rawan hilang, rusak, atau tertukar antara satu pelanggan dengan pelanggan lainnya.

Oleh karena itu, program ini dibuat untuk membantu pengelola salon dalam mencatat dan mengelola data secara lebih teratur. Seluruh data dapat ditambah, dilihat, diubah, dan dihapus hanya dengan memilih menu yang tersedia, sehingga pekerjaan pencatatan menjadi lebih cepat dan lebih rapi.

Program ini mengelola tiga data utama. Data pertama adalah data pelanggan yang berisi ID pelanggan, nama, dan nomor telepon. Data kedua adalah data layanan yang berisi ID layanan, nama layanan, dan harga. Data ketiga adalah data reservasi yang berisi ID reservasi, pelanggan yang melakukan pemesanan, layanan yang dipesan, serta tanggal reservasi. Ketiga data ini saling berkaitan, karena sebuah reservasi tidak mungkin dibuat tanpa adanya pelanggan yang memesan dan layanan yang dipesan.

Pada setiap data tersebut, pengguna dapat melakukan empat operasi pengelolaan data, yaitu menambah data baru, menampilkan seluruh data, mengubah data yang sudah ada, dan menghapus data. Seluruh data disimpan menggunakan ArrayList sehingga jumlahnya dapat bertambah maupun berkurang selama program dijalankan tanpa perlu menentukan batas jumlah data sejak awal.

Sebelum menu ditampilkan, program terlebih dahulu mengisi data awal berupa lima data pelanggan, lima data layanan, dan lima data reservasi. Data awal ini dibuat agar fitur tampilkan, ubah, dan hapus dapat langsung diuji tanpa harus menambahkan data satu per satu terlebih dahulu.

## 2. Penjelasan Hierarki Class

Program ini terdiri dari lima class yang dibagi ke dalam dua package. Pembagian ke dalam package dilakukan agar struktur program lebih rapi, karena class yang berfungsi sebagai penyimpan data tidak tercampur dengan class yang berisi logika program.

Package pertama adalah com.mycompany.sistem_manajemen_salon_pbo yang berisi kelas utama bernama Sistem_Manajemen_Salon_PBO. Kelas ini memuat method main sebagai titik awal program dijalankan, pembuatan data awal, serta seluruh logika menu mulai dari menu utama hingga sub menu pelanggan, layanan, dan reservasi.

Package kedua adalah model yang berisi empat class sebagai cetak biru data, yaitu Orang, Pelanggan, Layanan, dan Reservasi. Keempat class ini hanya berisi atribut, constructor, serta method getter dan setter, tanpa berisi logika menu sama sekali. Karena berada pada package yang berbeda, kelas utama memanggil class-class tersebut menggunakan perintah import.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 43 20" src="https://github.com/user-attachments/assets/989c6836-ea40-4f71-bed4-59d73699ec9a" />


Relasi inheritance pada program ini terdapat antara class Orang dan class Pelanggan. Class Orang berperan sebagai super-class atau class induk, sedangkan class Pelanggan berperan sebagai sub-class atau class turunan. Hubungan ini dapat dibaca sebagai "Pelanggan adalah seorang Orang", yang merupakan ciri dari relasi inheritance yang tepat.

Class Orang menyimpan data yang secara umum dimiliki oleh setiap orang, yaitu nama dan nomor telepon. Class Pelanggan kemudian mewarisi seluruh atribut dan method yang ada pada class Orang, lalu menambahkan satu atribut khusus miliknya sendiri, yaitu ID pelanggan. Dengan demikian, sebuah objek Pelanggan memiliki tiga data sekaligus, yaitu ID pelanggan yang berasal dari dirinya sendiri, serta nama dan nomor telepon yang diwarisi dari class Orang.

Relasi ini dipilih karena memang relevan dengan keadaan sebenarnya. Setiap pelanggan salon pada dasarnya adalah seorang manusia yang pasti memiliki nama dan nomor telepon. Nama dan nomor telepon bukanlah data yang hanya dimiliki oleh pelanggan, melainkan data yang juga dimiliki oleh karyawan, kapster, maupun pemilik salon. Oleh sebab itu, data tersebut lebih tepat diletakkan pada class yang lebih umum, yaitu class Orang.

Keuntungan dari rancangan ini terlihat ketika program ingin dikembangkan lebih lanjut. Apabila suatu saat salon membutuhkan data karyawan atau kapster, class baru tersebut cukup mewarisi class Orang dengan kata kunci extends, lalu menambahkan atribut khususnya sendiri seperti jabatan atau gaji. Atribut nama dan nomor telepon beserta getter dan setter-nya tidak perlu dituliskan ulang, sehingga kode menjadi lebih ringkas dan tidak terjadi penulisan kode yang sama secara berulang di beberapa class.

Sementara itu, class Layanan dan class Reservasi tidak memiliki relasi inheritance. Class Layanan berdiri sendiri karena data layanan salon merupakan data tentang jenis perawatan, sehingga tidak memiliki hubungan turunan dengan data orang. Class Reservasi juga tidak mewarisi class mana pun, namun class ini terhubung dengan class Pelanggan dan class Layanan dengan cara menyimpan objek dari kedua class tersebut sebagai atributnya. Hubungan seperti ini berbeda dengan inheritance, karena Reservasi bukanlah seorang Pelanggan maupun sebuah Layanan, melainkan sebuah data yang memiliki pelanggan dan memiliki layanan. Dengan cara ini, satu data reservasi langsung terhubung dengan data pelanggan dan data layanan yang sebenarnya tanpa perlu menyalin ulang nama pelanggan maupun nama layanan.

## 3. Penjelasan Kode yang Menerapkan Inheritance

### 3.1 Super-class Orang

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 28 47" src="https://github.com/user-attachments/assets/57d1fd20-7a39-4da7-852b-c5046831e15c" />


Class Orang merupakan super-class yang menjadi dasar bagi class turunannya. Class ini memiliki dua atribut, yaitu nama dan noTelepon. Kedua atribut tersebut menggunakan tipe data String. Nomor telepon sengaja disimpan sebagai String dan bukan sebagai angka, karena nomor telepon di Indonesia umumnya terdiri dari 11 sampai 13 digit yang melebihi batas maksimum tipe data int, serta angka 0 di awal nomor telepon akan hilang apabila disimpan sebagai bilangan.

Kedua atribut tersebut dideklarasikan dengan access modifier private sehingga tidak dapat diakses secara langsung dari luar class, termasuk dari class turunannya sendiri. Hal ini merupakan penerapan konsep enkapsulasi, yaitu menyembunyikan data di dalam class agar tidak dapat diubah secara sembarangan. Untuk membaca dan mengubah nilainya, class ini menyediakan method getter dan setter yang bersifat public, yaitu getNama untuk membaca nama, setNama untuk mengubah nama, getNoTelepon untuk membaca nomor telepon, dan setNoTelepon untuk mengubah nomor telepon.

Class ini juga memiliki sebuah constructor yang menerima nama dan nomor telepon sebagai parameter. Constructor merupakan method khusus yang dijalankan secara otomatis ketika sebuah objek dibuat, dan berfungsi untuk mengisi nilai awal dari atribut. Di dalam constructor tersebut digunakan kata kunci this untuk membedakan antara atribut milik class dengan parameter yang memiliki nama sama. Constructor inilah yang nantinya akan dipanggil oleh sub-class ketika sebuah objek Pelanggan dibuat.

### 3.2 Sub-class Pelanggan

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 29 36" src="https://github.com/user-attachments/assets/086767f4-6c12-4ba7-b7b2-f74eea249749" />


Class Pelanggan merupakan sub-class yang menerapkan inheritance. Class ini terlihat jauh lebih pendek dibandingkan apabila ditulis tanpa inheritance, karena sebagian besar isinya sudah diwarisi dari class Orang. Terdapat tiga bagian penting pada class ini.

Bagian pertama adalah kata kunci extends Orang yang terletak pada baris deklarasi class. Kata kunci ini menandakan bahwa class Pelanggan merupakan turunan dari class Orang. Dengan adanya kata kunci ini, class Pelanggan secara otomatis mewarisi seluruh method public milik class Orang. Artinya, method getNama, setNama, getNoTelepon, dan setNoTelepon tidak perlu dituliskan kembali di dalam class Pelanggan, namun tetap dapat dipanggil melalui objek Pelanggan seolah-olah method tersebut adalah milik class Pelanggan sendiri.

Bagian kedua adalah pemanggilan super(nama, noTelepon) di dalam constructor. Kata kunci super digunakan untuk memanggil constructor milik super-class. Hal ini diperlukan karena atribut nama dan noTelepon bersifat private di dalam class Orang, sehingga class Pelanggan tidak dapat mengisi kedua atribut tersebut secara langsung walaupun class Pelanggan merupakan turunannya. Oleh karena itu, pengisian nilainya diserahkan kepada constructor class Orang melalui kata kunci super. Alurnya adalah ketika objek Pelanggan dibuat, constructor Pelanggan menerima tiga nilai, kemudian nilai nama dan nomor telepon diteruskan ke constructor class Orang melalui super, sedangkan nilai ID pelanggan disimpan sendiri oleh class Pelanggan. Pemanggilan super juga wajib diletakkan pada baris pertama di dalam constructor sub-class, karena bagian induk dari sebuah objek harus disiapkan terlebih dahulu sebelum bagian turunannya.

Bagian ketiga adalah atribut idPelanggan yang hanya dimiliki oleh class Pelanggan. Atribut ini tidak terdapat pada class Orang karena ID pelanggan merupakan data yang khusus dimiliki oleh pelanggan salon, bukan oleh semua orang. Atribut ini juga dideklarasikan private dan dilengkapi dengan getter dan setter miliknya sendiri, yaitu getIdPelanggan dan setIdPelanggan.

Apabila program ini tidak menggunakan inheritance, class Pelanggan harus menuliskan sendiri atribut nama dan noTelepon beserta keempat method getter dan setter-nya. Hal tersebut mungkin tidak terasa berat apabila hanya terdapat satu class, namun akan menjadi penulisan kode berulang ketika program memiliki beberapa class yang sama-sama membutuhkan data nama dan nomor telepon.

### 3.3 Pemanggilan Method Warisan pada Kelas Utama

<img width="400" alt="image" src="https://github.com/user-attachments/assets/063fab83-f596-4151-aa8a-d05b1d15e065" />


Pada kelas utama, penerapan inheritance terlihat jelas ketika program menampilkan data pelanggan. Program mengambil setiap objek Pelanggan dari dalam ArrayList satu per satu menggunakan perulangan for, lalu menampilkan datanya. Objek Pelanggan dapat langsung memanggil method getNama dan getNoTelepon, padahal kedua method tersebut sama sekali tidak dituliskan di dalam class Pelanggan. Hal ini dapat terjadi karena kedua method tersebut diwarisi dari class Orang melalui kata kunci extends. Sementara itu, method getIdPelanggan dipanggil dari class Pelanggan itu sendiri. Dari sisi kelas utama, tidak ada perbedaan cara memanggil method warisan dengan method milik class sendiri.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 33 21" src="https://github.com/user-attachments/assets/d936d043-5725-4a0c-92dc-a93440a6841f" />


Hal yang sama juga terlihat pada menu Ubah Pelanggan. Program terlebih dahulu mencari objek Pelanggan yang memiliki ID sesuai dengan masukan pengguna. Setelah ditemukan, program memanggil method setNama dan setNoTelepon pada objek tersebut untuk menggantikan nilai lama dengan nilai yang baru. Kedua method ini juga merupakan method warisan dari class Orang. Karena atribut nama dan noTelepon bersifat private, perubahan nilai hanya dapat dilakukan melalui kedua method setter ini, sehingga data tetap terlindungi.

## 4. Penjelasan Alur Program dan Screenshot Program Dijalankan

### 4.1 Menu Utama

Ketika program dijalankan, sistem menampilkan Menu Utama yang terdiri dari empat pilihan, yaitu Kelola Pelanggan, Kelola Layanan, Kelola Reservasi, dan Keluar. Pengguna memilih menu dengan memasukkan angka sesuai pilihan yang tersedia, kemudian pilihan tersebut diproses menggunakan percabangan switch.

Menu Utama dibungkus menggunakan perulangan do-while. Perulangan jenis ini dipilih karena menu harus ditampilkan minimal satu kali terlebih dahulu sebelum kondisi berhenti diperiksa. Setelah satu proses selesai, Menu Utama akan ditampilkan kembali secara otomatis, sehingga pengguna dapat melakukan beberapa proses sekaligus tanpa harus menjalankan ulang program. Perulangan baru berhenti ketika pengguna memilih angka 4.
<img width="400" alt="WhatsApp Image 2026-09-21 at 20 34 18" src="https://github.com/user-attachments/assets/3075f72f-335b-4878-875a-c694e70775b5" />


### 4.2 Menu Pelanggan

Menu Pelanggan digunakan untuk mengelola data pelanggan salon. Setelah pengguna memilih angka 1 pada Menu Utama, sistem menampilkan empat sub menu, yaitu Tambah Pelanggan, Tampilkan Pelanggan, Ubah Pelanggan, dan Hapus Pelanggan. Menu ini merupakan bagian program yang paling banyak menggunakan hasil penerapan inheritance, karena seluruh prosesnya melibatkan objek Pelanggan yang merupakan turunan dari class Orang.

**Tambah Pelanggan**

Pada menu ini pengguna memasukkan ID pelanggan, nama pelanggan, dan nomor telepon secara berurutan. Setiap pertanyaan ditampilkan satu per satu sehingga pengguna tidak perlu mengetik seluruh data sekaligus. Data yang dimasukkan kemudian digunakan untuk membuat objek Pelanggan yang baru menggunakan kata kunci new.

Pada saat objek dibuat, constructor Pelanggan akan dijalankan. Di dalamnya, nama dan nomor telepon diteruskan ke constructor milik class Orang melalui kata kunci super, sedangkan ID pelanggan disimpan oleh class Pelanggan sendiri. Setelah objek selesai dibuat, objek tersebut ditambahkan ke dalam ArrayList menggunakan method add, dan sistem menampilkan pesan bahwa data pelanggan berhasil ditambahkan.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 36 51" src="https://github.com/user-attachments/assets/57ef5b0c-434d-4842-bb28-5e6415521b60" />


**Tampilkan Pelanggan**

Sistem menampilkan seluruh data pelanggan yang tersimpan, meliputi ID, nama, dan nomor telepon. Penelusuran data dilakukan dari data pertama sampai data terakhir menggunakan perulangan for dengan bantuan method size untuk mengetahui jumlah data, dan method get untuk mengambil data pada setiap posisi. Setiap data dipisahkan dengan garis pembatas agar tampilan lebih rapi dan mudah dibaca.

Pada tampilan ini terlihat bahwa nama dan nomor telepon berhasil ditampilkan melalui method yang diwarisi dari class Orang, sedangkan ID ditampilkan melalui method milik class Pelanggan sendiri. Selain lima data awal, data yang baru saja ditambahkan pada langkah sebelumnya juga sudah masuk ke dalam daftar. Hal ini membuktikan bahwa proses pembuatan objek melalui inheritance dan penyimpanan ke dalam ArrayList berjalan dengan benar.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 37 38" src="https://github.com/user-attachments/assets/e3f4b433-61cb-4693-8514-7bf8c7801e82" />


**Ubah Pelanggan**

Pengguna memasukkan ID pelanggan yang ingin diubah. Program kemudian menelusuri seluruh isi daftar dan membandingkan ID pada setiap data dengan ID yang dimasukkan pengguna. Apabila ditemukan, pengguna diminta memasukkan nama dan nomor telepon yang baru, lalu nilai lama akan digantikan melalui method setter yang diwarisi dari class Orang. ID pelanggan tidak ikut diubah karena ID berfungsi sebagai identitas yang membedakan satu pelanggan dengan pelanggan lainnya.

Program menggunakan sebuah variabel bertipe boolean sebagai penanda apakah data berhasil ditemukan atau tidak. Apabila sampai perulangan selesai ID tidak ditemukan, sistem menampilkan pesan bahwa ID pelanggan tidak ditemukan dan tidak ada data yang berubah.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 33 21" src="https://github.com/user-attachments/assets/aaecd653-d2ed-4bd8-a1c5-72a1f3dab268" />

**Hapus Pelanggan**

Pengguna memasukkan ID pelanggan yang ingin dihapus. Program mencari data dengan ID tersebut menggunakan cara yang sama seperti pada proses ubah, kemudian menghapusnya dari daftar menggunakan method remove sehingga jumlah data pelanggan berkurang satu. Setelah sebuah data dihapus, posisi data yang berada di belakangnya akan bergeser maju secara otomatis sehingga tidak ada ruang kosong di tengah daftar. Apabila ID tidak terdaftar, sistem hanya menampilkan pesan pemberitahuan tanpa menghapus data apa pun.

### 4.3 Menu Layanan

Menu Layanan digunakan untuk mengelola data jenis perawatan yang ditawarkan salon beserta harganya. Setelah pengguna memilih angka 2 pada Menu Utama, sistem menampilkan empat sub menu, yaitu Tambah Layanan, Tampilkan Layanan, Ubah Layanan, dan Hapus Layanan. Alur pengelolaannya serupa dengan Menu Pelanggan, sehingga pengguna yang sudah terbiasa dengan Menu Pelanggan tidak perlu mempelajari cara baru.

Pada proses Tambah Layanan, pengguna memasukkan ID layanan, nama layanan, dan harga. Harga menggunakan tipe data double sehingga dapat menampung nilai desimal apabila diperlukan. Pada proses Ubah Layanan, pengguna dapat mengganti nama layanan maupun harganya, misalnya ketika salon melakukan penyesuaian tarif. Pada proses Hapus Layanan, pengguna dapat menghapus layanan yang sudah tidak ditawarkan lagi oleh salon.

Pada proses Tampilkan Layanan, sistem menampilkan seluruh data layanan yang tersimpan, meliputi ID layanan, nama layanan, dan harga. Daftar ini juga menjadi acuan bagi pengguna ketika hendak membuat reservasi, karena ID layanan yang dipilih pada menu reservasi harus sesuai dengan ID yang tercantum di sini.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 38 57" src="https://github.com/user-attachments/assets/5a81a642-3d2c-4b67-9b8a-ee3e267519d1" />


### 4.4 Menu Reservasi

Menu Reservasi digunakan untuk mengelola data pemesanan layanan oleh pelanggan. Setelah pengguna memilih angka 3 pada Menu Utama, sistem menampilkan empat sub menu, yaitu Tambah Reservasi, Tampilkan Reservasi, Ubah Reservasi, dan Hapus Reservasi. Menu ini merupakan penghubung antara data pelanggan dan data layanan, karena satu reservasi selalu melibatkan keduanya sekaligus.

**Tambah Reservasi**

Sebelum meminta masukan apa pun, program terlebih dahulu memeriksa apakah daftar pelanggan atau daftar layanan masih kosong menggunakan method isEmpty. Apabila salah satunya kosong, proses langsung dibatalkan dan sistem meminta pengguna menambahkan data terlebih dahulu, karena reservasi tidak mungkin dibuat tanpa adanya pelanggan maupun layanan.

Apabila kedua daftar sudah terisi, pengguna memasukkan ID reservasi terlebih dahulu. Sistem kemudian menampilkan daftar pelanggan beserta ID dan namanya agar pengguna dapat memilih dengan mudah tanpa perlu menghafal ID yang tersedia. Nama pelanggan pada daftar ini juga ditampilkan menggunakan method getNama yang diwarisi dari class Orang. Setelah pengguna memilih ID pelanggan, sistem menampilkan daftar layanan dengan cara yang sama.

Program kemudian memastikan bahwa ID pelanggan dan ID layanan yang dipilih benar-benar ada di dalam daftar. Apabila salah satunya tidak ditemukan, proses reservasi dibatalkan. Apabila keduanya ditemukan, pengguna memasukkan tanggal reservasi, lalu objek Reservasi dibuat dengan menyertakan objek pelanggan dan objek layanan yang telah dipilih, dan disimpan ke dalam daftar reservasi.

<img width="400" alt="image" src="https://github.com/user-attachments/assets/1cadffb2-47b7-47b3-8f34-dff58c82d203" />


**Tampilkan Reservasi**

Sistem menampilkan seluruh data reservasi yang tersimpan, meliputi ID reservasi, nama pelanggan, nama layanan, dan tanggal. Melalui tampilan ini pengelola salon dapat mengetahui siapa saja yang telah melakukan pemesanan, layanan apa yang dipesan, dan kapan jadwalnya.

Nama pelanggan yang muncul pada tampilan ini tidak disimpan ulang di dalam class Reservasi, melainkan diambil langsung dari objek Pelanggan yang tersimpan di dalam reservasi menggunakan method getNama yang diwarisi dari class Orang. Dengan cara ini, penerapan inheritance tidak hanya terasa pada menu pelanggan, tetapi juga dimanfaatkan oleh class lain yang berhubungan dengan class Pelanggan.

<img width="400" alt="WhatsApp Image 2026-09-21 at 20 41 27" src="https://github.com/user-attachments/assets/0b4fa832-424c-4c11-98d2-000287cc482b" />


**Ubah dan Hapus Reservasi**

Pada proses Ubah Reservasi, pengguna memasukkan ID reservasi yang ingin diubah, kemudian memasukkan tanggal yang baru. Data yang dapat diubah hanya tanggal, karena mengganti pelanggan atau layanan pada dasarnya berarti membuat pemesanan yang berbeda. Fitur ini digunakan ketika pelanggan ingin menjadwalkan ulang kedatangannya. Pada proses Hapus Reservasi, pengguna memasukkan ID reservasi yang ingin dihapus, misalnya ketika pemesanan dibatalkan. Penghapusan ini hanya menghapus data reservasinya saja, sedangkan data pelanggan dan data layanan yang terkait tetap tersimpan di dalam sistem.

### 4.5 Penanganan Kesalahan Masukan

Program telah dirancang agar tidak langsung berhenti ketika pengguna memasukkan pilihan yang keliru. Apabila pengguna memasukkan angka di luar pilihan yang tersedia, baik pada Menu Utama maupun pada sub menu, sistem akan menampilkan pesan "Pilihan tidak tersedia." dan kembali menampilkan Menu Utama. Begitu pula ketika pengguna memasukkan ID yang tidak terdaftar pada proses ubah maupun hapus, program tidak melakukan perubahan apa pun terhadap data dan hanya menampilkan pesan bahwa ID tersebut tidak ditemukan, sehingga data yang sudah tersimpan tetap aman.

### 4.6 Keluar Program

Apabila pengguna memilih angka 4 pada Menu Utama, sistem menampilkan pesan "Program selesai." Kondisi perulangan do-while menjadi tidak terpenuhi sehingga perulangan berhenti. Selanjutnya objek Scanner ditutup dan program selesai dijalankan.

<img width="400" alt="image" src="https://github.com/user-attachments/assets/6794660a-8fc9-4b4c-a44d-a7cbec530826" />


## 5. Kesimpulan

Program Sistem Manajemen Salon telah berhasil menerapkan konsep inheritance melalui relasi antara class Orang sebagai super-class dan class Pelanggan sebagai sub-class. Penerapan inheritance dilakukan menggunakan kata kunci extends untuk menurunkan class, serta kata kunci super untuk memanggil constructor milik class induk ketika objek turunan dibuat.

Dengan adanya inheritance, atribut dan method yang bersifat umum cukup dituliskan satu kali pada class Orang, lalu dapat digunakan kembali oleh class turunannya tanpa perlu ditulis ulang. Method warisan tersebut dimanfaatkan di banyak bagian program, mulai dari menu tambah, tampilkan, dan ubah pelanggan, hingga menu tambah dan tampilkan reservasi. Rancangan ini juga membuat program mudah dikembangkan, karena class baru seperti karyawan atau kapster dapat langsung mewarisi class Orang di kemudian hari.

Selain inheritance, program ini juga menerapkan konsep Pemrograman Berorientasi Objek lainnya, seperti pembuatan class sebagai cetak biru dan objek menggunakan kata kunci new, enkapsulasi melalui access modifier private beserta getter dan setter, penggunaan package untuk memisahkan class model dengan kelas utama, serta penggunaan ArrayList untuk menyimpan data secara dinamis. Berdasarkan hasil pengujian yang telah didokumentasikan, seluruh fitur pada menu Pelanggan, Layanan, dan Reservasi telah berjalan sesuai dengan yang diharapkan.

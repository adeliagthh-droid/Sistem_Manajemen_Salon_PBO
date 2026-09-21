/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author HP VICTUS
 */
import model.Pelanggan;
import model.Layanan;
import model.Reservasi;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistem_Manajemen_Salon_PBO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        ArrayList<Layanan> daftarLayanan = new ArrayList<>();
        ArrayList<Reservasi> daftarReservasi = new ArrayList<>();

      
        Pelanggan pelanggan1 = new Pelanggan(1, "Ciaaw", "081234567890");
        Pelanggan pelanggan2 = new Pelanggan(2, "Mrow", "081298765432");
        Pelanggan pelanggan3 = new Pelanggan(3, "Chantip", "081345678901");
        Pelanggan pelanggan4 = new Pelanggan(4, "Casey", "081387654321");
        Pelanggan pelanggan5 = new Pelanggan(5, "Keity", "081456789012");

        daftarPelanggan.add(pelanggan1);
        daftarPelanggan.add(pelanggan2);
        daftarPelanggan.add(pelanggan3);
        daftarPelanggan.add(pelanggan4);
        daftarPelanggan.add(pelanggan5);

        Layanan layanan1 = new Layanan(1, "Potong Rambut", 50000);
        Layanan layanan2 = new Layanan(2, "Creambath", 100000);
        Layanan layanan3 = new Layanan(3, "Facial", 150000);
        Layanan layanan4 = new Layanan(4, "Manicure Pedicure", 120000);
        Layanan layanan5 = new Layanan(5, "Smoothing Rambut", 350000);

        daftarLayanan.add(layanan1);
        daftarLayanan.add(layanan2);
        daftarLayanan.add(layanan3);
        daftarLayanan.add(layanan4);
        daftarLayanan.add(layanan5);

        Reservasi reservasi1 = new Reservasi(1, pelanggan1, layanan1, 1092026);
        Reservasi reservasi2 = new Reservasi(2, pelanggan2, layanan2, 2092026);
        Reservasi reservasi3 = new Reservasi(3, pelanggan3, layanan3, 3092026);
        Reservasi reservasi4 = new Reservasi(4, pelanggan4, layanan4, 4092026);
        Reservasi reservasi5 = new Reservasi(5, pelanggan5, layanan5, 5092026);

        daftarReservasi.add(reservasi1);
        daftarReservasi.add(reservasi2);
        daftarReservasi.add(reservasi3);
        daftarReservasi.add(reservasi4);
        daftarReservasi.add(reservasi5);
        
        
        //AKHIR DATA AWAL 

        int pilihan;

        do {
            System.out.println("SISTEM MANAJEMEN SALON");
            System.out.println("1. Kelola Pelanggan");
            System.out.println("2. Kelola Layanan");
            System.out.println("3. Kelola Reservasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                // MENU PELANGGAN 
                case 1:
                    System.out.println("MENU PELANGGAN");
                    System.out.println("1. Tambah Pelanggan");
                    System.out.println("2. Tampilkan Pelanggan");
                    System.out.println("3. Ubah Pelanggan");
                    System.out.println("4. Hapus Pelanggan");
                    System.out.print("Pilih: ");
                    int menuPelanggan = input.nextInt();

                    switch (menuPelanggan) {

                        case 1:
                            System.out.print("ID Pelanggan: ");
                            int idPelanggan = input.nextInt();

                            System.out.print("Nama Pelanggan: ");
                            String namaPelanggan = input.next();

                            System.out.print("No Telepon: ");
                            String noTelepon = input.next();

                            Pelanggan pelanggan = new Pelanggan(
                                    idPelanggan,
                                    namaPelanggan,
                                    noTelepon
                            );

                            daftarPelanggan.add(pelanggan);

                            System.out.println("yeayy Data Pelanggan sudah di tambahkan!");
                            break;

                        case 2:
                            System.out.println("DAFTAR PELANGGAN");

                            for (int i = 0; i < daftarPelanggan.size(); i++) {
                                Pelanggan p = daftarPelanggan.get(i);

                                System.out.println("ID: " + p.getIdPelanggan());
                                System.out.println("Nama: " + p.getNama());
                                System.out.println("No Telepon: " + p.getNoTelepon());
                                System.out.println("--------------------");
                            }
                            break;

                        case 3:
                            System.out.print("Masukkan ID Pelanggan yang ingin diubah: ");
                            int idUbahPelanggan = input.nextInt();
                            boolean ditemukanPelangganUbah = false;

                            for (int i = 0; i < daftarPelanggan.size(); i++) {
                                Pelanggan p = daftarPelanggan.get(i);

                                if (p.getIdPelanggan() == idUbahPelanggan) {

                                    System.out.print("Nama baru: ");
                                    String namaBaru = input.next();

                                    System.out.print("No Telepon baru: ");
                                    String teleponBaru = input.next();

                                    p.setNama(namaBaru);
                                    p.setNoTelepon(teleponBaru);

                                    System.out.println("yeayy Data Pelanggan sudah berhasil diubah!");
                                    ditemukanPelangganUbah = true;
                                    break;
                                }
                            }

                            if (!ditemukanPelangganUbah) {
                                System.out.println("ID Pelanggan tidak ditemukan.");
                            }
                            break;

                        case 4:
                            System.out.print("Masukkan ID Pelanggan yang ingin dihapus: ");
                            int idHapusPelanggan = input.nextInt();
                            boolean ditemukanPelangganHapus = false;

                            for (int i = 0; i < daftarPelanggan.size(); i++) {
                                Pelanggan p = daftarPelanggan.get(i);

                                if (p.getIdPelanggan() == idHapusPelanggan) {
                                    daftarPelanggan.remove(i);

                                    System.out.println("yeayy Data Pelanggan sudah berhasil dihapus!");
                                    ditemukanPelangganHapus = true;
                                    break;
                                }
                            }

                            if (!ditemukanPelangganHapus) {
                                System.out.println("ID Pelanggan tidak ditemukan.");
                            }
                            break;

                        default:
                            System.out.println("Pilihan tidak tersedia.");
                    }
                    break;

                // MENU LAYANAN 
                case 2:
                    System.out.println("MENU LAYANAN");
                    System.out.println("1. Tambah Layanan");
                    System.out.println("2. Tampilkan Layanan");
                    System.out.println("3. Ubah Layanan");
                    System.out.println("4. Hapus Layanan");
                    System.out.print("Pilih: ");
                    int menuLayanan = input.nextInt();

                    switch (menuLayanan) {

                        case 1:
                            System.out.print("ID Layanan: ");
                            int idLayanan = input.nextInt();

                            System.out.print("Nama Layanan: ");
                            String namaLayanan = input.next();

                            System.out.print("Harga: ");
                            double hargaLayanan = input.nextDouble();

                            Layanan layanan = new Layanan(
                                    idLayanan,
                                    namaLayanan,
                                    hargaLayanan
                            );

                            daftarLayanan.add(layanan);

                            System.out.println("Data layanan berhasil ditambahkan.");
                            break;

                        case 2:
                            System.out.println("DAFTAR LAYANAN");

                            for (int i = 0; i < daftarLayanan.size(); i++) {
                                Layanan l = daftarLayanan.get(i);

                                System.out.println("ID: " + l.getIdLayanan());
                                System.out.println("Nama Layanan: " + l.getNamaLayanan());
                                System.out.println("Harga: " + l.getHarga());
                                System.out.println("--------------------");
                            }
                            break;

                        case 3:
                            System.out.print("Masukkan ID Layanan yang ingin diubah: ");
                            int idUbahLayanan = input.nextInt();
                            boolean ditemukanLayananUbah = false;

                            for (int i = 0; i < daftarLayanan.size(); i++) {
                                Layanan l = daftarLayanan.get(i);

                                if (l.getIdLayanan() == idUbahLayanan) {

                                    System.out.print("Nama Layanan baru: ");
                                    String namaLayananBaru = input.next();

                                    System.out.print("Harga baru: ");
                                    double hargaBaru = input.nextDouble();

                                    l.setNamaLayanan(namaLayananBaru);
                                    l.setHarga(hargaBaru);

                                    System.out.println("yeayy Data layanan sudah berhasil diubah!");
                                    ditemukanLayananUbah = true;
                                    break;
                                }
                            }

                            if (!ditemukanLayananUbah) {
                                System.out.println("ID Layanan tidak ditemukan.");
                            }
                            break;

                        case 4:
                            System.out.print("Masukkan ID Layanan yang ingin dihapus: ");
                            int idHapusLayanan = input.nextInt();
                            boolean ditemukanLayananHapus = false;

                            for (int i = 0; i < daftarLayanan.size(); i++) {
                                Layanan l = daftarLayanan.get(i);

                                if (l.getIdLayanan() == idHapusLayanan) {
                                    daftarLayanan.remove(i);

                                    System.out.println("yeayy Data layanan sudah berhasil dhapus!");
                                    ditemukanLayananHapus = true;
                                    break;
                                }
                            }

                            if (!ditemukanLayananHapus) {
                                System.out.println("ID Layanan tidak ditemukan.");
                            }
                            break;

                        default:
                            System.out.println("Pilihan tidak tersedia.");
                    }
                    break;

                // MENU RESERVASI
                case 3:
                    System.out.println("MENU RESERVASI");
                    System.out.println("1. Tambah Reservasi");
                    System.out.println("2. Tampilkan Reservasi");
                    System.out.println("3. Ubah Reservasi");
                    System.out.println("4. Hapus Reservasi");
                    System.out.print("Pilih: ");
                    int menuReservasi = input.nextInt();

                    switch (menuReservasi) {

                        case 1:
                            if (daftarPelanggan.isEmpty() || daftarLayanan.isEmpty()) {
                                System.out.println("Data pelanggan/layanan masih kosong, tambahin dulu!");
                                break;
                            }

                            System.out.print("ID Reservasi: ");
                            int idReservasi = input.nextInt();

                            System.out.println("DAFTAR PELANGGAN");
                            for (int i = 0; i < daftarPelanggan.size(); i++) {
                                Pelanggan p = daftarPelanggan.get(i);
                                System.out.println("ID: " + p.getIdPelanggan() + " - " + p.getNama());
                            }
                            System.out.print("Masukkan ID Pelanggan: ");
                            int idPelangganReservasi = input.nextInt();

                            boolean ditemukanPelangganReservasi = false;
                            int indexPelangganDipilih = 0;
                            for (int i = 0; i < daftarPelanggan.size(); i++) {
                                if (daftarPelanggan.get(i).getIdPelanggan() == idPelangganReservasi) {
                                    indexPelangganDipilih = i;
                                    ditemukanPelangganReservasi = true;
                                    break;
                                }
                            }

                            System.out.println("DAFTAR LAYANAN");
                            for (int i = 0; i < daftarLayanan.size(); i++) {
                                Layanan l = daftarLayanan.get(i);
                                System.out.println("ID: " + l.getIdLayanan() + " - " + l.getNamaLayanan());
                            }
                            System.out.print("Masukkan ID Layanan: ");
                            int idLayananReservasi = input.nextInt();

                            boolean ditemukanLayananReservasi = false;
                            int indexLayananDipilih = 0;
                            for (int i = 0; i < daftarLayanan.size(); i++) {
                                if (daftarLayanan.get(i).getIdLayanan() == idLayananReservasi) {
                                    indexLayananDipilih = i;
                                    ditemukanLayananReservasi = true;
                                    break;
                                }
                            }

                            if (!ditemukanPelangganReservasi || !ditemukanLayananReservasi) {
                                System.out.println("ID Pelanggan/Layanan tidak ditemukan. Reservasi dibatalkan.");
                                break;
                            }

                            System.out.print("Tanggal (contoh 8092026): ");
                            int tanggalReservasi = input.nextInt();

                            Reservasi reservasi = new Reservasi(
                                    idReservasi,
                                    daftarPelanggan.get(indexPelangganDipilih),
                                    daftarLayanan.get(indexLayananDipilih),
                                    tanggalReservasi
                            );

                            daftarReservasi.add(reservasi);

                            System.out.println("yeayy Data Reservasi sudah ditambahkan!");
                            break;

                        case 2:
                            System.out.println("DAFTAR RESERVASI");

                            for (int i = 0; i < daftarReservasi.size(); i++) {
                                Reservasi r = daftarReservasi.get(i);

                                System.out.println("ID: " + r.getIdReservasi());
                                System.out.println("Nama Pelanggan: " + r.getNamaPelanggan());
                                System.out.println("Layanan: " + r.getNamaLayanan());
                                System.out.println("Tanggal: " + r.getTanggal());
                                System.out.println("--------------------");
                            }
                            break;

                        case 3:
                            System.out.print("Masukkan ID Reservasi yang ingin diubah: ");
                            int idUbahReservasi = input.nextInt();
                            boolean ditemukanReservasiUbah = false;

                            for (int i = 0; i < daftarReservasi.size(); i++) {
                                Reservasi r = daftarReservasi.get(i);

                                if (r.getIdReservasi() == idUbahReservasi) {

                                    System.out.print("Tanggal baru: ");
                                    int tanggalBaru = input.nextInt();

                                    r.setTanggal(tanggalBaru);

                                    System.out.println("yeayy Data Reservasi sudah diubah!");
                                    ditemukanReservasiUbah = true;
                                    break;
                                }
                            }

                            if (!ditemukanReservasiUbah) {
                                System.out.println("ID Reservasi tidak ditemukan.");
                            }
                            break;

                        case 4:
                            System.out.print("Masukkan ID Reservasi yang ingin dihapus: ");
                            int idHapusReservasi = input.nextInt();
                            boolean ditemukanReservasiHapus = false;

                            for (int i = 0; i < daftarReservasi.size(); i++) {
                                Reservasi r = daftarReservasi.get(i);

                                if (r.getIdReservasi() == idHapusReservasi) {
                                    daftarReservasi.remove(i);

                                    System.out.println("yeayy Data Reservasi sudah dihapus!");
                                    ditemukanReservasiHapus = true;
                                    break;
                                }
                            }

                            if (!ditemukanReservasiHapus) {
                                System.out.println("ID Reservasi tidak ditemukan.");
                            }
                            break;

                        default:
                            System.out.println("Pilihan tidak tersedia.");
                    }
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
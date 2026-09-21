/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP VICTUS
 */
package model;

public class Reservasi {

    private int idReservasi;
    private Pelanggan pelanggan;
    private Layanan layanan;
    private int tanggal;

    public Reservasi(int idReservasi, Pelanggan pelanggan, Layanan layanan, int tanggal) {
        this.idReservasi = idReservasi;
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.tanggal = tanggal;
    }

    public int getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(int idReservasi) {
        this.idReservasi = idReservasi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Layanan getLayanan() {
        return layanan;
    }

    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }

    public String getNamaPelanggan() {
        return pelanggan.getNama();
    }

    public String getNamaLayanan() {
        return layanan.getNamaLayanan();
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
}
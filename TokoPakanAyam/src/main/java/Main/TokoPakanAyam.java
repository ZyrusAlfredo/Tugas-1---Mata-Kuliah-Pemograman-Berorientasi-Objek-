/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;
import Controller.ManajemenGaji;
import Model.KaryawanKontrak;
import Model.KaryawanParuhWaktu;
/**
 *
 * @author Zyrus
 */
public class TokoPakanAyam {
    public static void main(String[] args) {
        ManajemenGaji manajemen = new ManajemenGaji();

        // UMR (Untuk Karyawan Kontrak)
        int UMR = 4000000;

        // Karyawan Kontrak
        manajemen.tambahKaryawan(new KaryawanKontrak("Andi", "K001", "Malang", UMR, 500000));
        manajemen.tambahKaryawan(new KaryawanKontrak("Budi", "K002", "Batu", UMR, 250000));

        // Karyawan Paruh Waktu
        manajemen.tambahKaryawan(new KaryawanParuhWaktu("Dina", "P001", "Malang", 100, 25000));
        manajemen.tambahKaryawan(new KaryawanParuhWaktu("Eko", "P002", "Batu", 80, 25000));
        manajemen.tambahKaryawan(new KaryawanParuhWaktu("Fani", "P003", "Kepanjen", 90, 20000));

        // Tampilkan semua data gaji
        manajemen.tampilkanTotalGaji();
    }
}
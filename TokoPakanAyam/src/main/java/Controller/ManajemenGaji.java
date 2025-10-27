/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Karyawan;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Zyrus
 */
public class ManajemenGaji {
    private List<Karyawan> daftarKaryawan = new ArrayList<>();

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public void tampilkanTotalGaji() {
        System.out.println("===== DAFTAR GAJI KARYAWAN TOKO PAKAN AYAM =====");
        for (Karyawan k : daftarKaryawan) {
            String tipe = k.getClass().getSimpleName();
            System.out.println("Nama       : " + k.getNama());
            System.out.println("NIP        : " + k.getNip());
            System.out.println("Alamat     : " + k.getAlamat());
            System.out.println("Tipe       : " + tipe);
            System.out.println("Total Gaji : Rp " + k.hitungGaji());
            System.out.println("-----------------------------------------------");
        }
    }
}
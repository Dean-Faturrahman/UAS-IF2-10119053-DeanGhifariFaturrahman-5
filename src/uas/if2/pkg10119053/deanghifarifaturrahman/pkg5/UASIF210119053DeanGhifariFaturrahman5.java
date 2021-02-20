/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119053.deanghifarifaturrahman.pkg5;

/**
 *
 * @author Dean
 * UAS PBO
 * NIM     : 10119053
 * NAMA    : Dean Ghifari Faturrahman
 * Kelas   : IF - 2
 * NO Soal : 5
 */
public class UASIF210119053DeanGhifariFaturrahman5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ModelMahasiswa model = new ModelMahasiswa("10119053","Dean Ghifari Faturrahman");
        System.out.println("Nim Mahasiswa : " + model.getNim());
        System.out.println("Nama Mahasiswa : " + model.getNama());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author PC BAY
 */
public class Action {
    public static void main(String[] args){
        String nama = "Bayu Sapto H";
        String nim = "A12.2021.06617";
        int umur = 19;
        String asalsekolah = "SMK Indomaret";
        MahasiswaBaru mhs = new MahasiswaBaru(nama, nim, umur, asalsekolah);
        
        mhs.cetakbaru();
    }
}

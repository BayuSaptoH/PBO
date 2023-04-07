/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author PC BAY
 */
public class MahasiswaBaru extends Mahasiswa {
    private String asalsekolah;
    
    public MahasiswaBaru(String nama, String nim, int umur, String asalsekolah)
    {
        super(nama, nim, umur);
        this.asalsekolah = asalsekolah;
    }
    
    public String getAsalSekolah()
    {
        return asalsekolah;
    }

    public void setAsalSekolah(String asalsekolah)
    {
        this.asalsekolah = asalsekolah;
    }
    
    public void cetakbaru()
    {
        System.out.println("Nama           : "+super.getNama());
        System.out.println("NIM            : "+super.getNim());
        System.out.println("Umur           : "+super.getUmur());
        System.out.println("Asal Sekolah   : "+asalsekolah);
    }
}

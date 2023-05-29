/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskWeek9;

/**
 *
 * @author PC BAY
 */
import java.lang.Math;

public class Cellphone implements Phone{
    String merk;
    String type;
    int batteryLevel;
    int status;
    int volume;
    int pulsa;

    public Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
    }
    
    public int getStatus() {
        return status;
    }

    @Override
    public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    @Override
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
    }

    @Override
    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    @Override
    public void volumeDown(){
        this.volume--;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public void topupPulsa(int jumlah) {
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat melakukan topup Pulsa");
        }
        else
        {
            pulsa += jumlah;
            System.out.println("Topup Pulsa sebesar : " +jumlah +" sukses. Sisa pulsa anda sebesar " +pulsa);
        }
    }

    @Override
    public int cekPulsa() {
       if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat mengecek sisa pulsa");
            return 0;
       } 
       else
       {
           System.out.println("Sisa Pulsa anda sebesar : "+pulsa);
           return pulsa;
       }
    }
}

class Contact {
    String nama;
    String nomor;

    public Contact(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
    }

    String getNama()
    {
        return this.nama;
    }

    String getNomor()
    {
        return this.nomor;
    }

}

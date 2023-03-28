/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC BAY
 */
import java.util.Scanner;
public class Latihan04d {
    public String nama, nopel;
    public int pair, bPakai;
    
    Scanner inp = new Scanner(System.in);
    
    void setNamapel(){
        System.out.print("Nama          : ");
        nama = inp.nextLine();
    }
    
    void setNopel(){
        System.out.print("No Pelanggan  : ");
        nopel = inp.nextLine();
    }
    
    void setPair(){
        System.out.print("Pemakaian Air : ");
        pair = inp.nextInt();
    }
    
    void setBPakai() {
        int x=pair/10;
        if(x==0){
            bPakai = pair*1000; 
        }else if(x==1) {
            bPakai = 10*1000;
            bPakai+=(pair-10)*2000;
        }else {
            bPakai = 10*1000;
            bPakai+=10*2000;
            bPakai+=(pair-20)*5000;
        }
        System.out.println("Biaya Pakai   : " +bPakai);
    }
}

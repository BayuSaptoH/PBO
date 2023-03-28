/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC BAY
 */
import java.util.Scanner;
public class Latihan04c {
    public String nama, prodi;
    public int nilai1; 
    char nilai2;
    
    Scanner inp = new Scanner(System.in);
    
    void setNama(){
        System.out.print("Nama          : ");
        nama = inp.nextLine();
    }
    
    void setProdi(){
        System.out.print("Program Studi : ");
        prodi = inp.nextLine();
    }
    
    void setNilai1(){
        System.out.print("Nilai         : ");
        nilai1 = inp.nextInt();
    }
    
    void setNilai2(){
        if (nilai1 >= 85 && nilai1 <=100){
            nilai2 = 'A';
        }
        else if (nilai1 > 70 && nilai1 < 85){
            nilai2 = 'B';
        }
        else if (nilai1 > 60 && nilai1 < 70){
            nilai2 = 'C';
        }
        else if (nilai1 > 50 && nilai1 < 60){
            nilai2 = 'D';
        }
        else {
            nilai2 = 'E';
        }
        System.out.println("Nilai Huruf   : " +nilai2);
    }
}

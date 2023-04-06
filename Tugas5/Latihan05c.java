/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC BAY
 */
public class Latihan05c {
    void methodTambah(int a,int b)
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    
    void methodKurang(int a,int b)
    {
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    
    void methodKali(int a,int b)
    {
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    
    void methodBagi(int a,int b)
    {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
    
    public static void main(String args[])
    {
        Latihan05c objHitung = new Latihan05c();
        
        objHitung.methodTambah(10, 50);
        objHitung.methodKurang(10, 50);
        objHitung.methodKali(10, 50);
        objHitung.methodBagi(10, 50);
    }
}

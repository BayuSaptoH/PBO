/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskWeek9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC BAY
 */
public class CellphoneMain {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<Contact> contacts = new ArrayList<>();
    
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Samsung", "A12");
        
        cp.powerOn();
        cp.volumeUp();
        cp.volumeDown();
        cp.topupPulsa(50000);
        cp.cekPulsa();
        
//        cp.powerOff();
        
        if(cp.status == 1) {
            addContact();
            listContact();
            searchContact();
        }else{
            System.out.println("Ponsel mati. Tidak dapat menambah Kontak");
            System.out.println("Ponsel mati. Tidak dapat melihat Kontak");
            System.out.println("Ponsel mati. Tidak dapat mencari Kontak");
        }
    }
    
     static void addContact() {
        while(true) {
            System.out.println("Tambahkan Kontak");
            System.out.println("================");
            System.out.print("Nama  : ");
            String name = input.next();
            System.out.print("Nomor : ");
            String nomor = input.next();
            Contact contact = new Contact(name, nomor);

            contacts.add(contact);

            System.out.print("\nInput Contact Again? (y/t) : ");
            String choice = input.next();

            if(choice.equals("y")){
                continue;
            } else if(choice.equals("t")){
                break;
            }
        }
    }

    static void listContact() {
        System.out.println("\nDaftar Contact");
        for(int i=0; i<contacts.size(); i++){
            System.out.println("Nama  : "+contacts.get(i).getNama());
            System.out.println("Nomor : "+contacts.get(i).getNomor());
            System.out.println("============");
        }
    }
    
    static void searchContact(){
        System.out.print("\nCari Kontak : ");
        String n = input.next();
        int ok = 0;
        
        for(int i=0; i<contacts.size(); i++){
            if(n.equals(contacts.get(i).nama)){
                System.out.println("Kontak Ditemukan!");
                System.out.println("Nama   : "+contacts.get(i).getNama());
                System.out.println("Kontak : "+contacts.get(i).getNomor());
                ok=1;
            }
        }
        if(ok==0){
             System.out.println("Kontak Tidak Ditemukan!");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KOPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> kopi   = new ArrayList<String>();
        ArrayList<String> topping= new ArrayList<String>();
    
        MesinKopi Tubruk = new MesinKopi();
        Tubruk.setJenisKopi("Tubruk");
        Tubruk.setJumlahStokKopi(40);
        kopi.add(Tubruk.getJenisKopi());
        Tubruk.setTopping("Coklat");
        topping.add(Tubruk.getTopping());
        
        MesinKopi arabica = new MesinKopi();
        arabica.setJenisKopi("arabica");
        arabica.setJumlahStokKopi(40);
        kopi.add(arabica.getJenisKopi());
        arabica.setTopping("Susu");
        topping.add(arabica.getTopping());

        MesinKopi Expresso = new MesinKopi();
        Expresso.setJenisKopi("Expresso");
        Expresso.setJumlahStokKopi(40);
        kopi.add(Expresso.getJenisKopi());
        Expresso.setTopping("Caramel");
        topping.add(Expresso.getTopping());
        
	for(int a=0; a< kopi.size();a++){
            int b= a+1;
            System.out.println("Menu kopi adalah "+b+" "+kopi.get(a));
        }

        for(int a=0; a< topping.size();a++){
            int b= a+1;
            System.out.println("Menu Topping adalah "+b+" "+topping.get(a));
        }

        System.out.println("\n==PILIH PESANAN KOPI==");
        System.out.print("Pilih Menu Kopi       : ");
        int Kopi = input.nextInt() -1;
        System.out.print("Pilih Topping Kopi    : ");
        int Topping = input.nextInt() -1;
        
        System.out.println("\nPesanan yang anda pesan adalah Kopi   : " + kopi.get(Kopi)); 
        System.out.println("Dengan Pilihan Topping                  : " + topping.get(Topping));
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author ASUS
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====KALKULATOR SEDERHANA===="); 
        System.out.println("============================"); 
        kalkulator kl = new kalkulator();
        System.out.println("\nHasil Penjumlahan   = "+kl.penjumlahan()); 
        System.out.println("Hasil Pengurangan   = "+kl.pengurangan()); 
        System.out.println("Hasil Perkalian     = "+kl.perkalian()); 
        System.out.println("Hasil Pembagian     = "+kl.pembagian()); 
    }
    
}

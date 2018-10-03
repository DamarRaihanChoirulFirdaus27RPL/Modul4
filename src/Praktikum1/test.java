/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("USER 1");
    manusia lk = new lakiLaki(175);
    System.out.println("Tinggi Badan Laki-Laki adalah "+lk.TB());
    System.out.println("Berat Badan Ideal dengan Tinggi "+lk.TB()+" adalah "+lk.htgbbi());
    System.out.println("\n");
    
    System.out.println("USER 2");
    manusia pr = new perempuan(165);
    System.out.println("Tinggi Badan Perempuan adalah "+pr.TB());
    System.out.println("Berat Badan Ideal dengan Tinggi "+pr.TB()+" adalah "+pr.htgbbi());
    System.out.println("\n");
    }
    
}

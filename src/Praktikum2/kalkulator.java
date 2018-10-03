/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class kalkulator implements operasi{
    private double bil1,bil2;
    Scanner scan = new Scanner(System.in);
    public kalkulator(){
        System.out.print("Masukkan Bilangan Pertama : "); bil1 = scan.nextDouble();
        System.out.print("Masukkan Bilangan Pertama : "); bil2 = scan.nextDouble();
    }

    @Override
    public double penjumlahan() {
        return bil1+bil2;
    }

    @Override
    public double pengurangan() {
        return bil1-bil2;
    }

    @Override
    public double perkalian() {
        return bil1*bil2;
    }

    @Override
    public double pembagian() {
        return bil1/bil2;
    }
}

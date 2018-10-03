/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author ASUS
 */
public class Abstractsample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bangunDatar o1 = new bujurSangkar(10);
        
        System.out.println("Luas bujur sangkar dengan sisi 10 = "+o1.hitungluas());
        System.out.println("Kelilingnya = "+o1.hitunkeliling());
        System.out.println("\n");
        
        bangunDatar o2 = new Lingkaran(7);
        System.out.println("Luas Lingkaran dengan jari-jari 7 = "+o2.hitungluas());
        System.out.println("Kelilingnya = "+o2.hitunkeliling());
        System.out.println("\n");
    }
    
}

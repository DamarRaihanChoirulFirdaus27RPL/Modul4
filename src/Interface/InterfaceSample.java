/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class InterfaceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceBujurSangkar o1 = new InterfaceBujurSangkar(10){};
        System.out.println("Luas Bujur Sangkar dengan sisi 10 = "+o1.hitungluas());
        System.out.println("kelilingnya = "+o1.hitungkeliling());
        System.out.println("\n");
        
        InterfaceBangunDatar o2 = new InterfaceSegitiga(6,8){};
        System.out.println("Luas segitiga dengan alas 6, dan tinggi 8 = "+o2.hitungluas());
        System.out.println("Kelilingnya = "+o2.hitungkeliling());
    }
}

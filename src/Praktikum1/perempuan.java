/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author ASUS
 */
public final class perempuan extends manusia {
    private double tB;
    public perempuan(double tB){
        this.tB = tB;
    }

    @Override
    public double TB() {
       return tB;
    }

    @Override
    public double htgbbi() {
       double a = tB-113;
       return a;
}
}

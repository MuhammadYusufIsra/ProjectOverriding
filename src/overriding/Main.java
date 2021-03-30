/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author Yusuf Isra
 */
public class Main {

    public static void main(String[] args) {
        Kamera machine1 = new Kamera();
        Alat machine2 = new Alat();
        machine2.mulai();
        machine1.mulai();
        machine1.Cekrek();
        machine1.selesai();
    }
}

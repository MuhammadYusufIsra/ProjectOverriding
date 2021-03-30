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
public class Kamera extends Alat {

    
    @Override
    public void mulai() {
        super.mulai();
        System.out.println("\nProgram kamera dimulai");
    }

    public void Cekrek() {
        System.out.println("\nCekrek.. (Pengambilan foto)");
    }
}

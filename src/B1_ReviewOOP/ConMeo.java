/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

/**
 *
 * @author hangnt
 */
public class ConMeo extends DongVat {

    private String tiengKeu;

    public ConMeo() {
    }

    public ConMeo(String tiengKeu, String maDV, double canNang, String ten) {
        super(maDV, canNang, ten);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public void display() {
        System.out.println(this.tiengKeu + " - " + super.getMaDV()+ " - " 
                + super.getTen() + " - " + super.getCanNang());
    }
}

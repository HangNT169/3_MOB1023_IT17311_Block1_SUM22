/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String maDV;
    private double canNang;
    private String ten;

    // contructor : khoi tao 1 doi tuong
    /**
     * Co 2 loai contructor: co tham so va khong tham so Mac dinh: contructor
     * khong tham so
     * Nhan biet contructor: ten contructor trung vs ten class 
     * khong co kieu du lieu tra ve
     * 
     */
    public DongVat() {
    }

    public DongVat(String maDV, double canNang, String ten) {
        this.maDV = maDV;
        this.canNang = canNang;
        this.ten = ten;
    }

    /**
     * Getter: lay gia tri cua thuoc tinh
     * Setter: thay doi gia tri cua thuoc tinh
     */
    public String getMaDV() {
        return maDV;
    }

    public double getCanNang() {
        return canNang;
    }

    public String getTen() {
        return ten;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}

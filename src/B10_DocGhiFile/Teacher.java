/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_DocGhiFile;

import java.io.Serializable;

/**
 *
 * @author hangnt
 */
public class Teacher implements Serializable {
// muc dich khi implement tu Serializable
// dung de thuoc tinh khi ghi vao file khong bi lon xon. 
//Va se giu dung duoc thu tu

    private String ten;
    private int tuoi;
    private String namSinh;
    private String truongDayHoc;
    private String diaChi;

    public Teacher() {
    }

    public Teacher(String ten, int tuoi, String namSinh, String truongDayHoc, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.truongDayHoc = truongDayHoc;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getTruongDayHoc() {
        return truongDayHoc;
    }

    public void setTruongDayHoc(String truongDayHoc) {
        this.truongDayHoc = truongDayHoc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ten=" + ten + ", tuoi=" + tuoi + ", namSinh=" + namSinh + ", truongDayHoc=" + truongDayHoc + ", diaChi=" + diaChi + '}';
    }

}

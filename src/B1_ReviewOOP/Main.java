/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Bai tap: Tao 1 class DongVat gom cac thuoc tinh
     * maDV-String,canNang-double,ten-String va cac phuong thuc contructor,
     * getter, setter Tao 1 class ConMeo ke thua tu class DongVat va them thuoc
     * tinh tiengKeu-String va cac phuong thuc contructor, getter, setter,
     * display():void Nhap thong tin cua 1 doi tuong con meo va in ra man hinh.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap maDV:");
        String maDV = scanner.nextLine();
        System.out.print("Nhap can nang:");
        double canNang= Double.valueOf(scanner.nextLine());
//        double canNang1 = Double.parseDouble(scanner.nextLine());
//        scanner.nextLine();
        System.out.print("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Nhap tieng keu:");
        String tiengKeu = scanner.nextLine();
//        ConMeo conMeo = new ConMeo();
//        conMeo.setCanNang(canNang);
//        conMeo.setMaDV(maDV);
//        conMeo.setTen(ten);
//        conMeo.setTiengKeu(tiengKeu);
        ConMeo conMeo = new ConMeo(tiengKeu, maDV, canNang, ten);
        conMeo.display();
    }
}

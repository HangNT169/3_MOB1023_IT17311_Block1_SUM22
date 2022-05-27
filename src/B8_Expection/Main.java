/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_Expection;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        // https://openplanning.net/10175/java-regular-expression
//        https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%208/1.%20Lamda%20Expressions/3.%20So%20s%C3%A1nh%20m%E1%BA%A1nh%20m%E1%BA%BD%20v%E1%BB%9Bi%20Lambda.md
        Scanner sc = new Scanner(System.in);
        try {
            // vut dong nghi ngo khi xay ra loi
            int number = sc.nextInt();
        } catch (InputMismatchException e) {
            // hien thi khi loi xay ra
            System.out.println("Nhap sai kieu du lieu ");
        }

        try {
            // dong code nghi ngo xay ra loi 
            int a[] = {4, -2, 3, 0};
            System.out.println(a[10]);
//            System.out.println(a[2]);
        } catch (Exception e) {
            // bat loi
            System.out.println("Vuot qua so phan tu cua mang");
        } finally {
            // du thanh cong hay khong thanh cong => Luon luon chay trong finally
            System.out.println("Cuoi cung roi ");
        }
        // Custom expection
        try {
//            System.out.println("Hien thi1");
            throw new MyExpection("Loi");
        } catch (MyExpection e) {
            System.out.println(e.getMessage());
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOP_Tiep;

/**
 *
 * @author hangnt
 */
public class ThucVat {

   public String hienThiString(){
       return "String 1";
   }
   
   public String hienThiString(String name){
       return "String 2";
   }
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi("a",10,"b");
        System.out.println(nguoi.toString());
    }
}

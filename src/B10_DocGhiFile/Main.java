/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Tao class Teacher gom cac thuoc tinh: ten, tuoi,namSinh, diaChi,
     * truongDayHoc. Va cac contrutor, getter, setter. Ghi 5 doi tuong Teacher
     * vao file. Xuat file ra
     */
    public void ghiFileObjectOutputStream() throws FileNotFoundException, IOException {
        // B1: Check su ton tai cua file
        File file = new File("test.txt");
        if (file.exists() == false) {
            try {
                // create
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace(System.out);
            }
        }

        // B2: Tao 5 doi tuong
        List<Teacher> lists = new ArrayList<>();
        lists.add(new Teacher("ten1", 10, "2003", "FPT POly", "Ha Noi"));
        lists.add(new Teacher("ten2", 101, "2003", "FPT POly1", "Ha Noi"));
        lists.add(new Teacher("ten3", 102, "2003", "FPT POly2", "Ha Noi"));
        lists.add(new Teacher("ten4", 103, "2003", "FPT POly3", "Ha Noi"));
        lists.add(new Teacher("ten5", 104, "2003", "FPT POly4", "Ha Noi"));

        // B3: Ghi file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Teacher t : lists) {
            // viet vao file
            oos.writeObject(t);
        }

        // B4:Close
        oos.close();
        fos.close();
    }

    public void docFileObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {
        // B1: Check su ton tai cua file
        File file = new File("test.txt");
        if (file.exists() == false) {
            try {
                // create
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace(System.out);
            }
        }

        // B2: Doc file
        FileInputStream fis = new FileInputStream(file);// mo file ra
        ObjectInputStream ois = new ObjectInputStream(fis);// doc data o trong file day

        List<Teacher> listInput = new ArrayList<>();
        Teacher teacherIn = new Teacher();
        // Kiem tra neu con dong => doc tiep
        while (fis.available() > 0) {
            // doc tung dong
            teacherIn = (Teacher) ois.readObject();
            listInput.add(teacherIn);
        }
        
        // B3: In ra man hinh console
        for (Teacher t : listInput) {
            System.out.println(t.toString());
        }
        
        // B4:Close 
        ois.close();
        fis.close();
    }
    public static void main(String[] args) {
        try {
            new Main().docFileObjectInputStream();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

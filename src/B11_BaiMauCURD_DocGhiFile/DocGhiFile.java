/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_BaiMauCURD_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DocGhiFile {

    public String ghiFile(String path, List<SinhVien> lists) {
        try {
            // B1: Check su ton tai cua file
            File file = new File(path);
            if (file.exists() == false) {
                file.createNewFile();
            }
            // B3: Ghi file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (SinhVien t : lists) {
                // viet vao file
                oos.writeObject(t);
            }

            // B4:Close
            oos.close();
            fos.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            return "Ghi file that bai";
        }
    }

    public String docFile(String path, List<SinhVien> lists) {
        try {
            // B1: Check su ton tai cua file
            File file = new File(path);
            if (file.exists() == false) {
                return "File khong ton tai";
            }

            // B2: Doc file
            FileInputStream fis = new FileInputStream(file);// mo file ra
            ObjectInputStream ois = new ObjectInputStream(fis);// doc data o trong file day

            SinhVien sv = new SinhVien();
            // Kiem tra neu con dong => doc tiep
            while (fis.available() > 0) {
                // doc tung dong
                sv = (SinhVien) ois.readObject();
                lists.add(sv);
            }

            // B4:Close 
            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}

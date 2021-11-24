package PBO_Pertemuan09;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args){  
    
    JOptionPane.showMessageDialog(null, "Anda bisa melakukan Operasi Penjumlahan, Pengurangan, Perkalian dan "
            + "Pembagian antara 2 bilangan");
    
    String bilangan1 = JOptionPane.showInputDialog(null, "Masukkan Bilangan Pertama : ");
    String bilangan2 = JOptionPane.showInputDialog(null, "Masukkan Bilangan Kedua : ");
    
    int jumlah = Integer.parseInt(bilangan1)+ Integer.parseInt(bilangan2);
    int kurang = Integer.parseInt(bilangan1)- Integer.parseInt(bilangan2);
    int kali = Integer.parseInt(bilangan1)* Integer.parseInt(bilangan2);
    int bagi = Integer.parseInt(bilangan1)/ Integer.parseInt(bilangan2);
        
    JOptionPane.showMessageDialog(null, bilangan1 +" + "+ bilangan2 +" = "+ jumlah);
    JOptionPane.showMessageDialog(null, bilangan1 +" - "+ bilangan2 +" = "+ kurang);
    JOptionPane.showMessageDialog(null, bilangan1 +" x "+ bilangan2 +" = "+ kali);
    JOptionPane.showMessageDialog(null, bilangan1 +" / "+ bilangan2 +" = "+ bagi);
    
}
}

package PBO_Pertemuan09;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args){
    //Latihan 5 JOptinePane ( Pertemuan 09 )
    int inputButton = JOptionPane.showConfirmDialog(null, "Apakah anda menyukai Sate?","Makanan",JOptionPane.YES_NO_CANCEL_OPTION);
    System.out.println("Value" +inputButton);
    
    switch(inputButton){
        case JOptionPane.YES_OPTION:
             JOptionPane.showMessageDialog(null,"Saya menyukai Sate");
        break;
        case JOptionPane.NO_OPTION:
             JOptionPane.showMessageDialog(null, "Saya tidak menyukai Sate");
        break;
        case JOptionPane.CANCEL_OPTION:
             JOptionPane.showMessageDialog(null, "Tidak Memilih");
    }

}
}

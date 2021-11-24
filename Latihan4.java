package PBO_Pertemuan09;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Latihan4 {
    public static void main(String[] args){
    //Latihan 4 JOptinePane ( Pertemuan 09 )
    ImageIcon icon = new ImageIcon("E:/KULIAH/SEMESTER 3/PEMOGRAMAN WEB/PBO_Pertemuan 09/src/PBO_Pertemuan09/icon-feel.png");
    int input = JOptionPane.showConfirmDialog(null, "Are you happy right now?","Your Feelings Today",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon);
    System.out.println("Value : " +input);
}
}

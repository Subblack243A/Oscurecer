/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaPack;

import javax.swing.JOptionPane;

public class PixelColors {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(""), p = "";
        String[] col = new String[255];
        col = s.split(" ");
        int por = Integer.parseInt(JOptionPane.showInputDialog(""));
        for (int i = 0; i < 255; i++) {
            int t;
            if (col[i].equals("oscurecer")) {
                break;
            } else {
                if (col[i].equals("255")) {
                    t = 255;
                } else {
                    t = Integer.parseInt(col[i]) + (Integer.parseInt(col[i]) * por / 100);
                }
            }
            p += t + " ";
        }
        JOptionPane.showMessageDialog(null, p);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ei6speedrun;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import telas.TelaSpeedRun;

/**
 *
 * @author samuc
 */
public class EI6SpeedRun {

    public static void main(String[] args) {
             FlatMacDarkLaf.setup(); // import do flatlaf para estilo
             TelaSpeedRun tsr = new TelaSpeedRun();
             tsr.setVisible(true);
    }
}

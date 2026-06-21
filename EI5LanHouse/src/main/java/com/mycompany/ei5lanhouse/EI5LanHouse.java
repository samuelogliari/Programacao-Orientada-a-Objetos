/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ei5lanhouse;

import apoio.Entrada;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import telas.TelaCliente;

public class EI5LanHouse {

    public static void main(String[] args) {
   
       FlatMacDarkLaf.setup(); // import do flatlaf para estilo
       TelaCliente tc = new TelaCliente();
       tc.setVisible(true);
        
    }
}

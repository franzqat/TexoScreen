
import java.awt.GridLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class GridLayoutBar {
    
     private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jFrame1.setLayout(new GridLayout(0, 8));
        for (int i = 0; i < 8; i++) {
            jFrame1.add(new javax.swing.JLabel("Bla"));

        }
        jFrame1.pack();
        jFrame1.validate();
        jFrame1.repaint();
        jFrame1.setVisible(true);
    }                                      
    
}

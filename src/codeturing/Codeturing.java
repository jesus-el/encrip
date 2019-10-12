
package codeturing;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;


public class Codeturing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         maquina power=new maquina();
         power.setTitle("POWER SOLVERENCIP");
    power.setVisible(true);
    power.setLocationRelativeTo(null);
    ImageIcon icono = new ImageIcon("src/codeturing/imagen/23.png");
power.setIconImage(icono.getImage());

    String esta ="";
    esta="ggggggg"+power.mensa1.cantcolunas;
        System.err.println(""+esta);
    }

    private void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


package Image;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.PaintContext;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;


public class BackGround extends JDesktopPane{
    
   private Image img;
    
   public BackGround(String Image){
     this.img = new ImageIcon(Image).getImage();
   }
    public void PaintContext(Graphics G) {
        G.drawImage(img, 0, 0, getWidth(),getHeight(),this);
    }
}


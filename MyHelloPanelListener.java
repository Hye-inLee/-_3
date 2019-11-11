import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 여기에 MyHelloPenalListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloPanelListener extends KeyAdapter implements MouseListener 
{
    public JLabel label;
    public void mousePressed(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        label.setLocation(x,y);
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public MyHelloPanelListener()
    {
       label = new JLabel("HELLO");
       
    }
    public void keyPressed(KeyEvent e){
    int keyCode = e.getKeyCode();
    switch(KeyCode){
       case KeyEvent.VK_UP:
           label.setLocation(label.getX(), label.getY()-FLYING_UNIT); break;
       case KeyEvent.VK_DOWN:
       label.setLocation(label.getX(), label.getY()+FLYING_UNIT); break;
       case KeyEvent.VK_LEFT:
       label.setLocation(label.getX()-FLYING_UNIT, label.getY()); break;
       case KeyEvent.VK_RIGHT:
       label.setLocation(label.getX()+FLYING_UNIT, label.getY()); break;
    }
   }
    public void keyReleased(KeyEvent e){}
    public void KeyTyped(KeyEvent e){}
}

import javax.swing.*;
import java.awt.event.*;
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
}

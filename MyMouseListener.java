import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * 여기에 MyMouseListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyMouseListener extends MouseMotionAdapter 
                             implements MouseListener
{
    public JLabel ml;
    public JPanel JP;
    public MyMouseListener(JLabel ml, JPanel JP)
    {
        this.ml = ml;
        this.JP = JP;
    }
    public void mouseClicked(MouseEvent e){
    }
    public void mouseEntered(MouseEvent e)
    {
        //Component c = (Component)e.getSource();
        //c.setBackgroud(Color.BLUE);
        ml.setText("MouseEntered");
        JP.setBackground(Color.BLUE);
    }
    public void mouseExited(MouseEvent e)
    {
        //Component c = (Component)e.getSource();
        //c.setBackground(Color.PINK);
        JP.setBackground(Color.PINK);
    }
    public void mousePressed(MouseEvent e)
    {
        ml.setText("MousePressed(" + e.getX()+","+ e.getY()+")");
    }
    public void mouseReleased(MouseEvent e)
    {
        ml.setText("MouseReleased(" + e.getX()+","+ e.getY()+")");
    }
    public void mouseDragged(MouseEvent e)
    {
        ml.setText("MouseDragged(" + e.getX()+","+ e.getY()+")");
    }
    public void mouseMoved(MouseEvent e)
    {
        ml.setText("MouseMoved(" + e.getX()+","+ e.getY()+")");
    }
}

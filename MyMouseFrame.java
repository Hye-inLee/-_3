import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 여기에 MyMousePrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyMouseFrame extends JFrame
{   
    public JLabel ml;
    public JPanel JP;
    public MyMouseFrame()
    {
        ml = new JLabel("NO Mouse Event");
        this.setTitle("MouseListener & MouseMotionListener");
        this.setSize(400,300);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyMouseListener ML = new MyMouseListener(ml,JP);
        this.addMouseListener(ML);
        this.addMouseMotionListener(ML);

        JP = new JPanel();
        
        JP.add(ml);
        this.add(JP);
        this.setVisible(true);
    }
    
}

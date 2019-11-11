import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 여기에 MyHelloFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHelloFrame extends JFrame
{
    public Object mp;

    public MyHelloFrame()
    {
        
        this.setTitle("실습_3(2019.11.11)");
        this.setSize(300,400);
        
        mp = new MyHelloPanelListener();
        this.add((JPanel)mp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        this.setVisible(true);
    }
}

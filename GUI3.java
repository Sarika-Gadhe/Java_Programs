import javax.swing.*;

import javax.swing.JFrame;

public class GUI3
 {
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("Marvellous Infosystems");

        JButton bobj = new JButton("Sumbit");

        bobj.setBounds(100,100,150,50);

        fobj.add(bobj);

        fobj.setSize(400,300);
        fobj.setSize(400 ,300);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

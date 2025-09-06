import javax.swing.*;
import java.awt.event.*;


class MarvellousLogin extends JFrame
{
    public MarvellousLogin(String Title, int width,int Height)
    {
        setTitle("Marvellous Login");
        setSize(width,Height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

class LoginFormX
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Marvellous Login",400,300);
    }
}

import java.net.*;
import java.io.*;
import java.util.*;

public class AdditionClientXX
{
    public static void main(String A[]) throws Exception
    {


        Socket sobj = new Socket("localhost",2100);

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());           //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());   //mouth

        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int no1 = scanobj.nextInt();
        System.out.println("Enter 2nd number : ");
        int no2 = scanobj.nextInt();

        doobj.writeInt(no1);
        doobj.writeInt(no2);
        
        int ret = diobj.readInt();
        // System.out.println("Result received from server is : ",ret);
        
        System.out.println("End of client application");

    }
}

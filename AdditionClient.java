import java.net.*;
import java.io.*;
import java.util.*;

public class AdditionClient
{
    public static void main(String A[]) throws Exception
    {


        Socket sobj = new Socket("localhost",2100);

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());           //ear
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); 
        
        doobj.writeInt(11);

        int ret = diobj.readInt();
        System.out.println("Data from server is : "+ret);
        
        
        //mouth

    }
}

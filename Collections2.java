import java.util.*;

public class Collections2
{
    public static void main(String A[])
    {
        int Arr[] = {11,51,21,101,75,95};
        
        System.out.println("Data traversal using for - each");
        for(int no : Arr)
        {
            System.out.println(no);
        }

        Arrays.sort(Arr);                                      //sort method - static

        System.out.println("Data traversal using for - each after sorting");
        for(int no : Arr)
        {
            System.out.println(no);
        }

        int iRet = 0;

        iRet = Arrays.binarySearch(Arr,21);

        System.out.println("Return value of binary Search is : "+iRet);

         iRet = Arrays.binarySearch(Arr,121);

         if(iRet >= 0)
         {
            System.out.println("Element is present");
         }
         else
         {
            System.out.println("There is no such element");
         }

    }    

}

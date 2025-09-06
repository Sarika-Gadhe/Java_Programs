
class ArrayDemoLoop
{
    public static void main(String A[])
    {
      int i = 0;

      int Arr[] = {10,20,30,40};
     
      System.out.println("For Loop");
      for(i = 0; i< Arr.length; i++)
      {
        System.out.println(Arr[i]);
      }

      i = 0;
      System.out.println("while Loop");
      while(i < Arr.length)
      {
        System.out.println(Arr[i]);
        i++;
      }

      i = 0;
      System.out.println("do-While Loop");
      do
      {
        System.out.println(Arr[i]);
        i++;
      }  while(i < Arr.length);

    }
}
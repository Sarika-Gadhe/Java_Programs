class Arithmatic
{
    public int No1,No2;
    Arithmatic()
    {
        No1 = 0;
        No2 = 0;

    }
    Arithmatic(int a, int b)
    {
        No1 = a;
        No2 = b;
    }

    int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
}

class Marvellous
{
    public static void main(String A[])
    {
        Arithmatic aobj = new Arithmatic(11,10);
        int Ret = 0;

        Ret = aobj.Addition();

        System.out.println("Addition is:"+Ret);
    }
}

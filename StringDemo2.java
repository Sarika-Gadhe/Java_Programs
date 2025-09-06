class StringDemo2
{
    public static void main(String A [])
    {
        String s1 = "Hello";                               //pool

        String s2 = new String("Hello");           //heap

        char Arr[] = {'H','e','l','l','o'};

        String s3 = new String(Arr);

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(Arr.length);

        

    }    
}

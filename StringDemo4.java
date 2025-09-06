class StringDemo4
{
       public static void main(String A [])
    {
        String s1 = "Hello";                               
        String s2 = new String("Hello");          

        if(s1 == s2)
        {
            System.out.println("String are equal using ==");
        }
        else
        {
            System.out.println("String are not equal using ==");
        }

        if(s1.equals(s2))
        {
            System.out.println("String are equal using equal method");
        }
        else
        {
            System.out.println("String are not equal using equal method");
        }
    }    
}

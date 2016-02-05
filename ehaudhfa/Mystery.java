public class Mystery
{
    public String mystery(String s)
    {
        String s1 = s.substring(0,1);
        String s2 = s.substring(1, s.length() - 1);
        String s3 = s.substring(s.length() - 1);
        if (s.length() <= 3)
            {
            return s3 + s2 + s1;
        }//end if 
        else
            {
            return s1 + mystery(s2) + s3;
        }
    }
    public String toString()
        {
         output = mystery("
        }//end 
    public static void main ( String[] args)
        {
        System.out.println(mystery("DELIVER"));
        }//end method main
}//end class Mystery
public class stringCompressionEasy{
    
}public static String compression(String str)
{
    int count = 1;
    int next = 0;

    StringBuilder str1 = new StringBuilder();
    str1.append(str.charAt(0));

    for(int i = 1; i < str.length(); i++)
    {
        if(str.charAt(i) == str1.charAt(next))
        {
            count++;
        }
        else
        {
            str1.append(count);
            count = 1;
            next = next + 2;
            str1.append(str.charAt(i));
        }
    }
    str1.append(count);
    return str1.toString();
}
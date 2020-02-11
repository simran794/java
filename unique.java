import java.util.HashSet;

public class unique{
    public static boolean isUnique(String str)
    {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        HashSet<Character> unique = new HashSet<>();
        for(int i = 0; i < str.length(); i++)
        {
            if(!unique.contains(str.charAt(i)))
            {
                unique.add(str.charAt(i));
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
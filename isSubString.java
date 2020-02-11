public class isSubString {
    public static boolean isSubstring(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        else{
            String c = b.concat(b);
            boolean result = true;
            int i = c.indexOf(a);
            if(i < 0){
                result = false;
            }
            return result;
        }
    }
    public static void main (String [] args)
    {
        String a = "waterbottle";
        String b = "erbottlewat";
        boolean endvalue = isSubstring(a,b);
        System.out.println(endvalue);
    }
}
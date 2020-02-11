public class stringCompression {
    public static void main (String [] args)
    {
        String a = "aabcccccb";
        StringBuilder b = new StringBuilder();
        int count = 1;
        
        for(int i=0; i<a.length()-1; i++){
            if(i == a.length()-2){
                if(a.charAt(i)==a.charAt(i+1)){
                    b.append(a.charAt(i));
                    count++;
                    b.append(count);
                }
                else{
                    b.append(a.charAt(i));
                    b.append(count);
                    b.append(a.charAt(i+1));
                    b.append("1");
                }
            }
            else if(a.charAt(i)==a.charAt(i+1)){
                count++;
            }
            else{
                b.append(a.charAt(i));
                b.append(count);
                count = 1;
            }
        }
        System.out.println(b.toString());
    }
}

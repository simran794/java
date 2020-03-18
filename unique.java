import java.util.*;

public class unique {
    
    public static boolean uniqueOccurrences(final int[] arr) {
        HashMap<Integer, Integer> y = new HashMap<>();
        HashSet<Integer> x = new HashSet<>();
        
        int len = arr.length;
        for(int i=0; i < len; i++){
           if (!y.containsKey(arr[i])){
            y.put(arr[i],1);
           }
           else {
                y.put(arr[i], y.get(arr[i])+1);
           }
        }
        for (Integer key : y.values()){
            // System.out.println(key);
            if(!x.contains(key)){
                x.add(key);
            }
            else{
                return false;
            }
        }
        return true;
    }
// 1,2,2,1,1,3
public static void main(String [] args){
        int[] array = new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(array));
    }

}

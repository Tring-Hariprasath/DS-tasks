
import java.util.*;
class CommonNum{
    public static void main(String[] args){
        int m, n, k = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int val = s.nextInt();
                if(i == 0){
                    if(!map.containsKey(val)){
                        map.put(val, 1);
                    }
                }else{
                    if(map.containsKey(val)){
                        map.put(val, map.get(val)+1);
                        if(map.get(val) == m){
                            arr[k++] = val;
                        }
                    }
                }
            }
        }
        if(k>0){
            for(int i = 0; i <= k-1; i++){
                System.out.println("Elements that are repeated in all rows are:");
                System.out.println(arr[i]+ " ");
            }
            
        }else{
            System.out.println("No element is repeated in all rows.");
        }
    }
}

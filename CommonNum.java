import java.util.*;
 
class Main
{
 

static int R = 4;
static int C = 4;
 

static void findCommon(int mat[][])
{
   
    HashMap<Integer,
            Integer> map = new HashMap<Integer,
                                       Integer>();
 
    int i, j;
 
    for (i = 0; i < R; i++)
    {
 
       
        if(map.containsKey(mat[i][0]))
        {
            map.put(mat[i][0],
            map.get(mat[i][0]) + 1);
        }
        else
        {
            map.put(mat[i][0], 1);
        }
 
      
        for (j = 1; j < C; j++)
        {
 
           
            if (mat[i][j] != mat[i][j - 1])
                if(map.containsKey(mat[i][j]))
                {
                    map.put(mat[i][j],
                    map.get(mat[i][j]) + 1);
                }
                else
                {
                    map.put(mat[i][j], 1);
                }
        }
    }

    
    int[] arr = new int[R*C];
    int inc = 0, fl = 0;
    for (Map.Entry<Integer,
                   Integer> ele : map.entrySet())
    {
        if (ele.getValue() == R){
            fl++;
            arr[inc++] = ele.getKey();
        }
            
    }
    
    for(int k = 0; k <= inc -1; k++){
        System.out.println(arr[k]);
    }
    if(fl == 0){
         System.out.println("No common element");
    }
}
 

public static void main(String[] args)
{
    int mat[][] = {{ 1, 2, 3, 4, },
                   { 4, 5, 1, 3, },
                   { 3, 4, 2, 5, },
                   { 4, 5, 2, 1, }};
    findCommon(mat);
    
    
}}
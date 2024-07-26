package interview.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintCountOfPairs {
    public static void main(String[] args) {

        int []ar={3,7,2,7,4,1,7,1,7,1};

        Map<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<ar.length;i++){
            int flag=1;
            if(map.containsKey(ar[i])){

                flag=flag+map.get(ar[i]);
                map.put(ar[i],flag);
            }
            else{
                map.put(ar[i],1);
            }
        }

        Set<Map.Entry<Integer,Integer>> entry=map.entrySet();
        int sum=0;
        for(Map.Entry<Integer,Integer> entry1:entry){
            sum=sum+entry1.getValue()/2;
        }
        System.out.println(sum);
    }
}

package collection_basic_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {

        Map<Integer, List<Integer>>  integerListMap = new HashMap<>();

        ArrayList al1=new ArrayList();
        al1. add(10);al1.add(20);al1. add(1);al1.add(7);

        int sum = 0;

        for(Object i : al1){
            sum = sum + (Integer) i;
        }

        System.out.println(sum);

        ArrayList al2=new ArrayList();
        al2. add(2);al2.add(6);al2. add(5);al2.add(7);

        integerListMap.put(91, al1);
        integerListMap.put(92, al2);



    }
}

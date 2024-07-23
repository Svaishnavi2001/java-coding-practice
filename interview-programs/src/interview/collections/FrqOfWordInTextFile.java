package interview.collections;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrqOfWordInTextFile {
    public static void main(String[] args) {

        String inputFile = "C:\\Users\\1rn19\\Desktop\\TextFile\\file1.txt";


        Map<String, Integer> wordCountMap = new LinkedHashMap<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String Line;
            while((Line= reader.readLine())!=null){
                String []words=Line.split("\\s+");
                for(String word:words){
                    word=word.toLowerCase();
                    int count=1;
                    if(wordCountMap.containsKey(word)){
                        count=count+wordCountMap.get(word);
                        wordCountMap.put(word, count);
                    }
                    else{
                        wordCountMap.put(word,1 );
                    }}
            }
        }
           catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(Map.Entry<String,Integer> stringIntegerEntry:wordCountMap.entrySet() ){
            System.out.println(stringIntegerEntry.getKey()+":"+ stringIntegerEntry.getValue());
        }
    }

}
package interview.string_prgs;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveWordsFrmTextFile {
    public static void main(String[] args) {

        String inputFilePath = "C:\\Users\\1rn19\\Desktop\\input.txt";
        String outputFilePath = "output.txt";

        Set<String> wordsToRemove = new HashSet<>(Arrays.asList("my", "name"));
        try {
            BufferedReader reader=new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer=new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while((line=reader.readLine())!=null) {
                String updatedLine = removeWords(line, wordsToRemove);
                System.out.println(updatedLine);
                writer.write(updatedLine);
                writer.newLine();
                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(outputFilePath);
    }
    private static String removeWords(String line, Set<String> wordsToRemove) {

        StringBuilder res = new StringBuilder();

        String[] words = line.split("\\s+");
        for (String word : words) {
            if (!wordsToRemove.contains(word)) {
                if (res.length() > 0) {
                    res.append(" ");
                }
                res.append(word);
            }
        }
        return res.toString();
    }

}
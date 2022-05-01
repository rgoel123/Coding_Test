
import java.io.*;
import java.util.ArrayList;

public class FindLongestWordAndTransposedWord {
    public static ArrayList<String> getLongestTransposedWord(String path, String filename) throws Exception {
        try {
            FileInputStream fStream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fStream));

            String currentWord;
            int longestWordLength = 0;

            ArrayList<String> wordList = new ArrayList<>();// Creating an arraylist to store Longest word and Longest reversed word

            // Reading input from a file and checking if file is empty
            while ((br.readLine()) == null) {
                System.out.println("File is empty");
                writeOutputFile(wordList, filename);
                return wordList;
            }

            fStream.getChannel().position(0); // Reset the stream
            br = new BufferedReader(new InputStreamReader(fStream));

            // Reading input from a file of words and finding longest word length
            while ((currentWord = br.readLine()) != null) {
                if (currentWord.length() > longestWordLength) {
                    longestWordLength = currentWord.length();
                }
            }

            fStream.getChannel().position(0); //Reset the stream
            br = new BufferedReader(new InputStreamReader(fStream));

            // Reading input from a file of words and finding longest word
            while ((currentWord = br.readLine()) != null) {
                if (currentWord.length() == longestWordLength) {
                    System.out.println("Longest Word is: " + currentWord); // Printing Longest word
                    wordList.add(currentWord);

                    String reverseWord = "";
                    for (int i = currentWord.length() - 1; i >= 0; i--)    // Reversing Longest word
                    {
                        reverseWord = reverseWord + currentWord.charAt(i);
                    }
                    System.out.println("Reverse of the Longest Word is: " + reverseWord); //Printing Reverse of longest Word
                    wordList.add(reverseWord);

                }
            }
            fStream.close();
            br.close();
            writeOutputFile(wordList, filename);
            return wordList;
        } catch (Exception e) {
            throw e;

        }
    }

    public static void writeOutputFile(ArrayList<String> wordList, String filename) throws Exception {
        FileWriter writer = new FileWriter("src/test/resources/OutputFiles/Output_" + filename + ".txt");
        for (int j = 0; j < wordList.size(); j++) {
            writer.write(wordList.get(j));
            writer.write("\n");
        }
        writer.close();

    }

}

import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestFileWithLongestWord {

    @Test(priority = 1)
    public void fileWithOneLongestWord(Method m) {

        try {
            ArrayList<String> longestWordWithReverseWordList = FindLongestWordAndTransposedWord.getLongestTransposedWord("src/test/resources/InputFiles/FileWithOneLongestWord.txt", m.getName());
            Assert.assertEquals(2, longestWordWithReverseWordList.size());
        } catch (Exception e) {
            System.out.println("Exception found: " + e.getMessage());
        }

    }

    @Test(priority = 2)
    public void fileWithTwoLongestWordsOfSameLength(Method m) {
        try {
            ArrayList<String> longestWordWithReverseWordList = FindLongestWordAndTransposedWord.getLongestTransposedWord("src/test/resources/InputFiles/FileWithTwoLongestWordsOfSameLength.txt", m.getName());
            Assert.assertEquals(4, longestWordWithReverseWordList.size());
        } catch (Exception e) {
            System.out.println("Exception found: " + e.getMessage());
        }
    }

    @Test(priority = 3)
    public void emptyFile(Method m) {
        try {
            ArrayList<String> longestWordWithReverseWordList = FindLongestWordAndTransposedWord.getLongestTransposedWord("src/test/resources/InputFiles/EmptyFile.txt", m.getName());
            Assert.assertEquals(0, longestWordWithReverseWordList.size());
        } catch (Exception e) {
            System.out.println("Exception found: " + e.getMessage());
        }

    }

    @Test(priority = 4)
    public void fileWithSingleLetter(Method m) {
        try {
            ArrayList<String> longestWordWithReverseWordList = FindLongestWordAndTransposedWord.getLongestTransposedWord("src/test/resources/InputFiles/FileWithSingleLetter.txt", m.getName());
            Assert.assertEquals(2, longestWordWithReverseWordList.size());
        } catch (Exception e) {
            System.out.println("Exception found: " + e.getMessage());
        }

    }

    @Test(priority = 5)
    public void filePathNotFound(Method m) {
        try {
            ArrayList<String> longestWordWithReverseWordList = FindLongestWordAndTransposedWord.getLongestTransposedWord("src/test/resources/FileWithOneLongestWord.txt", m.getName());
            Assert.assertEquals(2, longestWordWithReverseWordList.size());
        } catch (Exception e) {
            System.out.println("Exception found: " + e.getMessage());
        }

    }


}
# Coding_Test

# Installation
* Software that need to be installed initially: Git,Java(JDK 1.8),Maven 3.5+.
* Sync the code by: git clone XXX (XXX is git repository link)
* Add TestNG dependency in pom.xml file.

# Language Used
* Java

# Testing Framework Used
* TestNG Framework

# IDE Used
* IntelliJ IDEA or Eclipse (Note: For Eclipse, we need to add TestNG Library)

# Project structure
* src/main/java/FindLongestWordAndTransposedWord : Main Program File
* src/test/java/TestFileWithLongestWord: Test Cases File
* src/test/resources/InputFiles : Test data Input Files
* src/test/resources/OutputFiles : Test Output Files
* pom.xml : Maven pom file

# How to run the test in IntelliJ IDEA
* Right click on TestCases File and click on Run button in green color.
  (Make sure Project SDK is set with JDK 1.8 version. You can check by clicking on File->Project Structure->Project->Project SDK).

# Test Cases with Input File Details
* **fileWithOneLongestWord** - This testcase is to test if file has just 1 longest word(FileWithOneLongestWord.txt).
* **fileWithTwoLongestWordsOfSameLength** - This testcase is to test if file has 2 longest words of same length(FileWithTwoLongestWordsOfSameLength.txt)
* **emptyFile** - This testcase is to test if file is empty(EmptyFile.txt).
* **fileWithSingleLetter** - This testcase is to test file with single letter(FileWithSingleLetter.txt).
* **filePathNotFound** - This testcase is to test if file path is not find (FileWithOneLongestWord.txt).

# Generating Output files
* output_fileWithOneLongestWord.txt
* output_fileWithTwoLongestWordsOfSameLength.txt
* output_emptyFile.txt
* output_fileWithSingleLetter.txt

# Assumptions
* Text in separate lines in Test data Input Files.



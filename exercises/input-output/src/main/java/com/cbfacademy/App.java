package main.java.com.cbfacademy;

public class App {
    public static void main(String[] args) {

        //relative path
        String filePath = "exercises/input-output/src/main/resources/exercise.txt";
        ReadFile readFile = new ReadFile();
        ReadFileImprovement readDoc = new ReadFileImprovement();
        String outputFile = "exercises/input-output/src/main/resources/output.txt";

        //readFile.Read(filePath);
        //readFile.ReadWrite(outputFile, filePath);
        readDoc.readFile(filePath);
    }
}

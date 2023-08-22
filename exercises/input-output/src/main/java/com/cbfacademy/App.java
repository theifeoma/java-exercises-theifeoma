package main.java.com.cbfacademy;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        //relative path
        String filePath = "exercises/input-output/src/main/resources/exercise.txt";
        ReadFile readFile = new ReadFile();
        String outputFile = "exercises/input-output/src/main/resources/output.txt";

        //readFile.Read(filePath);
        readFile.ReadWrite(outputFile, filePath);
    }
}

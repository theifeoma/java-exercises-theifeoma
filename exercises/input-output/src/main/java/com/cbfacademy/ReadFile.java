package main.java.com.cbfacademy;

import java.io.*;

public class ReadFile {

    public ReadFile(){
    }

    public void Read(String str){
        try(
            FileInputStream file = new FileInputStream(str);
            InputStreamReader streamReader = new InputStreamReader(file);
            LineNumberReader lineReader = new LineNumberReader(streamReader);
        ){
            String outputLine = lineReader.readLine();
            while (outputLine != null){
                System.out.printf("%d : %s%n", lineReader.getLineNumber(), outputLine);
                outputLine = lineReader.readLine();
            }
        }
        catch (IOException e){
            System.out.println("File reading exception: " + e.getMessage());
        }
    }

    public void ReadWrite(String outputFile, String inputFile){
        try(
                FileInputStream file = new FileInputStream(inputFile);
                InputStreamReader streamReader = new InputStreamReader(file);
                LineNumberReader lineReader = new LineNumberReader(streamReader);

                FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                PrintWriter writer = new PrintWriter(outputStreamWriter);
        ){
            String output = lineReader.readLine();
            while (output!= null){
                writer.println(output);
                output = lineReader.readLine();
            }

            // is closed with the try block
            writer.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            System.out.println("File writing exception: " + e.getMessage());
        }

    }

}


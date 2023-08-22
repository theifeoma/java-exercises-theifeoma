package main.java.com.cbfacademy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileImprovement {

    public ReadFileImprovement(){

    }
    public void readFile(String filePath){
        try(Stream<String> stream = Files.lines(Paths.get(filePath))){
            stream.forEach(System.out::println);
        }catch(IOException e){
            System.out.println("File reading exception: " + e.getMessage());
        }
    }
}

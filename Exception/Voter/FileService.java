package com.java.Exception.Voter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    public static void save(String data){
        File file = new File("C:/Java/File/voter.txt");
        try{
            FileWriter fWriter = new FileWriter(file);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(data);
            bWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

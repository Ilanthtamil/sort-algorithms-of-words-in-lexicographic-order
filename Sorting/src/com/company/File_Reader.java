package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    int read_numlines() {
        int numLines = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("wordList.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                numLines++;
            }
            reader.close();
            System.out.println(numLines);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return numLines;
    }

    void print_array(String [] words)
    {
        int count = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader("wordList.txt"));
            String line;

            while((line = reader.readLine()) != null)
            {
                words[count] = line;
                count++;
            }
            System.out.println(count);

            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

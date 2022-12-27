package com.company;

import java.io.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lines;
        File_Reader read = new File_Reader();
        lines = read.read_numlines();

        String [] words = new String[lines];
        read.print_array(words);

        //Ilan Sort
        Bubble_Sort sort1 = new Bubble_Sort();
        Bubble_Sort.bubbleSort(words, lines);
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("bubbleSortResults.txt"));
            for(int i = 0; i < words.length; i++) {
                writer.write(words[i]+"\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Insertion_Sort sort2 = new Insertion_Sort();
        Insertion_Sort.insertionSort(words, lines);
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("insertionSortResults.txt"));
            for(int i = 0; i < words.length; i++) {
                writer.write(words[i]+"\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Quick_Sort sort3 = new Quick_Sort();
        Quick_Sort.quickSort(words, lines, lines);
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("quickSortResults.txt"));
            for(int i = 0; i < words.length; i++) {
                writer.write(words[i]+"\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Radix_Sort sort4 = new Radix_Sort();
        Radix_Sort.radixSort(words, lines);

        /*for(int i = 0; i < numLines; i++){
            System.out.println(words[i]);
        }*/

        //writing to a text file
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("radixSortResults.txt"));
            for(int i = 0; i < words.length; i++) {
                writer.write(words[i]+"\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

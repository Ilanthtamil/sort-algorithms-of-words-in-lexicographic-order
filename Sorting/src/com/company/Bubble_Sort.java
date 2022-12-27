package com.company;

public class Bubble_Sort {
	public static String[] bubbleSort(String words[], int length){
        String temp = "";

        for(int outer = 0; outer < length; outer++){
            for(int inner = outer + 1; inner < length; inner++){

                if(words[outer].compareToIgnoreCase(words[inner]) > 0){
                    temp = words[outer];
                    words[outer] = words[inner];
                    words[inner] = temp;
                }

            }
            
        }
        return words;
    }

}

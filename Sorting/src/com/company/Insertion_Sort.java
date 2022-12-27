package com.company;

public class Insertion_Sort {
	
    public static String[] insertionSort(String words[], int length){
        String temp = "";
    int i, j;

        for (j = 1; j < words.length; j++) { //the condition has changed
            temp = words[j];
            i = j - 1;
            while (i >= 0) {
              if (temp.compareTo(words[i]) > 0) {//here too
                break;
              }
              words[i + 1] = words[i];
              i--;
            }
            words[i + 1] = temp;
          }
        return words;
    }

}

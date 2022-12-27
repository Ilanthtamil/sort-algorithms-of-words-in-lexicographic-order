package com.company;

public class Radix_Sort {
    public static int getLongest(String[] words, int numLines)
    {
        int index = 0;
        int element = words[0].length();
        for(int i = 1; i< numLines; i++){
            if(words[i].length()>element){
                index = i;
                element = words[i].length();
            }
        }
        return words[index].length();
    }

    public static void radixSort(String[] words, int r)
    {
        int longest = getLongest(words, r);
        System.out.println(longest);
        for(int pos = longest; pos > 0; pos--)
        {
            countSort(words, r, pos -1);
        }
    }

    public static void countSort(String[] a, int n, int pos)
    {
        String [] b = new String[n];
        int [] c = new int[256];

        for(int i = 0; i < 256; i++)
        {
            c[i] = 0;
        }

        for(int i = 0; i < n; i++)
        {
            //System.out.println(a[i].length());
            c[pos < a[i].length() ? (a[i].charAt(pos)) + 1 : 0]++;
            //c[i < a[i].length() ? (a[i].charAt(pos)) + 1 : 0]++;
            //System.out.println(c[i]);
            //System.out.println(c[(a[i].charAt(pos))]);
        }

        for (int f = 1; f <256; f++)
        {
            c[f] += c[f - 1];
        }

        for (int i = n - 1; i >= 0; i--){
            b[c[pos < a[i].length() ? (a[i].charAt(pos)) + 1 : 0] - 1] = a[i];
            c[pos < a[i].length() ? (a[i].charAt(pos)) + 1 : 0]--;
        }

        for (int i = 0; i < n; i++){
            a[i] = b[i];
        }
    }
}

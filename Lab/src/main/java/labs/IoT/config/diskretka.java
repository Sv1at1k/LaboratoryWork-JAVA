package labs.IoT.config;

import java.io.Console;

public class diskretka {


    static int next_back(int[]arr, int l, int n){
        int i = l;
        do{
            i--;
        } while (i>0 && arr[i] <= 1);
        arr[i]--;

        int sum=0;
        int c=0;
        while (arr[c]>0)
            sum+=arr[c++];

        int value = arr[i];
        do
            i++;
        while (arr[i]>=value);
        if (arr[i]==0) c++;
        arr[i]++;

        return c;
    }

    static void run_back(int n){

        int [] arr = new int [n];
        int l=1;
        arr[0] = n;

        printSplit(arr, n);
        do {
            l=next_back(arr, l, n);
            printSplit(arr, l);
        } while (l<n);
    }

    static void printSplit(int [] arr, int l){
        for (int i=0; i<l; i++){
            if(arr[i] == 0) break;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
public static void main (String args[])
    {
        diskretka.run_back(19);


    }
}
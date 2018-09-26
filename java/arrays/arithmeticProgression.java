// Given an array a[] of N integers and a number d. You can change any element of the array to any integer. The task is to find the minimum number 
// of change(s) required to make the given array an arithmetic progression with the common difference d.

// example : 
//     Input: N = 4, d = 2
//         a[] = {1, 2, 4, 6}
//     Output : a[] = {0, 2, 4, 6}
    
import java.util.*;
class AP{
    static int minChanges(int[] a, int n, int d){
        int maxFreq = -1;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int a0 = a[i] - i * d;
            //storing the frequency of a0 for all values of a[] and finding the max frequency.
            if(freq.containsKey(a0))
                freq.put(a0, freq.get(a0) + 1);
            else
                freq.put(a0, 1);
            if(freq.get(a0) > maxFreq)
                maxFreq = freq.get(a0);
        }
        // minimum number of elements required to be changed is n - (max frequency of a0).
        return n - maxFreq;
    }
    public static void main(String args[]){
        int n=4, d=2;
        int a[] = {1, 2, 4, 6};
        System.out.println(minChanges(a, n, d));
    }
}
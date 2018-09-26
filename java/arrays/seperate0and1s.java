// Segregate 0s and 1s in an array
// You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

// Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
// Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 

class GFG {     
    // function to segregate 0s and 1s
    static void segregate0and1(int arr[], int n){
        int count = 0; // counts the no of zeros in array     
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        } 
        // loop fills the array with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0; 
        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;
    }
     
    static void print(int arr[], int n){
        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");    
    }
     
    public static void main(String[] args){
        int arr[] = new int[]{ 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        int n = arr.length; 
        segregate0and1(arr, n);
        print(arr, n);         
    }
}
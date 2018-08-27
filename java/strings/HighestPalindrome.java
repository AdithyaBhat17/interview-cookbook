/*
Asked by - Delta X

Make largest palindrome by changing at most K-digits
Given a string containing all digits, we need to convert this string to a palindrome by changing at most K digits.
If many solutions are possible then print lexicographically largest one.

Examples:

Input   : str = “43435”	
          k = 3
Output  : "93939" 
Lexicographically largest palindrome 
after 3 changes is "93939" 

Input :  str = “43435”	
         k = 1
Output : “53435”
Lexicographically largest palindrome 
after 3 changes is “53435”

Input  : str = “12345”	
         k = 1
Output : "Not Possible"
It is not possible to make str palindrome
after 1 change.
*/

/*
if (minChanges == k) {
    // if digits are different then change smaller to match larger
} else if (minChanges >= k+2) {
   // You have spare changes. Change one or both (or neither!) to '9'
} else (minChanges == k+1) {
   // You can make one extra change.  If the digits are different, then change the smaller
   // to match the larger.
}
*/

class Palindrome{
    public static String maxPalindrome(String str, int k){
        char[] c = str.toCharArray();
        int minChange = 0;
        for(int i=0,j=c.length-1;i<j;i++,j--)
            if(c[i] != c[j])
                minChange++;
        
        if(minChange > k)
            return "-1";

        int changeBoth = k - minChange;
        int i = 0;
        int j =c.length - 1;
        for(;i<=j;i++,j--){
            if(c[i] != c[j]){
                char maxChar = (char) Math.max(c[i],c[j]);
                if(maxChar != '9' && changeBoth - 1 >= 0){
                    c[i] = '9';
                    c[j] = '9';
                    changeBoth--;
                }
                else{
                    c[i] = maxChar;
                    c[j] = maxChar;
                    minChange--;
                }
            }
            else{
                char maxChar = (char) Math.max(c[i], c[j]);
                if (maxChar != '9' && changeBoth - 2 >= 0) {
                    c[i] = '9';
                    c[j] = '9';
                    changeBoth -= 2;
                }
            }
        }
        if (changeBoth != 0 && i - 1 == j + 1) {
            c[i - 1] = '9';
        }
        String result = new String(c);
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String str = in.next();
        System.out.println(maxPalindrome(str, k));
    }
}
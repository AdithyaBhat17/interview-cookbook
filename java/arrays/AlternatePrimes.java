// Given a number N, the task is to find alternate prime numbers till N.

class Prime{
    static int prime(int num){
        int i, flag = 0;
        for(i=2;i<=num/2;i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0)   
            return 1;
        return 0;
    }

    static void printAlternatePrimes(int n){
        int count = 0;
        for(int i=2;i<n;i++){
            if(prime(i) == 1){
                if(count % 2 == 0)
                    System.out.println(i + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Alternate primes numbers upto " + n + " are :");
        printAlternatePrimes(n);
    }
}
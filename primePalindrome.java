public class primePalindrome {
    public int checkPrimePalindrome(int n) {
        for(int i=1;i<=n;i++){
            if(i==reverse(i) && prime(i)){
                return i;
            }
        }
        return 0;
    }
    public static int reverse(int x){
        int rev=0;
        int digit=0;
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
    public static boolean prime(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        primePalindrome ob = new primePalindrome();
        int n=11;
        int result = ob.checkPrimePalindrome(n);
        if(result != 0) {
            System.out.println("The smallest prime palindrome less than or equal to " + n + " is: " + result);
        } else {
            System.out.println("No prime palindrome found less than or equal to " + n);
        }
    }
}

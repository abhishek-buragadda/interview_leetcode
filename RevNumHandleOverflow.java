

/*
    Given a 32-bit signed integer, reverse digits of an integer.

   Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.



 */
public class RevNumHandleOverflow {

    public int reverse(int x) {
        int rev = 0 ,prev = 0 ;
        boolean negOverflow = false ;
        while(x!=0 ){
            int t = x%10;
            rev = rev*10 +t;
            x= x/10;
            if( (rev - t)/10 != prev ){
                negOverflow = true;
                break;
            }
            prev = rev;
        }
        if(negOverflow){
            return 0 ;
        }
        return rev;
    }

}

/*

    It gives a garbage value once it overflows. So rechecking with the previous value to find out whehter the current
    one is garbage or actual one.

 */
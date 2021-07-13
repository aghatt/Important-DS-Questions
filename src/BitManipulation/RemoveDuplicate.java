/*
Problem: Given an array of integers A, every element appears twice except for one. Find that single one.
NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Solution:We have noticed that if X has 1 in that position, we will have odd number of 1s in that position.
If X has 0 in that position, we will have odd number of 0 in that position.
If you look at the bit operators, XOR is exactly what we need.
XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0.
Finally, there is only one number left.
A ^ A = 0 and A ^ B ^ A = B.
So, all even occurences will cancel out using XOR.
 */

package BitManipulation;

public class RemoveDuplicate {
    public static int singleNumber(final int[] A) {

        int ans=0;
        for(int i=0; i<A.length; i++)
        {
            ans ^= A[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,4,4,};
        System.out.println(singleNumber(arr));
    }
}

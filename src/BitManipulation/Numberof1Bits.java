package BitManipulation;

public class Numberof1Bits {

    public static int numSetBits(long A) {

        int count = 0;

        while (A > 0) {
            if ( (A & 1) != 0)
                count++;
            A >>= 1;
        }

        return count;

    }

    public static void main(String[] args) {
        int ans = numSetBits(5);
        System.out.println(ans);
    }
}

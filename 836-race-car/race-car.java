class Solution {
    public int racecar(int target) {
        return sequenceLength(target, false, 0, 0);
    }

    // isNeg is the sign
    // m are the minus signs
    // p are the plus signs
    private int sequenceLength(int val, boolean isNeg, int p, int m) {
        if(is2PowerOneLess(val)) {
            if(m <= p)
                return numBits(val) + (2 * p);
            return numBits(val) + (2 * m) - 1; 
        }

        // using the next power of 2 to arrive at solution
        // sign changes
        // since sign is reversed, if isNeg is true, increment p else increment m
        int pow2 = getNext2Power(val);
        int len1 = numBits(pow2) + sequenceLength(pow2 - val, !isNeg, p + (isNeg? 1: 0), m + (isNeg? 0: 1));

        // using the previous power of 2 to arrive at solution
        // no sign change
        // since no sign change, if isNeg is true, increment m else increment p
        pow2 >>= 1;
        int len2 = numBits(pow2) + sequenceLength(val - pow2, isNeg, p + (isNeg? 0: 1), m + (isNeg? 1: 0));

        return Math.min(len1, len2);
    }

    // keep or-ing with num/2 until all bits are set
    private int getNext2Power(int num) {
        int temp = num;
        while(!is2PowerOneLess(temp))
            temp = (temp | (temp >> 1));
        return temp;
    }

    // and will num+1 to get 0 => num+1 is a power of 2
    private boolean is2PowerOneLess(int num) {
        return (num & (num + 1)) == 0;
    }

    // count the number of bits until the max set bit
    private int numBits(int num) {
        int temp = num;
        int count = 0;
        while(temp > 0) {
            temp >>= 1;
            count++;
        }
        return count;
    }
}
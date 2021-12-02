package academy.learnprogramming;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

             int myValue = 10000;

             int myMinIntValue = Integer.MIN_VALUE;
             int myMaxIntvalue = Integer.MAX_VALUE;
             System.out.println("Integer Minimum Value = " + myMinIntValue);
             System.out.println("Integer Maximum Value = " + myMaxIntvalue);
             System.out.println("Busted MAX value = " + (myMaxIntvalue +1));
             System.out.println("Busted MIN value = " + (myMinIntValue -1 ));

             int myMaxIntTest = 2_147_483_647;

             byte myMinByteValue  = Byte.MIN_VALUE;
             byte myMaxByteValue  = Byte.MAX_VALUE;
             System.out.println("Byte Minimum Value = " + myMinByteValue);
             System.out.println("Byte Maximum Value = " + myMaxByteValue);

             short myMinShortValue  = Short.MIN_VALUE;
             short myMaxShortValue  = Short.MAX_VALUE;
             System.out.println("Short Minimum Value = " + myMinShortValue);
             System.out.println("Short Maximum Value = " + myMaxShortValue);

            long myLongValue = 100L;
            long myMinLongValue  = Long.MIN_VALUE;
            long myMaxLongValue  = Long.MAX_VALUE;
            System.out.println("Long Minimum Value = " + myMinLongValue);
            System.out.println("Long Maximum Value = " + myMaxLongValue);
            long bigLongLiteralValue = 2_147_483_647_234L;
            System.out.println("Long Literal Value = " + bigLongLiteralValue);

            short bigShortLiteralValue = 32767;

            int myTotal =  (myMinIntValue /2);

            byte myNewByteValue = (byte) (myMinByteValue /2);

            short myNewShortValue = (short) (myMinShortValue / 2);

            byte myOwnByteValue = (byte) (myMaxByteValue * 2);
            System.out.println("This is my Byte for Primitive type challenge = " + myOwnByteValue);

            short myOwnShortValue = (short) (myMaxShortValue * 2);
            System.out.println("This is my short primitive challenge = " + myOwnShortValue);

            int myOwnIntValue = 500;
            short myOwnByteShortSum = (short) (myMaxByteValue + myOwnShortValue);
            System.out.println("this is sum of myOwnByte and myOwnShort = " + myOwnByteShortSum);

            short myFinalChallengeSum = (short) (myOwnIntValue + myOwnByteShortSum + myOwnIntValue);
            System.out.println("This is my final sum for challenge = " + myFinalChallengeSum);

            long myRealFinalChallengeAnswer = (50_000) + (10 * myFinalChallengeSum);
            System.out.println("This is my real final answer = " + myRealFinalChallengeAnswer);

            byte byteValue = 10;
            short shortValue = 20;
            int intValue = 50;

            long longTotal = 50L + 10L * (byteValue + shortValue + intValue);
            System.out.println("this is long value w/o short = " + longTotal);

            short shortTotal = (short) (1000 + 10 *
                    (byteValue + shortValue + intValue));
            System.out.println("this another answer using different question using short = " + shortTotal);





            
            


    }
}

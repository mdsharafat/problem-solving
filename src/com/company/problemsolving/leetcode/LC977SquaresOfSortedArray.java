package com.company.problemsolving.leetcode;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 02 Mar, 2024 at 12:30 PM
 ******************************************
 */
public class LC977SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] givenArray = {-4,-1,0,3,10};

        int[] resultArray = new int[givenArray.length];

        for (int i = 0; i < givenArray.length; i++) {
            givenArray[i] = givenArray[i] * givenArray[i];
        }

        int firstPointer = 0;
        int lastPointer = givenArray.length - 1;


        for (int j = givenArray.length - 1; j >= 0; j--) {
            if (givenArray[firstPointer] > givenArray[lastPointer]) {
                resultArray[j] = givenArray[firstPointer];
                firstPointer++;
            }else {
                resultArray[j] = givenArray[lastPointer];
                lastPointer--;
            }
        }

    }
}

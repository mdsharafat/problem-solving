package com.company.problemsolving.recursion;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 02 Mar, 2024 at 12:21 PM
 ******************************************
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("sharafat"));
    }

    public static String reverseString(String s) {
        if (s.length() == 0) {
            return s;
        }else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}

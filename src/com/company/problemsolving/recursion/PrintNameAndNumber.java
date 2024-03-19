package com.company.problemsolving.recursion;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 07 Mar, 2024 at 12:15 PM
 ******************************************
 */
public class PrintNameAndNumber {

    public static void main(String[] args) {

    }

    public static void printName(int i, int n) {
        if (i <= n) {
            System.out.println("Name");
            printName(++i, n);
        }
    }
    public static void printOneToN(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            printOneToN(start+1, end);
        }
    }
    public static void printNToOne(int start, int end) {
        if (end >= start) {
            System.out.println(end);
            printNToOne(start, end -1);
        }
    }
    public static void printOneToNWithBacktrack(int end) {
        if (end < 1) return;
        printOneToNWithBacktrack(end - 1);
        System.out.println(end);
    }
    public static void printNToOneWithBacktrack(int start, int end) {
        if (start > end) return;
        printNToOneWithBacktrack(start + 1, end);
        System.out.println(start);
    }

}

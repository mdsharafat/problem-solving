package com.company.designpattern.singleton;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 01 Mar, 2024 at 11:07 AM
 ******************************************
 */
public class MySingletonClass {
    private static MySingletonClass classInstance;
    private MySingletonClass() {

    }
    public static MySingletonClass getInstance() {
        if (classInstance == null) {
            classInstance = new MySingletonClass();
        }
        return classInstance;
    }
}

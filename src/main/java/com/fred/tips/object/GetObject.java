package com.fred.tips.object;

import com.fred.tips.clazz.User;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/16
 */
public class GetObject {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class clazz = Class.forName("com.fred.tips.clazz.User");

        User user = (User) clazz.newInstance();

        System.out.println(user);
        //User{name='null', age=0}

    }
}

package com.fred.tips.clazz;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/16
 */
public class GetClazz3Method {


    public static void main(String[] args) throws ClassNotFoundException {


        //1.
        Class clazz1 = Class.forName("com.fred.tips.clazz.User");
        System.out.println(clazz1.getName());
        //com.fred.tips.clazz.User


        //2.
        Class clazz2 = User.class;
        System.out.println(clazz2.getName());

        //3.
        User user = new User();
        Class clazz3 = user.getClass();
        System.out.println(clazz3.getName());

    }
}

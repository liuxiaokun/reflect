package com.fred.tips.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/16
 */
public class GetObject {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class clazz = Class.forName("com.fred.tips.clazz.User");
        clazz.newInstance();

        Constructor[] constructors = clazz.getConstructors();

        for (Constructor constructor : constructors) {

            Class[] parameterTypes = constructor.getParameterTypes();
            System.out.println(Arrays.toString(parameterTypes));
        }


    }
}

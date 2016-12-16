package com.fred.tips.clazz;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/16
 */
public class ClassGet {

    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz = Class.forName("com.fred.tips.clazz.User");

        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
        //[private java.lang.String com.fred.tips.clazz.User.name, private int com.fred.tips.clazz.User.age]

        String simpleName = clazz.getSimpleName();//User
        System.out.println(simpleName);


        String name = clazz.getName();
        System.out.println(name);//com.fred.tips.clazz.User


        Constructor[] constructors = clazz.getConstructors();
        System.out.println(Arrays.toString(constructors));
        //[public com.fred.tips.clazz.User(java.lang.String,int), public com.fred.tips.clazz.User()]


        Annotation[] annotations = clazz.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        //[@java.lang.Deprecated()]

        Field[] fields = clazz.getFields();
        System.out.println(Arrays.toString(fields));
        /*getFields()获得某个类的所有的公共（public）的字段，包括父类。
            getDeclaredFields()获得某个类的所有申明的字段，即包括public、private和protected，
            但是不包括父类的申明字段。*/

        int modifiers = clazz.getModifiers();
        System.out.println(Modifier.toString(modifiers));//public


    }
}

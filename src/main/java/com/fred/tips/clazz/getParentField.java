package com.fred.tips.clazz;

import com.fred.tips.vo.Worker;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author Fred Liu(liuxiaokun0410@gmail.com)
 * @version 1.7
 * @since 2016/12/21
 */
public class getParentField {


    public static void main(String[] args) {

        Class<Worker> clazz = Worker.class;

        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
        //[private java.lang.String com.fred.tips.vo.Worker.workNo]

        Class<? super Worker> superclass = clazz.getSuperclass();
        Field[] declaredFields1 = superclass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields1));
        //[private java.lang.String com.fred.tips.vo.Person.age]

    }
}

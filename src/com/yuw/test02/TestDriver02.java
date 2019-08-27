package com.yuw.test02;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestDriver02 {
    @Test
    public void test03() {
        // 调用一个类的行为方法
        Student student = new Student();
        // 调用这个类的行为方法
        student.doStuding();  // 主动行为
    }

    @Test
    public void test02() {
        // 使用反射的思想来执行一个类的行为动作（这个类是被动的，被反射控制执行的）
        // 1 获取这个类的描述类Class类的实例对象
        Student student = new Student();
        Class clazz = student.getClass();
        // 2 通过反射的方式，从Class类获取需要执行的方法对象
        try {
            Method method = clazz.getDeclaredMethod("doStuding");
            // 使用反射对象的Method类的invoke方法执行获取的方法对象
            method.invoke(student,null);  // invoke反射执行该方法   被动行为
            System.out.println("==========================================================");
            // 获取需要控制的method的对象
            Method method1 = clazz.getDeclaredMethod("doStuding",String.class);
            // 反射执行该方法
            method1.invoke(student,"QST");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void test01() {
        // 使用反射的思想来解剖一个类的构成

        // 1 获取这个类的描述类Class类的实例对象
        Student student = new Student();
        Class clazz = student.getClass();
        // 2 通过反射的方式，从Class类获取被描述类的构成成分信息
        Method[] methods = clazz.getDeclaredMethods();
        // 遍历描述一个类的方法成分的Method的内容（反射中使用Method抽象封装类中的方法对象）
        for (Method m : methods) {
            System.out.print(m.getName()+"(");
            Parameter[] parameters = m.getParameters();
            for (Parameter p:parameters                 ) {
                System.out.print(p.getType().getName());
            }
            System.out.print(")");
            System.out.println();
        }

    }
}

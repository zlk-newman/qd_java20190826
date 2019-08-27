package com.yuw.test04;

import org.junit.Test;

public class TestDriver {
    @Test
    public void test01() {

        // 创建一个子类
        Monitor monitor = new Monitor(); // 父类指代子类（向上溯型）
        /*
        结论：子类创建时会递归调用父类的构造方法
         */
    }

    @Test
    public void test02(){
        // 创建一个父类Student类
        Student student = new Student();
        System.out.println("=================================");
        // 再次创建
        Student student2 = new Student();

        /*
        执行顺序：
       /1、静态语句块；
        2、非静态语句块或成员变量（二者的先后由位置先后决定）；
        3、构造方法

        注意：
        静态代码块只执行一次；
        非静态代码块每次new时都执行
         */
    }

    @Test
    public void test03() {

        // 创建一个子类
        Monitor monitor = new Monitor(); // 父类指代子类（向上溯型）
        System.out.println("=================================");
        Monitor monitor2 = new Monitor();
        /*
        执行顺序：
        1、执行了父类静态代码块
        2、执行了子类静态代码块
        3、执行了父类非静态语句块或成员变量（二者的先后由位置先后决定）
        4、执行了父类构造方法
        5、执行了子类非静态语句块或成员变量（二者的先后由位置先后决定）
        6、执行了子类构造方法


        静态语句块；
        非静态语句块或成员变量（二者的先后由位置先后决定）；
        构造方法

        注意：
        静态代码块只执行一次；
        非静态代码块每次new时都执行;
         */
    }
}

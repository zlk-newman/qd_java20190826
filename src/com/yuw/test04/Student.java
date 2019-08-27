package com.yuw.test04;

public class Student {
    // 属性
    private String stuName;
    private String strNum;

    {
        System.out.println("执行了父类Student的非静态代码块");
    }

    private Address address = new Address(); // 测试成员变量的执行顺序

    static{
        System.out.println("执行了父类Student的静态代码块");
    }


    // 构造方法
    public Student() {
        System.out.println("执行了父类Student类的默认的构造方法");
    }


    public Student(String stuName, String strNum) {
        this.stuName = stuName;
        this.strNum = strNum;
        System.out.println("执行了父类Student类的两个参数的构造方法");
    }

    // 行为
    public void doStuding() {
        System.out.println("I am studing...");
    }


}

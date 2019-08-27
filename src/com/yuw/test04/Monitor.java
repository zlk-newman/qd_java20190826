package com.yuw.test04;

public class Monitor extends Student {
    // 属性
    private String stuPosition;
    // 成员变量
    private SubAddress subAddress = new SubAddress(); // 测试成员变量的执行顺序

    // 静态语句块
    static{
        System.out.println("执行了子类Monitor的静态代码块");
    }

    // 非静态语句块
    {
        System.out.println("执行了子类Monitor的非静态代码块");
    }
    // 构造方法

    public Monitor() {
        System.out.println("执行了子类Monitor的默认构造方法");
    }


    // 行为

    /**
     * 管理学生行为
     */
    public void supervise(){
        System.out.println("U should to coding...");
    }
}

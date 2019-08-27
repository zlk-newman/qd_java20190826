package com.yuw.test02;

public class Student {
    // 属性
    private String stuName;
    private String stuAge;
    private double stuScore;

    // 行为
    public void doStuding() {
        System.out.println("I am studing...");
    }

    public void doStuding(String strAddress) {
        System.out.println("I am studing...@" + strAddress);
    }

    public Student() {
        // 当提供了自定义的构造方法之后，
        // jvm默认提供的构造方法就失效了，需要手动显式提供默认的不带参数额构造方法
    }

    public Student(String stuName, String stuAge, double stuScore) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuScore = stuScore;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public double getStuScore() {
        return stuScore;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }
}


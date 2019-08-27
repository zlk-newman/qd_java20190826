package com.yuw.test03;

import org.junit.Test;

public class TestDriver01 {
    @Test
    public void test01() {
        System.out.println("运行结果：" + doSth());
    }

    /**
     * finally语句在return语句之前执行；
     * 也就是执行完finally部分，才能return回主方法；
     * @return
     */
    public int doSth() {
        int i = 0;
        int j = 1;
        try {
            // 可能发生异常的语句块
            return getSum(i++, ++j);
        } catch (Exception e) {
            // 处理异常
            return getSum(i++, ++j);
        } finally {
            // 资源回收
            return getSum(i++, ++j);
        }
    }

    /**
     * 求和子方法
     *
     * @param i
     * @param j
     * @return
     */
    private int getSum(int i, int j) {
        int k = i + j;
        return k;
    }
}

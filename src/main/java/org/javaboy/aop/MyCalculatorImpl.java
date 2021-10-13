package org.javaboy.aop;

import org.springframework.stereotype.Component;

@Component
public class MyCalculatorImpl implements MyCalculator{
    @Action
    public int add(int a, int b) {
        return a+ b;
    }

    @Action
    public void min(int a, int b) {
        System.out.println((a + "-" + b + "=" + (a - b)));
    }
}

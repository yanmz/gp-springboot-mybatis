package com.spring.service.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogArgsAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[advice]准备执行方法: " + method.getName() + ", 参数列表：" + Arrays.toString(args));
    }
}

package com.test.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @author mengll
 * @create 2018-01-11 14:06
 **/
public class HelloProxy implements InvocationHandler{
	private Object target;
	public HelloProxy(Object target){
		this.target = target;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		System.out.println("正式方法执行前可以做一些事情：...");
		result = method.invoke(target,args);
		return result;
	}
}

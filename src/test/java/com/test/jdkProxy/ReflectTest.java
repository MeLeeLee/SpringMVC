package com.test.jdkProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射测试
 *
 * @author mengll
 * @create 2018-01-11 14:29
 **/
public class ReflectTest {
	public void hello(String asdf){
		System.out.println("hello,reflect!!!"+asdf);
	}

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
			InstantiationException, NoSuchMethodException, InvocationTargetException {
		System.out.println(ReflectTest.class.getInterfaces().length);
		System.out.println(Class.forName(ReflectTest.class.getName()).getName());
		ReflectTest reflectTest = (ReflectTest) Class.forName(ReflectTest.class.getName()).newInstance();
		Method method = Class.forName(ReflectTest.class.getName()).getMethod("hello",String.class);
		method.invoke(reflectTest,"qwe");
	}
}

package com.mengll.melelee.component;

import org.junit.Test;

/**
 * Created by Administrator on 2017-12-26.
 */
public class MybatisUtilsTest {
	@Test
	public void getSession() throws Exception {
		MybatisUtils.getSession();
	}
	public Class<?> aClass(){
		return MybatisUtils.class;
	}
}
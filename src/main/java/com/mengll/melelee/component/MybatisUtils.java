package com.mengll.melelee.component;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * MyBatis工具类
 *
 * @author mengll
 * @create 2017-12-26 19:25
 **/
public class MybatisUtils {
	private static SqlSessionFactory factory;
	private static Logger logger= LoggerFactory.getLogger(MybatisUtils.class);
	public static SqlSession getSession(){
		if (factory==null) {
			try {
				factory = new SqlSessionFactoryBuilder()
						.build(Resources.getResourceAsReader("db/SqlMapConfig.xml"));
			} catch (IOException e) {
				logger.error("创建连接池失败：",e);
			}
		}
		return factory.openSession();
	}
}

package com.mengll.melelee.service;

import com.mengll.melelee.DAO.TbApplyConsultationDAO;
import com.mengll.melelee.DTO.TbApplyConsultationEntity;
import com.mengll.melelee.component.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Service层
 *
 * @author mengll
 * @create 2017-12-18 14:04
 **/
@Service
public class MyService {
	public String saveInfo(String msg) {
		System.out.println("save success");
		return "success";
	}

	public TbApplyConsultationEntity getInfoFromDB(long id) {
		SqlSession sqlSession = MybatisUtils.getSession();
		TbApplyConsultationDAO tbApplyConsultationDAO = sqlSession.getMapper(TbApplyConsultationDAO.class);
		TbApplyConsultationEntity tbApplyConsultationEntity = tbApplyConsultationDAO.getInfoById(id);
		return tbApplyConsultationEntity;
	}

	public static void main(String[] args) {
		long a = 1502781641000L;
		System.out.println(new Date(a));
	}
}

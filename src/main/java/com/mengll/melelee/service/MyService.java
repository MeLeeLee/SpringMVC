package com.mengll.melelee.service;

import com.mengll.melelee.DAO.TbApplyConsultationDAO;
import com.mengll.melelee.DAO.TestDao;
import com.mengll.melelee.DTO.TbApplyConsultationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Autowired
	private TbApplyConsultationDAO tbApplyConsultationDAO;
	@Autowired
	private TestDao testDao;

	public TbApplyConsultationEntity getInfoFromDB(long id) {
		TbApplyConsultationEntity tbApplyConsultationEntity = tbApplyConsultationDAO.getInfoById(id);
		return tbApplyConsultationEntity;
	}

	public void saveInfo(TbApplyConsultationEntity tbApplyConsultationEntity) {
		tbApplyConsultationDAO.saveInfo(tbApplyConsultationEntity);
		throw new RuntimeException("test");
	}

	@Transactional
	public void saveTxt(String txt) {
		testDao.saveTxt(txt);
		if (txt.equals("txt")){
			System.out.println(1/0);
		}
	}
}

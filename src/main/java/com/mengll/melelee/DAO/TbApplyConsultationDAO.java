package com.mengll.melelee.DAO;

import com.mengll.melelee.DTO.TbApplyConsultationEntity;

/**
 * 实现类
 *
 * @author mengll
 * @create 2017-12-26 20:20
 **/
public interface TbApplyConsultationDAO {
	public TbApplyConsultationEntity getInfoById(long id);
	public void saveInfo(TbApplyConsultationEntity tbApplyConsultationEntity);
}

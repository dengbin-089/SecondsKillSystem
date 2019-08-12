package com.ahu.SecondsKillSystem.Serveice;

import java.util.List;

import com.ahu.SecondsKillSystem.constant.MsmerchantVo;
import com.ahu.SecondsKillSystem.mapper.MsmerchantDao;
import com.ahu.SecondsKillSystem.entity.Msmerchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("msmerchantService")
public class MsmerchantService {
	
	@Autowired
	MsmerchantDao msmerchantDao ;

	/**
	 * 新增商家信息
	 * @param msmerchant
	 */
	public void insertMsmerchant(Msmerchant msmerchant){
		msmerchantDao.insertMsmerchant(msmerchant);
	}

	/**
	 * 根据ID查询商家信息
	 * @param id
	 * @return
	 */
	public Msmerchant queryMsmerchantByid(int id){
		return msmerchantDao.queryMsmerchantByid(id);
	}

	/**
	 * 更新商家信息
	 * @param msmerchant
	 */
	public void updateMsmerchant(Msmerchant msmerchant){
		msmerchantDao.updateMsmerchant(msmerchant);
	}

	/**
	 * 根据ID删除商家信息
	 * @param id
	 */
	public void deleteMsmerchantbyid(int id){
		msmerchantDao.deleteMsmerchantbyid(id);
	}

	/**
	 * 批量查询商家信息
	 * @param msmerchantVo
	 * @return
	 */
	public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo){
		return msmerchantDao.queryMsmerchantbyvo(msmerchantVo);
	}
}

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
	
	
	public void insertMsmerchant(Msmerchant msmerchant){
		msmerchantDao.insertMsmerchant(msmerchant);
	};
	public Msmerchant queryMsmerchantByid(int id){
		return msmerchantDao.queryMsmerchantByid(id);
	}
	public void updateMsmerchant(Msmerchant msmerchant){
		msmerchantDao.updateMsmerchant(msmerchant);
	};
	public void deleteMsmerchantbyid(int id){
		msmerchantDao.deleteMsmerchantbyid(id);
	};
	
	public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo){
		return msmerchantDao.queryMsmerchantbyvo(msmerchantVo);
	}
}

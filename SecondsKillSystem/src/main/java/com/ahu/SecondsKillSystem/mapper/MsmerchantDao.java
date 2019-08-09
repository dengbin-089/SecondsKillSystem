package com.ahu.SecondsKillSystem.mapper;

import com.ahu.SecondsKillSystem.constant.MsmerchantVo;
import com.ahu.SecondsKillSystem.entity.Msmerchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MsmerchantDao {
	public void insertMsmerchant(Msmerchant msmerchant);
	public Msmerchant queryMsmerchantByid(int id);
	public void updateMsmerchant(Msmerchant msmerchant);
	public void deleteMsmerchantbyid(int id);
	public List<Msmerchant> queryMsmerchantbyvo(MsmerchantVo msmerchantVo);
 }

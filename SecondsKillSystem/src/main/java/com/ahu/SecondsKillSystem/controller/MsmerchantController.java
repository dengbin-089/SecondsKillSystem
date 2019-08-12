package com.ahu.SecondsKillSystem.controller;


import javax.servlet.http.HttpServletRequest;

import com.ahu.SecondsKillSystem.Serveice.MsmerchantService;
import com.ahu.SecondsKillSystem.constant.MsmerchantVo;
import com.ahu.SecondsKillSystem.entity.Msmerchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/msmerchantAction")
public class MsmerchantController {
	
	@Autowired
	MsmerchantService msmerchantService;
	

	@RequestMapping("/toadd")
	public String toadd(){
		return "hello";
	}
	
	@RequestMapping(value = "add")
	public void add(Msmerchant msmerchant){
		msmerchantService.insertMsmerchant(msmerchant);
	}
	
	@RequestMapping("toupdate")
	public String toupdate(HttpServletRequest request,int id){
		Msmerchant msmerchant = msmerchantService.queryMsmerchantByid(id);
		request.setAttribute("msmerchant", msmerchant);
		return "msmerchant/update";
	}
	
	@RequestMapping("update")
	public void update(HttpServletRequest request,Msmerchant msmerchant){
		msmerchantService.updateMsmerchant(msmerchant);
		System.out.println(msmerchant);
	}
	
	@RequestMapping("del")
	public void del(HttpServletRequest request,int id){
		msmerchantService.deleteMsmerchantbyid(id);
	}
	
	@RequestMapping("querybyid")
	public String querybyid(HttpServletRequest request,int id){
		Msmerchant msmerchant = msmerchantService.queryMsmerchantByid(id);
		request.setAttribute("msmerchant", msmerchant);
		return "msmerchant/view";
	}
	
	@RequestMapping("querybyvo")
	public String querybyvo(HttpServletRequest request,MsmerchantVo msmerchantVo){
		List<Msmerchant> list = msmerchantService.queryMsmerchantbyvo(msmerchantVo);
		request.setAttribute("msmerchantlist", list);
		return "msmerchant/list";
	}
	
	
	
	
	
}

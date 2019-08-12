package com.ahu.SecondsKillSystem.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * 商家信息表实体
 */
@Data
public class Msmerchant implements Serializable {
	private static final long serialVersionUID = 732298146760455085L;
	/**
	 * 商家表主键
	 */
	private int id;
	/**
	 * 商家姓名
	 */
	private String merchantName;
	/**
	 * 商家账号
	 */
	private String merchantAccount;
	/**
	 * 商家密码
	 */
	private String merchantPassword;
	/**
	 * 经营范围
	 */
	private String merchantScope;
	/**
	 * 商家店铺名称
	 */
	private String merchantShopName;
}

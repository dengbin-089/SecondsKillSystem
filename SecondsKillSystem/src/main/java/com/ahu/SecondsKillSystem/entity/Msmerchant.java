package com.ahu.SecondsKillSystem.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Msmerchant implements Serializable {
	private static final long serialVersionUID = 732298146760455085L;
	private int id;
	private String merchantName;
	private String merchantAccount;
	private String merchantPassword;
	private String merchantScope;
	private String merchantShopName;
}

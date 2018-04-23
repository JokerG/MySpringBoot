package com.joker.springboot.service.VO;

import com.alibaba.fastjson.JSONArray;
import com.joker.springboot.base.entity.UpmsPermission;

import java.io.Serializable;


public class UpmsPermissionVO extends UpmsPermission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSONArray permissions;

	public JSONArray getPermissions() {
		return permissions;
	}

	public void setPermissions(JSONArray permissions) {
		this.permissions = permissions;
	}

}

package com.joker.springboot.biz.mapper;

import com.joker.springboot.base.dao.entity.UpmsPermission;

import java.util.List;

public interface UpmsPermissionBizMapper {
	/**
	 * 根据登录账号查询用户权限,不包含按钮
	 * 
	 * @param loginId
	 * @return
	 *
	 */
	List<UpmsPermission> queryUserMenusByLoginId(String loginId);
}


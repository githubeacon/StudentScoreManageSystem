package com.beacon.sms.service;

import javax.servlet.http.HttpServletRequest;

import com.beacon.sms.bean.Admin;
import com.beacon.sms.dao.LoginDao;
import com.beacon.sms.utils.ValidateCodeUtil;

/**
 * 
 * 作者:beacon 
 * 创建日期:2017年10月22日上午9:32:44 
 * 描述:登录的逻辑类
 */
public class LoginService {
	private LoginDao loginDao;
	private ValidateCodeUtil validateCodeUtil;
	
	public boolean isExist(String userName, String password) {
		String checkPassword = loginDao.getPassword(userName);
		if (checkPassword != null && password.equals(checkPassword)) {
			return true;
		}
		return false;
	}

	public boolean isRightCode(HttpServletRequest request, String validateCode) {

		return validateCodeUtil.checkValidateCode(request, validateCode);
	}
	
	public void updatePassword(String userName,String password){
		loginDao.updatePassword(userName, password);
	}
	public Admin getAdmin(String userName,String password){
		return loginDao.getAdmin(userName, password);
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public ValidateCodeUtil getValidateCodeUtil() {
		return validateCodeUtil;
	}

	public void setValidateCodeUtil(ValidateCodeUtil validateCodeUtil) {
		this.validateCodeUtil = validateCodeUtil;
	}

}

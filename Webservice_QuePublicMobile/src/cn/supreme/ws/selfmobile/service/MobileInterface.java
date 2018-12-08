package cn.supreme.ws.selfmobile.service;

import javax.jws.WebService;

@WebService
public interface MobileInterface {

	public String query(String mobile);
}

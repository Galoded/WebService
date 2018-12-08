package cn.supreme.ws.selfmobile.service;

import cn.supreme.ws.publicmobile.service.MobileCodeWSSoap;

public class MobileInterfaceImpl implements MobileInterface {

	private MobileCodeWSSoap mobileCodeWs ;
	
	public MobileCodeWSSoap getMobileCodeWs() {
		return mobileCodeWs;
	}

	public void setMobileCodeWs(MobileCodeWSSoap mobileCodeWs) {
		this.mobileCodeWs = mobileCodeWs;
	}

	@Override
	public String query(String mobile) {
		String info = mobileCodeWs.getMobileCodeInfo(mobile, null);
		return info;
	}

}

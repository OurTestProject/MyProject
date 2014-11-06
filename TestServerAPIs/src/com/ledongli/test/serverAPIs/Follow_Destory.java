package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;



public class Follow_Destory {
	
	private List<NameValuePair> follow_destory;
	
	public List<NameValuePair> getFollow_destory() {
		return follow_destory;
	}

	public Follow_Destory() {
		follow_destory=new ArrayList<NameValuePair>();
		
		//定义Post参数
		follow_destory.add(new BasicNameValuePair("app","api"));
		follow_destory.add(new BasicNameValuePair("mod","User"));
		follow_destory.add(new BasicNameValuePair("act","follow_destroy"));
		follow_destory.add(new BasicNameValuePair("uid","2949163"));
		follow_destory.add(new BasicNameValuePair("password","123456"));
		follow_destory.add(new BasicNameValuePair("user_id","2"));
	}
	
	public String getExpectedResult() {
		String result="{\"following\":0,\"follower\":0}";
		return result;
	}
	
}

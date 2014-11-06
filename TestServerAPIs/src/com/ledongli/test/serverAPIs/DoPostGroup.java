package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class DoPostGroup {
	
	private List<NameValuePair> doPost;

	public List<NameValuePair> getDoPost() {
		return doPost;
	}
	
	public DoPostGroup() {
		doPost=new ArrayList<NameValuePair>();
		
		//定义Post参数
		doPost.add(new BasicNameValuePair("app","api"));
		doPost.add(new BasicNameValuePair("mod","group"));
		doPost.add(new BasicNameValuePair("act","doPost"));
		doPost.add(new BasicNameValuePair("uid","2949163"));
		doPost.add(new BasicNameValuePair("password","123456"));
		doPost.add(new BasicNameValuePair("weiba_id","1000000"));
		doPost.add(new BasicNameValuePair("content","This is Test"));
		doPost.add(new BasicNameValuePair("title","Test Title"));
		
		//可选参数
		//doPost.add(new BasicNameValuePair("imgUrls",""));
	}
}

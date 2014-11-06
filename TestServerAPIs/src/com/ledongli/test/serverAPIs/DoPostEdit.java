package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class DoPostEdit {
	
	private List<NameValuePair> doPostEdit;

	public List<NameValuePair> getDoPostEdit() {
		return doPostEdit;
	}
	
	public DoPostEdit() {
		
		doPostEdit=new ArrayList<NameValuePair>();
		
		//定义Post参数
		doPostEdit.add(new BasicNameValuePair("app","api"));
		doPostEdit.add(new BasicNameValuePair("mod","group"));
		doPostEdit.add(new BasicNameValuePair("act","doPostEdit"));
		doPostEdit.add(new BasicNameValuePair("uid","1"));
		doPostEdit.add(new BasicNameValuePair("password","111"));
		doPostEdit.add(new BasicNameValuePair("weiba_id",""));
		doPostEdit.add(new BasicNameValuePair("post_id",""));
		doPostEdit.add(new BasicNameValuePair("content",""));
		doPostEdit.add(new BasicNameValuePair("title",""));
		doPostEdit.add(new BasicNameValuePair("imgUrls",""));
	}
	
	public String getExpectedResult() {
			
			String result="";
			
			return result;
	}
}

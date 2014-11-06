package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class PostList {
	
	private List<NameValuePair> postList;

	public List<NameValuePair> getPostList() {
		return postList;
	}
	
	public PostList() {
		
		postList=new ArrayList<NameValuePair>();
		
		//定义Post参数
		postList.add(new BasicNameValuePair("app","api"));
		postList.add(new BasicNameValuePair("mod","group"));
		postList.add(new BasicNameValuePair("act","postList"));
		postList.add(new BasicNameValuePair("uid","1"));
		postList.add(new BasicNameValuePair("password","111"));
		postList.add(new BasicNameValuePair("weiba_id",""));
		postList.add(new BasicNameValuePair("page",""));
	}
	
	public String getExpectedResult() {
		
		String result="";
		
		return result;
	}
}

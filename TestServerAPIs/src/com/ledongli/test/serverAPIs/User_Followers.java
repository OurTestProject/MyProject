package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class User_Followers {
	
	private List<NameValuePair> user_followers;
	
	public List<NameValuePair> getUser_followers() {
		return user_followers;
	}

	public User_Followers() {
		
		user_followers=new ArrayList<NameValuePair>();
		user_followers.add(new BasicNameValuePair("app","api"));
		user_followers.add(new BasicNameValuePair("mod","User"));
		user_followers.add(new BasicNameValuePair("act","user_followers"));
		user_followers.add(new BasicNameValuePair("uid","2949163"));
		user_followers.add(new BasicNameValuePair("password","123456"));
		user_followers.add(new BasicNameValuePair("user_id","2949163"));
	}
	
	public String getExpectedResult() {
		String result="";
		return result;
	}
	
	
}

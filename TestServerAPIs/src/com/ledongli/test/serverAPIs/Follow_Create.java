package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class Follow_Create {
	//关注一个用户 follow_create
		private List<NameValuePair> follow_create;
		
		public Follow_Create() {
			follow_create=new ArrayList<NameValuePair>();
			
			//定义Post参数
			follow_create.add(new BasicNameValuePair("app","api"));
			follow_create.add(new BasicNameValuePair("mod","User"));
			follow_create.add(new BasicNameValuePair("act","follow_create"));
			follow_create.add(new BasicNameValuePair("uid","2949163"));
			follow_create.add(new BasicNameValuePair("password","123456"));
			follow_create.add(new BasicNameValuePair("user_id","2"));

		}
		
		public List<NameValuePair> getFollow_create() {
			
			return follow_create;
		}
		
		public String getExpectedResult() {
			
			String result="{\"following\":1,\"follower\":0}";
			
			return result;
		}
		
		
}

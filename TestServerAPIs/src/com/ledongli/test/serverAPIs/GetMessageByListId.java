package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class GetMessageByListId {
	
	private List<NameValuePair> messageByListId;

	public List<NameValuePair> getMessageByListId() {
		return messageByListId;
	}
	
	public GetMessageByListId() {
		messageByListId=new ArrayList<NameValuePair>();
		
		//����Post����
		messageByListId.add(new BasicNameValuePair("app","api"));
		messageByListId.add(new BasicNameValuePair("mod","Message"));
		messageByListId.add(new BasicNameValuePair("act","getMessageByListId"));
		messageByListId.add(new BasicNameValuePair("uid","2949163"));
		messageByListId.add(new BasicNameValuePair("password","123456"));
		
		//��Ҫ֪������Id
		//messageByListId.add(new BasicNameValuePair("id",""));
		
		//��ѡ����
//		messageByListId.add(new BasicNameValuePair("since_id",""));
		
//		messageByListId.add(new BasicNameValuePair("max_id",""));
		
	}
}

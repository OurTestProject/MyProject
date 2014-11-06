package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class GetEditorImg {
	
	private List<NameValuePair> editorImg;

	public List<NameValuePair> getEditorImg() {
		return editorImg;
	}
	
	public GetEditorImg() {
		
		editorImg=new ArrayList<NameValuePair>();
		
		//定义Post参数
		editorImg.add(new BasicNameValuePair("app","api"));
		editorImg.add(new BasicNameValuePair("mod","group"));
		editorImg.add(new BasicNameValuePair("act","getEditorImg"));
		editorImg.add(new BasicNameValuePair("uid","10744"));
		editorImg.add(new BasicNameValuePair("password","C9D9BF15-627F-44FB-9E59-D83FE3403DD6"));
		editorImg.add(new BasicNameValuePair("weiba_id","1001"));
		editorImg.add(new BasicNameValuePair("post_id","3253"));
	}
	
	public String getExpectedResult() {
		
		String result="";
		
		return result;
	}
}

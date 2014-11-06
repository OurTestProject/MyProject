package com.ledongli.test.serverAPIs;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class SaveEditorImg {
	
	private List<NameValuePair> saveEditorImg;

	public List<NameValuePair> getSaveEditorImg() {
		return saveEditorImg;
	}
	
	public SaveEditorImg() {
		
		saveEditorImg=new ArrayList<NameValuePair>();
		
		//定义Post参数
		saveEditorImg.add(new BasicNameValuePair("app","api"));
		saveEditorImg.add(new BasicNameValuePair("mod","group"));
		saveEditorImg.add(new BasicNameValuePair("act","saveEditorImg"));
		saveEditorImg.add(new BasicNameValuePair("uid","1"));
		saveEditorImg.add(new BasicNameValuePair("password","111"));
		saveEditorImg.add(new BasicNameValuePair("imgFile",""));
	}
	
	public String getExpectedResult() {
		
		String result="";
		
		return result;
	}
}

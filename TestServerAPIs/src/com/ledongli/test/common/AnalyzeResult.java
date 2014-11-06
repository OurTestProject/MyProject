package com.ledongli.test.common;

import org.json.JSONArray;
import org.json.JSONObject;

public class AnalyzeResult {
	
	private String content;
	private JSONObject jsonObject;
	
	public AnalyzeResult(String _content) {
		this.content=_content;
	}
	
	public String getValue(String parameter) {
		try {
			String finalContentString=content.substring(content.indexOf('{'));
			jsonObject=new JSONObject(finalContentString);
			int value=jsonObject.getInt(parameter);
			
			//String value=jsonObject.getString(parameter);
			return String.valueOf(value);
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
}

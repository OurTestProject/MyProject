package com.ledongli.test.cases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ledongli.test.common.AnalyzeResult;
import com.ledongli.test.common.NetworkService;
import com.ledongli.test.serverAPIs.DoDelete;
import com.ledongli.test.serverAPIs.DoPost;

public class DoDeleteTest {
	
	private NetworkService networkService;
	private DoDelete doDelete;
	private DoPost doPost;
	private String urlString;
	private AnalyzeResult analyzeResult;
	
	@Before
	public void setUp() throws Exception {
		networkService=new NetworkService();
		//doDelete=new DoDelete();
		doPost=new DoPost();
		urlString=networkService.getServer_staging();
		
	}

	@After
	public void tearDown() throws Exception {
		networkService=null;
		doDelete=null;
		doPost=null;
	}

	@Test
	public void test() {
		
		//创建新帖子
		try {
			
			String content=networkService.sendPost(urlString, doPost.getDoPost());		
			analyzeResult=new AnalyzeResult(content);
			String list_id=analyzeResult.getValue("list_id");
			doDelete=new DoDelete(list_id);
			String result=networkService.sendPost(urlString, doDelete.getDoDelete());
			
			assertEquals("{\"status\":1}", result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
	}
	
	
}

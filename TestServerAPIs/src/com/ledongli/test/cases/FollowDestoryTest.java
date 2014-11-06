package com.ledongli.test.cases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ledongli.test.common.NetworkService;
import com.ledongli.test.serverAPIs.Follow_Destory;

public class FollowDestoryTest {
	
	private NetworkService networkService;
	private String url;
	private Follow_Destory follow_Destory;
	
	@Before
	public void setUp() throws Exception {
		networkService=new NetworkService();
		url=networkService.getServer_staging();
		follow_Destory=new Follow_Destory();
	}

	@After
	public void tearDown() throws Exception {
		networkService=null;
		follow_Destory=null;
	}

	@Test
	public void test() {
		try {
			String actualResult=networkService.sendPost(url, follow_Destory.getFollow_destory());
			String expectResult=follow_Destory.getExpectedResult();
			assertEquals(expectResult, actualResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
	}

}

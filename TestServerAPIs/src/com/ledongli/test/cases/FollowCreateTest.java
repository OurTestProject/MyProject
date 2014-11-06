package com.ledongli.test.cases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ledongli.test.common.NetworkService;
import com.ledongli.test.serverAPIs.Follow_Create;

public class FollowCreateTest {
	
	
	private NetworkService networkService;
	private String url;
	
	private Follow_Create follow_Create;
	@Before
	public void setUp() throws Exception {
		follow_Create=new Follow_Create();
		networkService=new NetworkService();
		url=networkService.getServer_staging();
	}

	@After
	public void tearDown() throws Exception {
		follow_Create=null;
		networkService=null;
	}

	@Test
	public void test() {
		try {
			String actualResult=networkService.sendPost(url, follow_Create.getFollow_create());
			String expectResult=follow_Create.getExpectedResult();
			assertEquals(expectResult, actualResult);
		} catch (Exception e) {
			
			fail(e.getMessage());
		}
		
	}

}

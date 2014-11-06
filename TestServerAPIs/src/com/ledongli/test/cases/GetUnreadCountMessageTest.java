package com.ledongli.test.cases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ledongli.test.common.NetworkService;
import com.ledongli.test.serverAPIs.GetUnreadCount_Message;

public class GetUnreadCountMessageTest {
	
	GetUnreadCount_Message getUnreadCount_Message;
	NetworkService networkService;
	String url;
	
	@Before
	public void setUp() throws Exception {
		networkService=new NetworkService();
		url=networkService.getServer_staging();
		getUnreadCount_Message=new GetUnreadCount_Message();
	}

	@After
	public void tearDown() throws Exception {
		networkService=null;
		getUnreadCount_Message=null;
	}

	@Test
	public void test() {
		try {
			String actualString=networkService.sendPost(url, getUnreadCount_Message.getUnReadCount());
			boolean result=actualString.contains("unread_notify");
			assertTrue(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

}

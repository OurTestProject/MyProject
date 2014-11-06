package com.ledongli.test.cases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ledongli.test.common.NetworkService;
import com.ledongli.test.serverAPIs.User_Friends;

public class UserFriendsTest {
	
	private String url;
	private NetworkService networkService;
	private User_Friends user_Friends;
	
	@Before
	public void setUp() throws Exception {
		networkService=new NetworkService();
		url=networkService.getServer_staging();
		user_Friends=new User_Friends();
	}

	@After
	public void tearDown() throws Exception {
		networkService=null;
		user_Friends=null;
	}

	@Test
	public void test() {
		try {
			String actString=networkService.sendPost(url, user_Friends.getUser_friends());
			if(actString=="[]")
				assertTrue(true);
			else {
				boolean result=actString.contains("follow_id");
				assertTrue(result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
	}

}

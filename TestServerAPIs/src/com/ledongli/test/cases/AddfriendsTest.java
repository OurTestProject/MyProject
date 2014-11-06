package com.ledongli.test.cases;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ledongli.test.common.AnalyzeResult;
import com.ledongli.test.common.NetworkService;
import com.ledongli.test.serverAPIs.AddUser;
import com.ledongli.test.serverAPIs.Addfriends;

public class AddfriendsTest {
	
	private Addfriends addfriends;
	private NetworkService networkService;
	private String url;
	private AddUser addUser;
	private AnalyzeResult analyzeResult;
	
	@Before
	public void setUp() throws Exception {
		
		networkService=new NetworkService();
		url=networkService.getServer_io_staging();
		addUser=new AddUser();
		
	}

	@After
	public void tearDown() throws Exception {
		addfriends=null;
		networkService=null;
	}

	@Test
	public void testGetAddfriendsList(){
		
		try {
			String firstResultString=networkService.sendPost(url, addUser.getAddUser());
			String secondResultString=networkService.sendPost(url,addUser.getAddUser());
			
			analyzeResult=new AnalyzeResult(firstResultString);
			String first_uid=analyzeResult.getValue("uid");
			
			analyzeResult=new AnalyzeResult(secondResultString);
			String second_uid=analyzeResult.getValue("uid");
			
			int friend1=Integer.parseInt(first_uid);
			int friend2=Integer.parseInt(second_uid);
			
			int[] friend={friend1,friend2};
			addfriends=new Addfriends(friend);
			String result=networkService.sendPost(url, addfriends.getAddfriendsList());
			boolean value=result.contains("\"status\":\"OK\"");
			assertTrue(value);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
		
	}
	
	

	
}

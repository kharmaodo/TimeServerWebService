package com.potatosoft;

import com.potatosoft.TimeServerWebService.client.TimeServer;
import com.potatosoft.TimeServerWebService.client.TimeServerImplService;

/**
 * SOAP WebService client for TimeServer
 * This client use client library which is generated by wsimport.
 * 
 * @author wonhee.jung
 *
 */
public class TimeClientWithClientLibrary {

	public static void main(String[] args) {
		
		TimeServerImplService service = new TimeServerImplService();
		TimeServer eif = service.getTimeServerImplPort();
		
		System.out.println(eif.getTimeAsString());
		System.out.println(eif.getTimeAsElapsed());
	}

}

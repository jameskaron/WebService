package com.soap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.type.SReturnVO;
import com.type.SnotifyUserInfoParaVO;

public class Run {

	public static void main(String[] args) {
		ApplicationContext ap = new FileSystemXmlApplicationContext("WebContent/WEB-INF/applicationContext.xml");
		ScfPccSoapServiceEndpoint scf = (ScfPccSoapServiceEndpoint) ap.getBean("ScfPccSoap");
//		String content = readToString("C:/Users/80575749/Desktop/OnePNS/web.xml");
		String content = createXml("-------test-------");
		SnotifyUserInfoParaVO inPara = new SnotifyUserInfoParaVO();
		inPara.setContent(content);
		
		String result = null;
		SReturnVO vo = scf.notifyUserInfo(inPara);
		result = vo.getResultDesc();
		
		System.out.println(result);
		
		
	}
	
	     
	 
	 public static String createXml(String name) {

		    StringBuffer sb = new StringBuffer();
		    sb.append("<?xml version='1.0' encoding='UTF-8'?>");
		    sb.append("<Result>");
		    sb.append("<cinamaName>机械战警</cinamaName>");
		    sb.append("<director>" + name + "</director>");
		    sb.append("<introduce>一部好莱坞大片，3D观影，不错！！！</introduce>");
		    sb.append("<price>25</price>");
		    sb.append("</Result>");
		    return sb.toString();
		  }
	
}

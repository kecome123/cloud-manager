package com.xunfang.core.startup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) throws IOException{
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/provider.xml"});
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		context.start();
	//	System.in.read();  
System.out.println("core-service已启动.......");
		InputStreamReader ir = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(ir);
		String str = "";
		while(true) {
			str = br.readLine();     
			if(str.equals("xuke")) {      // 输入xuke退出 rtrter
				context.close();
				break;
			}
		}
    }
    
}

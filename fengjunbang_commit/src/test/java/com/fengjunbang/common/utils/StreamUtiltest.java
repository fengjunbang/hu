package com.fengjunbang.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

public class StreamUtiltest {
	
	
	
	private static final Closeable Closeable = null;





	@Test
	public void CS() {    //测试类正常
		String readTxt = readTxt("E:\\天啊.txt");
		System.out.println(readTxt);
	}
	

/*	public static void readTextFilecs(){
		
		String string = readTextFile();
		System.out.println(string);
		
	}*/
	@Test
	public  void readTextFile(){   //上边方法重载
		
		String readTxt = readTxt1("E:\\\\天啊.txt");
		
		System.out.println(readTxt);
	}
	

	
	
	 
	public static void closeIO(Closeable closeable) {   //文件关闭流
	
		try {
			if (closeable != null) {

				closeable.close();
				
				System.out.println("已经关闭流");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	   public static String readTxt(String filePath) {// D:\\a.txt
	        StringBuilder result = new StringBuilder();
	        try {
//	          BufferedReader bfr = new BufferedReader(new FileReader(new File(filePath)));
	            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)), "UTF-8"));
	            String lineTxt = null;
	            while ((lineTxt = bfr.readLine()) != null) {
	                result.append(lineTxt).append("\n");
	            }
	            
	            closeIO(bfr);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result.toString();
	    }
	   
	   
	   
	   
	   
	   public static String readTxt1(String filePath) {// 读取和关闭两个方法结合的
	        StringBuilder result = new StringBuilder();
	        try {
//	          BufferedReader bfr = new BufferedReader(new FileReader(new File(filePath)));
	            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath)), "UTF-8"));
	            String lineTxt = null;
	            while ((lineTxt = bfr.readLine()) != null) {
	                result.append(lineTxt).append("\n");
	            }
	            
	           bfr.close();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result.toString();
	    }

	

}

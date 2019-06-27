package com.fengjunbang.common.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamUtil {
	

	
	 
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

	

}

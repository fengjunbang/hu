package com.fengjunbang.common.utils;

public class FileUtil {
	
	
	public static String  str(String name) {  //根据文件名输出扩展名的 方法
		
		String extName = name.substring(name.lastIndexOf(".")+1);   //以点为分割点进行分割

		return extName;    //返回扩展名
	}
}

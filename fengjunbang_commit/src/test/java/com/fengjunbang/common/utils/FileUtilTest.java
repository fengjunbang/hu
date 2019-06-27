package com.fengjunbang.common.utils;

import org.junit.Test;

public class FileUtilTest {
	
	
	@Test
	public void testKZ() {   //测试类正常
		String str = str("aa.jpg");
		System.out.println("扩展名是："+str);
		
	}

	
	
	public static String  str(String name) {  //根据文件名输出扩展名的 方法
		
		String extName = name.substring(name.lastIndexOf(".") + 1);   //以点为分割点进行分割

		return extName;    //返回扩展名
	}
}

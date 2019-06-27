package com.fengjunbang.common.utils;

import org.junit.Test;

public class Final1 {
	
	
	
	public static String op() {  //最后一题拼接和替换
		
		DateUtil d = new DateUtil();
		
		String s= d.getMonthBegin("2018-6-6");
		
		String s2 = d.getMonthEnd("2019-5-5");
		
		String sql = "select * from t_order where create_time>='"+s+"' and create_time<='"+s2+"' ";
	
		return sql;
	}

}

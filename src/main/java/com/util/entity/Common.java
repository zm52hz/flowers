package com.util.entity;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class Common {

	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static Timestamp createDate(){
		return new Timestamp(System.currentTimeMillis());
	}
	
	public static String createDate(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(System.currentTimeMillis());
	}
}

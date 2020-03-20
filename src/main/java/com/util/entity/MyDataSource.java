package com.util.entity;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;

import javax.management.RuntimeErrorException;


public class MyDataSource {

	private static String url=null;
	private static String password=null;
	private static String user=null;
	private static String DriverClass=null;
	private static LinkedList<Connection> pool = new LinkedList<Connection>();
	
	//注册数据驱动
	static{
		try{
			InputStream in=MyDataSource.class.getClassLoader().getResourceAsStream("db.properties");
			Properties prop=new Properties();
			prop.load(in);
			user=prop.getProperty("user");
			url=prop.getProperty("url");
			password=prop.getProperty("password");
			DriverClass=prop.getProperty("DriverClass");
			Class.forName(DriverClass);
		}catch(Exception e){
			throw new  RuntimeException(e);
		}
	}
	//初始化建立数据连接池
	public MyDataSource(){
		for(int i=0;i<10;i++){
			try{
				Connection conn=DriverManager.getConnection(url,user,password);
				pool.add(conn);
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	//从连接池获取连接
	public Connection getConnection() throws SQLException{
		return pool.remove();
	}
	//回收连接对象
	public void release(Connection conn){
		System.out.println(conn+"被回收");
	}
	public int getLength(){
		return pool.size();
	}
}


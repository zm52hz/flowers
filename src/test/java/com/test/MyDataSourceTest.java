package com.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.util.entity.MyDataSource;

public class MyDataSourceTest {

	//获取数据库连接池中的所有连接
    @Test
    public void Test(){
    	MyDataSource mds=new MyDataSource();
    	Connection conn=null;
    	try{
    		for(int i=0;i<10;i++){
    			conn=mds.getConnection();
    			System.out.println(conn+"被获取；连接池还有："+mds.getLength());
    		    mds.release(conn);
    		}
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    }
}

package com.imesomeone.crudapi.dao;

import java.util.HashMap;
import java.util.Map;

public class MyDao {

	private static Map<Integer,String> data;
	
	static{
		data =  new HashMap<Integer,String>();
		data.put(1, "One");
		data.put(2,"Two" );
		data.put(3,"Three" );
		data.put(4,"Four" );
		data.put(5,"Five" );
	}
	
	public static Map<Integer,String> getAll(){
		return data;
	}
	
	public static String get(Integer key){
		return data.get(key);
	}
	
	public static String update(Integer key,String value){
		return data.put(key,value);
	}
	
	public static String add(Integer key,String value){
		return data.putIfAbsent(key,value);
	}
	
	public static void delete(Integer key){
		data.remove(key);
	}
	
	
}

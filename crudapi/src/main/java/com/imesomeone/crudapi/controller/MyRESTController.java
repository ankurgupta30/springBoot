package com.imesomeone.crudapi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imesomeone.crudapi.dao.MyDao;

@RestController()
@RequestMapping("api/v1/")
public class MyRESTController {

	@RequestMapping(value="names/list", method=RequestMethod.GET)
	public Map<Integer,String> list(){
		return MyDao.getAll();
	}
	
	@RequestMapping(value="names/{id}", method=RequestMethod.GET)
	public String find(@PathVariable Integer id){
		return MyDao.get(id);
	}
	
	@RequestMapping(value="names/{id}", method=RequestMethod.POST)
	public String add(@PathVariable Integer id,@RequestBody String value){
		return MyDao.add(id,value);
	}
	
	@RequestMapping(value="names/{id}", method=RequestMethod.PUT)
	public String update(@PathVariable Integer id, @RequestBody String value){
		return MyDao.update(id, value);
	}
	
	@RequestMapping(value="names/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Integer id){
		MyDao.delete(id);
	}
}

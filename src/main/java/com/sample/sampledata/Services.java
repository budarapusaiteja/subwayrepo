package com.sample.sampledata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Services implements ServiceInterface{
	@Autowired
	JpaData i;
	public University getid(Integer j){
		try {
		if(i.findById(j)==null) {
			throw new custexception2("id not present, cannot enter the correct input");
		}
		}
		catch(custexception2 c) {
			System.out.println("id not found"+c);
		}
		return i.findById(j).get();
	} 
}

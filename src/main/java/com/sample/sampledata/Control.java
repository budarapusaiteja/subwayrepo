package com.sample.sampledata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Control {
	@Autowired
	Services s;
	@GetMapping("/getbyid/{id}")
	public University getby(@PathVariable int id) throws custexception2 {
		University u=s.getid(id);
		return u;
	}
	
}

package com.Aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveAlien {

	@Autowired
	private AlienRepo repo;

	@GetMapping("saveAlien")
	public String addAlien() {
		alien a = new alien();
		a.setMobile(2);
		a.setName("Aryan kamboj");
		a.setMarks(100);

		repo.save(a); // Save that data to MySQL!
		return "Alien saved successfully!";
	}
}

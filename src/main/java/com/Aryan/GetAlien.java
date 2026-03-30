package com.Aryan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This tells Spring that this file is "listening" for web requests.
public class GetAlien {

	@Autowired
	private AlienRepo repo;

	@GetMapping("aliens")
	public List<alien> getAliens() {
		return (List<alien>) repo.findAll();
	}
}

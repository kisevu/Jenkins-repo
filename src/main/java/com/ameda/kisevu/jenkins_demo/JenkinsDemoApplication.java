package com.ameda.kisevu.jenkins_demo;

import com.ameda.kisevu.jenkins_demo.dto.PersonDTO;
import com.ameda.kisevu.jenkins_demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/kevin")
@RequiredArgsConstructor
public class JenkinsDemoApplication {
private final PersonService service;
	@PostMapping("/save")
	public ResponseEntity<?> savePerson(@RequestBody PersonDTO dto){
		return new ResponseEntity<>(service.savePerson(dto),
				HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<?> retrievePeople(){
		return new ResponseEntity<>(service.retrievePeople(),HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}

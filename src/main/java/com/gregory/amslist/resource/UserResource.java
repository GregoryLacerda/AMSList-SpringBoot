package com.gregory.amslist.resource;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gregory.amslist.entities.User;
import com.gregory.amslist.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}") // o value para que a requisição aceite uma informação, o di
	public ResponseEntity<User> findById(@PathVariable Long id) { // @PathVariable é para aceitar o parametro que vem da url
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}

package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.user.UsersRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersResource {

	@Autowired
	UsersRepository usersRepository;

	@GetMapping(value = "/all")
	public List<Users> getAll() {
		return usersRepository.findAll();
     
	}

	@PostMapping(value = "/load")
	public Map<String,String> persist(@RequestBody final Users users) {
		usersRepository.save(users);
		Map<String, String> temp = new HashMap<String, String>();
		temp.put("username", users.getUsername());
		return temp;
	}

	@PutMapping("/update/")
	public String updateUser(@RequestBody Users users) {
		Users user = usersRepository.findById(users.getId()).get();
		user.setPassword(users.getPassword());
		usersRepository.save(user);
		return "Successful";
	}

	@DeleteMapping("/delete")
	public String deleteUser(@RequestBody Users users) {
		usersRepository.deleteById(users.getId());
		return "Successful";
	}

}

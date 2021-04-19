package com.cg.springboot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping(value="/users")
	public String getUserList() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-API-Version", "1");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange("http://localhost:8082/api/users", HttpMethod.GET, entity, String.class)
				.getBody();
	}

	@GetMapping(value = "/users/{id}")
	public User getUser(@PathVariable("id") long id) {
		Map<String, Long> uriParam = new HashMap<>();
		uriParam.put("id", id);
		/*return restTemplate.exchange("http://localhost:8092/api/v1/users/" + id, HttpMethod.GET, entity, String.class)
			.getBody();*/
		User user = restTemplate.getForObject("http://localhost:8082/api/v1/users/{id}", User.class, uriParam);
		return user;
	}
	
	@PostMapping(value="/users")
	public String adduser(@RequestBody User user) {
		return restTemplate.postForObject("http://localhost:8082/api/v1/users", user, String.class);
	}
}

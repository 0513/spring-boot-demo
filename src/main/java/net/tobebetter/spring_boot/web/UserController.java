package net.tobebetter.spring_boot.web;

import java.util.List;

import javax.annotation.Resource;

import net.tobebetter.spring_boot.model.User;
import net.tobebetter.spring_boot.repository.UserRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/users")
public class UserController {
	@Resource
	UserRepository userRepository;
	
	@RequestMapping()
	public List<User> findAll(){
		return (List<User>) userRepository.findAll();
	}
}

package com.login.springsecurity;

import com.login.springsecurity.entities.Role;
import com.login.springsecurity.entities.User;
import com.login.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}

	public void run(String... args){
	User adminAccount = userRepository.findByRole(Role.ADMIN);
	if(adminAccount == null){
		User user = new User();
		user.setFirstname("admin");
		user.setSecondname("admin");
		user.setEmail("admin@gamil.com");
		user.setRole(Role.ADMIN);
		user.setPassword(new BCryptPasswordEncoder().encode("admin"));
		userRepository.save(user);
	}
	}

}

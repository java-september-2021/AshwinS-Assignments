package com.codingdojo.loginReg.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.codingdojo.loginReg.models.User;
import com.codingdojo.loginReg.repositories.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}	
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("password", "Match", "Passwords do not match!");
		}
		
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "Email has already been taken!");
		}
		
		if(user.getFirstName().equals("Matt")) {
			errors.rejectValue("firstName", "noMattsAllowed", "Matts are unable to register at this time!");
		}
		
		
	}
}

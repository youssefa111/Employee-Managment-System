package net.javaguides.springbootthymeleafcrudwebapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springbootthymeleafcrudwebapp.dto.UserRegistrationDto;
import net.javaguides.springbootthymeleafcrudwebapp.model.User;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}

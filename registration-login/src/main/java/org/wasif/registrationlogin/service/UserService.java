package org.wasif.registrationlogin.service;

import org.wasif.registrationlogin.model.User;
import org.wasif.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}

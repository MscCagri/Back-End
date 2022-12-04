package com.hoaxify.ws.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;
    public void save(User user) {
        this.passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}

package net.tobebetter.spring_boot.user.service;

import net.tobebetter.spring_boot.user.model.Role;
import net.tobebetter.spring_boot.user.model.User;
import net.tobebetter.spring_boot.user.repository.RoleRepository;
import net.tobebetter.spring_boot.user.repository.UserRepository;
import net.tobebetter.spring_boot.util.HashCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    public void save(User user) {
        user.setPassword(HashCrypt.getDigestHash(user.getPassword()));
        user.setRoles(new HashSet<Role>(roleRepository.findAll()));
        userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

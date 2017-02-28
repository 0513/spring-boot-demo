package net.tobebetter.spring_boot.user.repository;

import net.tobebetter.spring_boot.user.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
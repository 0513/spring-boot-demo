package net.tobebetter.spring_boot.repository;

import net.tobebetter.spring_boot.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
	
}
package net.tobebetter.spring_boot.user.repository;

import net.tobebetter.spring_boot.user.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}

package net.javaguides.springbootthymeleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springbootthymeleafcrudwebapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
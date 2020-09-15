/**
 * 
 */
package com.ven.usersecurityservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ven.usersecurityservice.domain.User;

/**
 * @author Kapil
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserName(String userName);
}

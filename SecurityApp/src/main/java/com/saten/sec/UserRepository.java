package com.saten.sec;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author satendra.malviya
 */

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}

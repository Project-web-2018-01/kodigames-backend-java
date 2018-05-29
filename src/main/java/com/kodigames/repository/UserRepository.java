package com.kodigames.repository;

import com.kodigames.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User update(User user, Long id);
}

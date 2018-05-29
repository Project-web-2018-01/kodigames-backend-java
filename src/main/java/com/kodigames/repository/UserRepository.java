package com.kodigames.repository;

import com.kodigames.domain.User;
import com.kodigames.domain.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User update(Long id, UserDto userDto);
}

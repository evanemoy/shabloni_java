package ru.practic22;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
  @Query("select b from User b where b.name=?1")
  Optional<User> getUserByName(String name);
}


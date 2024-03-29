package ru.pakeev.springauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pakeev.springauth.models.MyUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findMyUserByName(String username);
}

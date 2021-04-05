package kz.iitu.lw6_fw.lw6_fw.repository;

import kz.iitu.lw6_fw.lw6_fw.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByLoginAndPassword(String login, String password);
}

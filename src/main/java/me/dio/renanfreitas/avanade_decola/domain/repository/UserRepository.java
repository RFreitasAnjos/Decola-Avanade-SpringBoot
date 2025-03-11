package main.java.me.dio.renanfreitas.avanade_decola.domain.repository;

import me.dio.renanfreitas.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public class UserRepository extends JpaRepository<User, Long> {

}

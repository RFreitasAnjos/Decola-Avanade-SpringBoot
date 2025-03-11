package main.java.me.dio.renanfreitas.avanade_decola.service;

public interface UserService extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);

}

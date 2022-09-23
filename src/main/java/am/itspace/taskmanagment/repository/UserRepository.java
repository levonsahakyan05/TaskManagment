package am.itspace.taskmanagment.repository;

import am.itspace.taskmanagment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}

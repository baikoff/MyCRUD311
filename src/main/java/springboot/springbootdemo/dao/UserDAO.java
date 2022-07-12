package springboot.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.springbootdemo.model.User;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

    void deleteById(Integer id);

//    List<User> getAllUsers();
//
//    void save(User user);
//
//    User findById(int id);
//
//    void update(User user, int id);
//
//    void delete(int id);
}

package springboot.springbootdemo.service;

import springboot.springbootdemo.model.User;


import java.util.List;

public interface UserService {

     void delete(int id);

     void saveUser(User user);

     User findById(int id);

     List<User> getAllUsers();

     void update(User user);
}

package service.dao;


import org.springframework.stereotype.Repository;
import service.model.User;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {

    private List<User> users = Arrays.asList(new User("Admin", "admin"), new User("Vazelin", "noisepass"), new User("Pushnin", "12345"));
    public List<User> getAllUsers(){
        return users;
    }

}

package by.itacademy.brest.revision.task.model;

import by.itacademy.brest.revision.task.exception.UserException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Company {
    private String id;
    private List<User> users;

    public Company() {
        id = UUID.randomUUID().toString();
        users = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        if (users.contains(user)){
            throw new UserException("This user is in the company");
        } else {
            users.add(user);
        }
    }

    public List<User> getUsersByIds(List<String> ids){
        return users.stream()
                .filter(user -> ids.contains(user.getId()))
                .toList();
    }

    public User getUserById(String id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

}

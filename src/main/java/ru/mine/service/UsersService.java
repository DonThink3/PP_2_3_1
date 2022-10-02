package ru.mine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mine.model.User;
import ru.mine.reposetories.UsersReposetories;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UsersService {
    private UsersReposetories usersReposetories;

    @Autowired
    public UsersService(UsersReposetories usersReposetories) {
        this.usersReposetories = usersReposetories;
    }

    public List<User> findAll() {
        return usersReposetories.findAll();
    }
    @Transactional
    public void save(User user) {
        usersReposetories.save(user);
    }

    public User showUser(int id) {
        return usersReposetories.findById(id).orElse(null);
    }

    @Transactional
    public void update(int id, User updateUser) {
        updateUser.setId(id);
        usersReposetories.save(updateUser);
    }
    @Transactional
    public void delete(int id) {
        usersReposetories.delete(showUser(id));
    }
}

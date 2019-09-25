package com.intelligix.serverproductmanagement.service;

import com.intelligix.serverproductmanagement.model.User;
import com.intelligix.serverproductmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User saveUser(User obj) {
        return repo.save(obj);
    }

    @Override
    public User updateUser(User obj) {
        return repo.save(obj);
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

    @Override
    public User findByUsername(final String username){
        return repo.findByUsername(username).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return repo.findAll();
    }

    @Override
    public Long numberOfUsers () {
        return repo.count();
    }
}

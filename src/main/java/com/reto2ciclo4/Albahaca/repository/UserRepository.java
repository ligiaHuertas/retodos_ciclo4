/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reto2ciclo4.Albahaca.repository;

import com.reto2ciclo4.Albahaca.crudRepository.UserCrudRepository;
import com.reto2ciclo4.Albahaca.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Maria Ligia Huertas Moreno
 */
@Repository
public class UserRepository {
    @Autowired
    private UserCrudRepository crudRepository;
    
    public List<User> getAll(){
        return crudRepository.findAll();
    }
    
    public Optional<User> getUser(int id){
        return crudRepository.findById(id);
    }
    
    public User save(User user){
        return crudRepository.save(user);
    }
    public void update(User user){
        crudRepository.save(user);      
    }
    public void delete(User user){
        crudRepository.delete(user);
    }
    
    public boolean emailExist(String email){
        Optional<User> user=crudRepository.findByEmail(email);
        return !user.isEmpty();
    }
    public Optional<User> autenticateUser(String email, String password){
        return crudRepository.findByEmailAndPassword(email,password);
    }
}

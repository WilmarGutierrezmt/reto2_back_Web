/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2_web.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto2_web.interfaces.InterfaceUser;
import reto2_web.modelo.User;


/**
 *
 * @author intel
 */
@Repository
public class UserRepositorio {
    @Autowired
    private InterfaceUser userCrudRepository;
    
    public List<User> gettAll() {
        return (List<User>) userCrudRepository.findAll();
    }
    
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    public User create(User user) {
        return userCrudRepository.save(user);
    }
    
    public User update(User user) {
        return userCrudRepository.save(user);
    }
    
    public void delete(User user) {
        userCrudRepository.delete(user);
    }
    
    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<User> autenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

}

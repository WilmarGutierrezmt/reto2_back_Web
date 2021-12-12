/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto2_web.interfaces;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import reto2_web.modelo.User;

/**
 *
 * @author intel
 */
public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}

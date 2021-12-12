/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto2_web.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import reto2_web.modelo.CleaningProductController;

/**
 *
 * @author intel
 */
public interface InterfaceCleaningProductController extends MongoRepository<CleaningProductController, String>{
    
}

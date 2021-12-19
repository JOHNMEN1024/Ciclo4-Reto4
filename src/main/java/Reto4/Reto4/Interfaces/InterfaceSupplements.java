/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto4.Reto4.Interfaces;

import Reto4.Reto4.Modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author JOHNM
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String>{
    
}

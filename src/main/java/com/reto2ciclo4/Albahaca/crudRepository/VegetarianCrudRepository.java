/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.reto2ciclo4.Albahaca.crudRepository;

import com.reto2ciclo4.Albahaca.model.Vegetarian;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Maria Ligia Huertas moreno
 */
public interface VegetarianCrudRepository extends MongoRepository<Vegetarian,String>{
    
}

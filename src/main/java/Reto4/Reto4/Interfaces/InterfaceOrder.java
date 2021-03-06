/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto4.Reto4.Interfaces;

import Reto4.Reto4.Modelo.Order;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author JOHNM
 */
public interface InterfaceOrder extends MongoRepository<Order, Integer>{
    public List<Order> findBySalesManZone(String zone);

    public List<Order>findBySalesManId(Integer id);

    public List<Order>findBySalesManIdAndStatus(Integer id, String status);

    public List<Order>findByRegisterDayAndSalesManId(Date registerDay,Integer id);
}

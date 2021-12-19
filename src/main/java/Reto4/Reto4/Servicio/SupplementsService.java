/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4.Reto4.Servicio;

import Reto4.Reto4.Modelo.Supplements;
import Reto4.Reto4.Repositorio.SupplementsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JOHNM
 */
@Service
public class SupplementsService {
     @Autowired
    private SupplementsRepository supplementsRepositorio;

    public List<Supplements> getAll() {
        return supplementsRepositorio.getAll();
    }

   public Optional<Supplements> getSupplements(String reference) {
        return supplementsRepositorio.getSupplements(reference);
    }

    public Supplements create(Supplements accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return supplementsRepositorio.create(accesory);
        }
    }

    public Supplements update(Supplements accesory) {

        if (accesory.getReference() != null) {
            Optional<Supplements> accesoryDb = supplementsRepositorio.getSupplements(accesory.getReference());
            if (!accesoryDb.isEmpty()) {
                
                if (accesory.getBrand()!= null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }
                
                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }
                
                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                supplementsRepositorio.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getSupplements(reference).map(accesory -> {
            supplementsRepositorio.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}

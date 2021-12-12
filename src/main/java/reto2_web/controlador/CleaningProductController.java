/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2_web.controlador;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto2_web.servicio.CleaningProductControllerService;

/**
 *
 * @author intel
 */
@RestController
@RequestMapping("/api/cleaningproduct")
@CrossOrigin("*")
public class CleaningProductController {
    @Autowired
    private CleaningProductControllerService accesoryService;
    
    @GetMapping("/all")
    public List<reto2_web.modelo.CleaningProductController> getAll() {
        return accesoryService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<reto2_web.modelo.CleaningProductController> getClothe(@PathVariable("reference") String reference) {
        return accesoryService.getClothe(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public reto2_web.modelo.CleaningProductController create(@RequestBody reto2_web.modelo.CleaningProductController gadget) {
        return accesoryService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public reto2_web.modelo.CleaningProductController update(@RequestBody reto2_web.modelo.CleaningProductController gadget) {
        return accesoryService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accesoryService.delete(reference);
    }
    
}

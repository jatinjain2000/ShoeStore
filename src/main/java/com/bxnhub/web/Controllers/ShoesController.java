package com.bxnhub.web.Controllers;

import com.bxnhub.web.entities.Shoes;
import com.bxnhub.web.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class ShoesController {

    @Autowired
    ShoeService shoeService;
    @PostMapping("/shoes")
    public String createShoes(@RequestBody Shoes shoes){
        shoeService.createShoes(shoes);
        return "success";
    }
    @GetMapping("/shoes")
    public List<Shoes> getShoes(){
        return this.shoeService.getAllShoes();
    }
    @DeleteMapping("/shoes/{shoeId}")
    public void deleteBooks(@PathVariable("shoeId")int shoeId) {
        this.shoeService.deleteShoe(shoeId);
    }

}

package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.model.Buyer;
import fun.digitallpepper.logistic_service.service.BuyerServise;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/buyers")
@AllArgsConstructor
public class BuyerController {

    private final BuyerServise servise;

    @GetMapping
    public List<Buyer> getAllBuyers() {
        return null;
    }

    @PostMapping("saveBuyer")
    public Buyer saveBuyer(@RequestBody Buyer buyer) {
        return servise.saveBuyer(buyer);
    }
    @GetMapping("/get/{id}")
    public Buyer findBuyerById(@PathVariable Long id) {
        return servise.findBuyerById(id);
    }
    @DeleteMapping("remove/{id}")
    public void deleteBuyerById(@PathVariable Long id) {
        servise.deleteBuyerById(id);
    }

}

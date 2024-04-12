package fun.digitallpepper.logistic_service.controller;


import fun.digitallpepper.logistic_service.model.Seller;
import fun.digitallpepper.logistic_service.service.SellerServise;
import lombok.AllArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seller")
@AllArgsConstructor
public class SellerController {

    private SellerServise sellerService;

    @GetMapping("/get/{id}")
//    @PreAuthorize("hasAuthority(ROLE_SELLER)")
    public Seller getSellerById(@PathVariable Long id) {
        return sellerService.findSellerById(id);
    }

    @PostMapping("saveSeller")
//    @PreAuthorize("hasAuthority(ROLE_SELLER)")

    public Seller createSeller(@RequestBody Seller seller) {
        return sellerService.saveSeller(seller);
    }

//    @PutMapping("/{id}")
//    public Seller updateSeller(@PathVariable Long id, @RequestBody Seller seller) {
//        return sellerService.updateSeller(id, seller);
//    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAuthority(ROLE_SELLER)")

    public void deleteSeller(@PathVariable Long id) {
        sellerService.deleteSellerById(id);
    }
}
package fun.digitallpepper.logistic_service.config;

import fun.digitallpepper.logistic_service.model.Buyer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class BuyerDetails implements UserDetails {

    private final Buyer buyer;

    public BuyerDetails(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // TODO: Implement this method
    }

    @Override
    public String getPassword() {
        return buyer.getPassword();
    }

    @Override
    public String getUsername() {
        return buyer.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
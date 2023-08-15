package com.example.backendsercurity.Entity;

import com.example.backendsercurity.Enums.AppUserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AppUsers implements UserDetails {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private AppUserRole appUserRole;
    private boolean locked;
    private boolean enabled;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

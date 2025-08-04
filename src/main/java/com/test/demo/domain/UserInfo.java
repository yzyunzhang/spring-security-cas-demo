package com.test.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author yunzhang
 * @email yzyunzhang@foxmail.com
 * @date 2025/8/4
 * @description
 */
@Getter
@AllArgsConstructor
public class UserInfo implements UserDetails {
    private final String username;
    private final String password = "";

    private Map<String, Object> attributes;
    private final boolean isAccountNonExpired = true;
    private final boolean isAccountNonLocked = true;
    private final boolean isCredentialsNonExpired = true;
    private final boolean isEnabled = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }

}

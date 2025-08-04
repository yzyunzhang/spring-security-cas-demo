package com.test.demo.config;

import com.test.demo.domain.UserInfo;
import org.jasig.cas.client.authentication.AttributePrincipal;
import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Map;

/**
 * @author yunzhang
 * @email yzyunzhang@foxmail.com
 * @date 2025/8/4
 * @description
 */
public class CasUserDetailsService implements
        AuthenticationUserDetailsService<CasAssertionAuthenticationToken> {

    @Override
    public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
        //这里仅做演示，实际项目中可以配合用户角色权限做业务逻辑
        AttributePrincipal principal = token.getAssertion().getPrincipal();
        //在CAS30中，这里可以获取用户名以外的额外信息
        Map<String, Object> attributes = principal.getAttributes();
        return new UserInfo(principal.getName(), attributes);
    }

}

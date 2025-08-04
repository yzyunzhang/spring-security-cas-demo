package com.test.demo.configuration;

import com.test.demo.config.CasProtocol;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yunzhang
 * @email yzyunzhang@foxmail.com
 * @date 2025/8/4
 * @description
 */
@Getter
@Component
public class CasProperties {
    @Value("${cas.protocol}")
    private CasProtocol casProtocol;

    @Value("${cas.server.host.url}")
    private String      casServerUrl;

    @Value("${cas.server.host.logout_url}")
    private String      casServerLogoutUrl;

    @Value("${app.server.host.url}")
    private String      appServerUrl;

    @Value("${app.login.url}")
    private String      appLoginUrl;

    @Value("${app.logout.url}")
    private String      appLogoutUrl;

}

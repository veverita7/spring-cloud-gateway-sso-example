package io.github.veverita7.simplesso.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class GatewaySecurityConfig {
  @Bean
  public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
    return http.csrf()
        .disable()
        .authorizeExchange()
        .anyExchange()
        .authenticated()
        .and()
        .oauth2Login()
        .and()
        .build();
  }
}

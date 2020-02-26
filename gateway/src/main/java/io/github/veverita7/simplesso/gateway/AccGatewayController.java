package io.github.veverita7.simplesso.gateway;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccGatewayController {
  @GetMapping("/me")
  public Map<String, String> getMe(
      @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient client,
      @AuthenticationPrincipal OAuth2User user) {
    Map<String, String> map = new HashMap<>();
    map.put("clientName", client.getClientRegistration().getClientName());
    map.put("user", user.getName());
    return map;
  }
}

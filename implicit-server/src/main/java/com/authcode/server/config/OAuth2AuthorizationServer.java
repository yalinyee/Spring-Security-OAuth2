package com.authcode.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author yeyalin
 * 授权服务器配置
 *
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationServer extends AuthorizationServerConfigurerAdapter{


	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
		.withClient("clientapp")
		.secret("789")
		.redirectUris("http://localhost:9001/callback")
		//客户端模式
		.authorizedGrantTypes("implicit")
		.accessTokenValiditySeconds(120)
		.scopes("read_info");
	}
	

}

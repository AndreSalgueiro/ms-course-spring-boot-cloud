package com.devsuperior.hrapigatewayzull.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@RefreshScope //atualiza em tempo de execucao as variaveis do servidor de conf
@Configuration
public class Appconfig {
	
	//lendo a chave do Jwt no serdor de configuracao
	@Value("${jwt.secret}")
	private String jwtSecret;
	
	//gera token
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		//lendo a chave do Jwt no serdor de configuracao
		tokenConverter.setSigningKey("MY-JWT-SECRET");
		return tokenConverter;
	}
	
	//ler informações do token
	@Bean
	public JwtTokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}

}

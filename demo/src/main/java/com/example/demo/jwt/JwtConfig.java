package com.example.demo.jwt;


import org.springframework.boot.context.properties.ConfigurationProperties;

@SuppressWarnings("ConfigurationProperties")
@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {
}

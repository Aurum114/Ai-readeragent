package com.readify.server.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Value("${spring.mvc.servlet.path:/}")
    private String contextPath;

    @Bean
    public OpenAPI customOpenAPI() {
        // Define HTTP bearer (JWT) security scheme and apply globally
        String securitySchemeName = "bearerAuth";
        return new OpenAPI()
                .components(new Components().addSecuritySchemes(
                        securitySchemeName,
                        new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                ))
                .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
                .info(new Info()
                        .title("Readify API文档")
                        .description("Readify服务端API接口文档")
                        .version("1.0.0"))
                .servers(List.of(new Server().url(contextPath)));
    }
}
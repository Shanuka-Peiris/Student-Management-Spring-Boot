package com.school.studentmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket (DocumentationType.SWAGGER_2)
                .apiInfo(generateAPIInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.school.studentmanagement.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    // Api Information
    private ApiInfo generateAPIInfo() {
        return new ApiInfo("Swagger demo", "Implementing Swagger with SpringBoot Application", "1.0.0", "", "", "", "");
    }
}

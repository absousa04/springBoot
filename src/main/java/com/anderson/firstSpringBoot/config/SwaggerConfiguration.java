package com.anderson.firstSpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	 @Bean
	  public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("com.anderson.firstSpringBoot.controller"))
	        .paths(PathSelectors.ant("/**"))
	        .build()
	        .apiInfo(buildApiInfo());
	  }

	  private ApiInfo buildApiInfo() {
	    return new ApiInfo(
	      "API de Estudos",                                                                 // Nome da API
	      "API para treinamento das tecnologias SpringBoot",    // Descrição
	      "1.0",                                                                              // Versão
	      "",                                                                                 // URL de Termos de uso
	      new Contact("Anderson Sousa", "https://www.linkedin.com/in/asousa04/", ""),  // Contato
	      "",                                                               // Licensa
	      "",                                                             // URL de licensa
	      Collections.emptyList()                                                             // Extensão de fornecedores
	    );
	  }
	}

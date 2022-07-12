package in.gov.abdm.uhi.discovery.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.OAS_30)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any()) 
	          .apis(RequestHandlerSelectors.any())
	          .paths(PathSelectors.any())                          
	          .build()
	        .apiInfo(metaInfo());
	    }
	 
	 private ApiInfo metaInfo() {
			ApiInfo apiinfo = new ApiInfo("UHI-Gateway", "UHI - Unified Health Interface", "1.0",
					"termsOfServiceUrl", "National Health Authority India", "License 1.0", "https://licenseUrl.com");
			return apiinfo;
		}
	}

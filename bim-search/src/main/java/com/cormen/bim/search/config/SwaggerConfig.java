package com.cormen.bim.search.config;

import com.cormen.bim.common.config.BaseSwaggerConfig;
import com.cormen.bim.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by cormen on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.cormen.bim.search.controller")
                .title("bim搜索系统")
                .description("bim搜索相关接口文档")
                .contactName("macro")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}

package com.forest.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger 配置类
 * Created by songlin on 06/06/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @SuppressWarnings("unchecked")

    @Bean
    public Docket testApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .groupName("test")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .paths(Predicates.or(PathSelectors.regex("/api/.*")))//过滤的接口
                .build()
                .apiInfo(testApiInfo());
        ;
        return docket;
    }

    @SuppressWarnings("unchecked")
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(Predicates.or(PathSelectors.regex("/demo/.*")))//过滤的接口
                .build()
                .apiInfo(demoApiInfo());
    }

    private ApiInfo testApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Test相关接口",//大标题
                "Test相关接口，主要用于测试.",//小标题
                "1.0",//版本
                "http://github.com/forestfsl/",
                "forest",//作者
                "健客",//链接显示文字
                "http://www.kfit.com.cn/"//网站链接
        );

        return apiInfo;
    }

    private ApiInfo demoApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Demo相关接口",//大标题
                "Demo相关接口，获取个数，获取列表，注意：",//小标题
                "1.0",//版本
                "http://github.com/forestfsl/",
                "forest",//作者
                "健客",//链接显示文字
                "http://www.kfit.com.cn/"//网站链接
        );

        return apiInfo;
    }
}

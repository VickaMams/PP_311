package ru.mams.PP_311.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver=
                new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/view/" );
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}

package com.training.dependencyInjection.listAlgorithms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    public AscendingSort ascendingSort() {
        return new AscendingSort();
    }

    @Primary
    @Bean
    public DescendingSort descendingSort() {
        return new DescendingSort();
    }
}

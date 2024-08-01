package com.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Configuration
//    public class GatewayConf {
//
//        @Bean
//        public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//            return builder.routes()
//                    .route("cep - Brasilapi", r -> r
//                            .path("/cep/v1/**")
//                            .filters(f -> f.rewritePath("/cep/v1/(?<cep>.*)", "/api/cep/v1/${cep}"))
//                            .uri("https://brasilapi.com.br"))
//                    .route("cep - viacep", r -> r
//                            .path("/cep/v2/**")
//                            .filters(f -> f.rewritePath("/cep/v2/(?<cep>.*)", "/ws/${cep}/json/"))
//                            .uri("https://viacep.com.br"))
//                    .build();
//
//        }
//    }
}

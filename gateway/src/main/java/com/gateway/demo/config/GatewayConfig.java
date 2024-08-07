package com.gateway.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//    @Configuration
//    public class GatewayConf {
//
//        @Bean
//        public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//            return builder.routes()
////                    .route("cep - Brasilapi", r -> r
////                            .path("/cep/v1/**")
////                            .filters(f -> f.rewritePath("/cep/v1/(?<cep>.*)", "/api/cep/v1/${cep}"))
////                            .uri("https://brasilapi.com.br"))
//                    .route("cep - viacep", r -> r
//                            .path("/cep/v2/**")
//                            .filters(f -> f.rewritePath("/cep/v2/(?<cep>.*)", "/ws/${cep}/json/"))
//                            .uri("https://viacep.com.br"))
//                    .route("client_route", r -> r
//                            .path("/cep/v1/**")
//                            .filters(f -> f
//                                    .rewritePath("/cep/v1/(?<cep>.*)", "/cep/${cep}")
//                                    .circuitBreaker(c -> c
//                                            .setName("myCircuitBreaker")
//                                            .setFallbackUri("forward:/fallback"))
//                                    .filter((exchange, chain) -> {
//                                        exchange.getRequest().mutate()
//                                                .header("X-Fallback-Reason", "CircuitBreaker Open");
//                                        return chain.filter(exchange);
//                                    }))
//                            .uri("http://localhost:9000/"))
//                    .route("fallback_route", r -> r
//                            .path("/fallback")
//                            .filters(f -> f.rewritePath("/(?<cep>.*)", "/ws/${cep}/json/"))
//                            .uri("https://viacep.com.br"))
//                    .build();
//
//        }
//    }

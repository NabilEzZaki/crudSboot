//package com.beTalent.game.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//
//@Configuration
//public class CorsConfig {
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        // Imposta qui le tue autorizzazioni CORS
//        config.addAllowedOrigin("http://lochalhost:4200/**"); // Abilita tutti gli origini (sostituisci con l'URL del tuo frontend)
//        config.addAllowedMethod("GET");
//        config.addAllowedMethod("POST");
//        config.addAllowedMethod("PUT");
//        config.addAllowedMethod("DELETE");
//        config.addAllowedHeader("http://lochalhost:4200/**");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
//}

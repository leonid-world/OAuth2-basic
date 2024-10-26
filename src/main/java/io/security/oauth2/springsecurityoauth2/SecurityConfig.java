//package io.security.oauth2.springsecurityoauth2;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//
//    /**
//     * Security Config 를 설정하면, "springSecurityFilterChain" 이름으로 빈이 등록되고
//     * 이 클래스가 Filter Chain Proxy 역할을 한다.
//     */
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
//        http.formLogin(Customizer.withDefaults());
//        http.with(new CustomSecurityConfigurer().isSecure(false), Customizer.withDefaults());
//
//        return http.build();
//    }
//}

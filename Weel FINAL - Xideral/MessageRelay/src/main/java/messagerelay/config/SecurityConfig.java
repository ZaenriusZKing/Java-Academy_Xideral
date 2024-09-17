package messagerelay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Desactiva la protección CSRF para simplificar el uso
            .authorizeRequests()
            .requestMatchers("/api/messages/**").permitAll() // Permite acceso a las rutas de mensajes
            .anyRequest().authenticated(); // Requiere autenticación para cualquier otra ruta

        return http.build();
    }
}

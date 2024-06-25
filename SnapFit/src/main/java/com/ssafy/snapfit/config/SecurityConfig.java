package com.ssafy.snapfit.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.ssafy.snapfit.security.JwtFilter;
import com.ssafy.snapfit.security.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private final JwtUtil jwtUtil;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public SecurityConfig(JwtUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.httpBasic(httpBasic -> httpBasic.disable())
			.csrf(csrf -> csrf.disable())
			.cors(cors -> cors.disable())
			.sessionManagement(sessionManagement -> 
				sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			.authorizeHttpRequests(authorizeRequests -> 
				authorizeRequests
					.requestMatchers("/", "/login", "/signup", "/member/**").permitAll()
//					.requestMatchers("/**").permitAll()
					.anyRequest().authenticated()
			)
			.addFilterBefore(new JwtFilter(jwtUtil), UsernamePasswordAuthenticationFilter.class);
					
	    http.cors((corsCustomizer -> corsCustomizer.configurationSource(new CorsConfigurationSource() {

	        @Override
	        public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {

	            CorsConfiguration configuration = new CorsConfiguration();

	            configuration.setAllowedOrigins(Collections.singletonList("http://localhost:5173"));
	            configuration.setAllowedMethods(Collections.singletonList("*"));
	            configuration.setAllowCredentials(true);
	            configuration.setAllowedHeaders(Collections.singletonList("*"));
	            configuration.setMaxAge(3600L);

	            configuration.setExposedHeaders(Collections.singletonList("Authorization"));

	            return configuration;
	        }
	    })));
		return http.build();
	}
	
	
}

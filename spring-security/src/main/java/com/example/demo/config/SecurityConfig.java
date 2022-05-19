package com.example.demo.config;

import javax.sql.DataSource;

//import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   
	@Autowired
	DataSource dataSource;
	@Autowired
   BCryptPasswordEncoder encoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeHttpRequests().antMatchers("/api/v1/**")
		.authenticated().and().httpBasic();

	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		String sql="select u.user_name,a.authority from rishi_authorities a,rishi_users u where u.user_name=?"
				+"and u.user_name=a.user_name";
//	auth.inMemoryAuthentication().withUser("india").password(encoder.encode("india"))
//	.roles("ADMIN").and().withUser("nepal").
//	password(encoder.encode("nepal")).roles("GUEST");
		
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(
				
		"select user_name,password,enabled from rishi_users where user_name=?"
			).authoritiesByUsernameQuery(sql).passwordEncoder(encoder);
	}
}

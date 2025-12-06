package edu.eurotrans.configuration;

/*
  @author   Olga
  @project   EuroTrans
  @class  SecurityConfig
  @version  1.0.0
  @since 28.06.25 - 13.05
*/
import com.vaadin.flow.spring.security.VaadinWebSecurity;
import edu.eurotrans.dao.service.SecurityService;
import edu.eurotrans.ui.security.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends VaadinWebSecurity {

	@Autowired
	private SecurityService securityService;

	@Bean
	public static PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.csrf().disable();
		http.csrf().ignoringRequestMatchers(new AntPathRequestMatcher("/api/**"));
		http.authorizeHttpRequests().requestMatchers(new AntPathRequestMatcher("/ui/**"), new AntPathRequestMatcher("/api/**")).permitAll();
		http.httpBasic();
		super.configure(http);
		setLoginView(http, LoginView.class);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.userDetailsService(securityService)
				.passwordEncoder(passwordEncoder());
	}

}

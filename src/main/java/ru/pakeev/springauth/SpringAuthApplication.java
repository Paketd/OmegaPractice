package ru.pakeev.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import ru.pakeev.springauth.components.JwtCore;

@SpringBootApplication
public class SpringAuthApplication {
//	private JwtCore jwtCore;
//
//	public void setJwtCore(JwtCore jwtCore) {
//		this.jwtCore = jwtCore;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthApplication.class, args);
	}

}

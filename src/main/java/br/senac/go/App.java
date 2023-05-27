package br.senac.go;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

	@SpringBootApplication
	@EnableJpaRepositories("br.senac.go.repositories")
	@EntityScan("br.senac.go.domain")

/*@ComponentScan("com.lapots.breed.platform.cloud.boot")
@EnableJpaRepositories("com.lapots.breed.platform.cloud.boot.repository")
@EntityScan("com.lapots.breed.platform.cloud.boot.domain")*/
public class App {

	public static void main(String[] args) {
		//Springapp
		SpringApplication.run(App.class);
	}
}

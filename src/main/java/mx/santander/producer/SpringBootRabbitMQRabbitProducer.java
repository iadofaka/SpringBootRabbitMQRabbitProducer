package mx.santander.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitMQRabbitProducer {

	public static void main(String[] args) {

		SpringApplication.run( SpringBootRabbitMQRabbitProducer.class , args);
	}
}
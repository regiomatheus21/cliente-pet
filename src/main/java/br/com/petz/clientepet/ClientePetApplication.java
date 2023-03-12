package br.com.petz.clientepet;


import br.com.petz.clientepet.cliente.domain.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.stream.XMLEventWriter;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetApplication {
	@GetMapping
	public String getHomeTeste(){
		return "Cliente Pet- API home";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);
	}

}

package reto2_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reto2_web.interfaces.InterfaceCleaningProductController;
import reto2_web.interfaces.InterfaceUser;

@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {
    @Autowired
    private InterfaceCleaningProductController interfaceCleaningProductControllers;
    
    @Autowired
    private InterfaceUser  interfaceUser;
    	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}

        @Override
    public void run(String... args) throws Exception {
        interfaceCleaningProductControllers.deleteAll();
        interfaceUser.deleteAll();
}
        
}

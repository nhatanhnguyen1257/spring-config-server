package vn.na.config.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class App 
{
	 public static void main(String[] arguments) {
	        SpringApplication.run(App.class, arguments);
	    }
}

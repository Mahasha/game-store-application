package co.za.tbh.store;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameStoreApiApplication {

    public static void main(String[] args) {
        // Load .env using Dotenv library
        Dotenv dotenv = Dotenv.load();
        // Optionally: set system properties or environment
        System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
        System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
        SpringApplication.run(GameStoreApiApplication.class, args);
    }

}

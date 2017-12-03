package uek.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MorferServerApplication {
    private static final String DEFAULT_PORT = "9000";

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MorferServerApplication.class);
        Map<String, Object> map = new HashMap<>();
        String port = System.getenv("SERVER_PORT");
        if (port == null) {
            port = DEFAULT_PORT;
        }
        map.put("SERVER_PORT", port);
        application.setDefaultProperties(map);
        application.run(args);
    }
}

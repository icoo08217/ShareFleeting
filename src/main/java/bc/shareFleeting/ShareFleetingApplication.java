package bc.shareFleeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ShareFleetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareFleetingApplication.class, args);
	}

}

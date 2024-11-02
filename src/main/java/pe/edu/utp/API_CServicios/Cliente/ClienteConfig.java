package pe.edu.utp.API_CServicios.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Configuration
public class ClienteConfig {
    @Bean
    CommandLineRunner commandLineRunner(ClienteRepository repo) {
        return args -> {
            Cliente Xio = new Cliente(
                    "Xiomy",
                    "IG",
                    "987654321",
                    "Xio@gmail.com",
                    "San Antonio",
                    LocalDate.of(2001, Month.JANUARY, 1)
            );


            repo.saveAll(List.of(Xio));
        };

    }
}



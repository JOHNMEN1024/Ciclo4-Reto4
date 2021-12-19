package Reto4.Reto4;

import Reto4.Reto4.Interfaces.InterfaceOrder;
import Reto4.Reto4.Interfaces.InterfaceSupplements;
import Reto4.Reto4.Interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto4Application implements CommandLineRunner{

    @Autowired
    private InterfaceSupplements supplementsRepository;

    @Autowired
    private InterfaceUser userRepository;

    @Autowired
    private InterfaceOrder orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto4Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        supplementsRepository.deleteAll();
        orderRepository.deleteAll();
    }
}

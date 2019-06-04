package lk.ijse.pos.main;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("lk.ijse.pos")
@Import(HibernateConfig.class)
public class AppConfig {


}

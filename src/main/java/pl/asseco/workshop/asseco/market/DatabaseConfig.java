package pl.asseco.workshop.asseco.market;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by krzysztof.bogucki on 5 wrz 2017.
 */
@Configuration
@ComponentScan(basePackages = "pl.asseco.workshop.market.controller")
public class DatabaseConfig {



}

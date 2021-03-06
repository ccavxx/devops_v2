package org.alvin.opsdev.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2016/12/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableCaching
@EnableScheduling
@EnableConfigurationProperties
@ComponentScan("org.alvin.opsdev.monitor")
@EnableJpaRepositories("org.alvin.opsdev.monitor.system.repository" )
@EntityScan("org.alvin.opsdev.monitor.system.domain")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

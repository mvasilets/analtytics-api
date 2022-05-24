package me.msvasilets.analytics.starter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("me.msvasilets.analytics.starter.domain")
@ComponentScan(basePackages = "me.msvasilets")
public class StarterConfiguration {


}

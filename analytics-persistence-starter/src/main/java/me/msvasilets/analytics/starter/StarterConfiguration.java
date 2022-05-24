package me.msvasilets.analytics.starter;

import me.msvasilets.analytics.starter.domain.AnalyticsRepository;
import me.msvasilets.analytics.starter.service.AnalyticService;
import me.msvasilets.analytics.starter.service.SimpleAnalyticService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("me.msvasilets.analytics.starter.domain")
@ComponentScan(basePackages = "me.msvasilets")
public class StarterConfiguration {

    @Bean
    @ConditionalOnMissingBean(AnalyticService.class)
    public SimpleAnalyticService analyticService(AnalyticsRepository repository) {
        return new SimpleAnalyticService(repository);
    }

}

package me.msvasilets.starterapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.msvasilets.analytics.starter.domain.Analytics;
import me.msvasilets.analytics.starter.domain.AnalyticsRepository;
import me.msvasilets.analytics.starter.service.AnalyticService;
import me.msvasilets.starterapp.entity.AnalyticsEntry;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnalyticServiceImpl implements AnalyticService {

    private final AnalyticsRepository repository;

    @Override
    public AnalyticsEntry findById(String id) {
        return (AnalyticsEntry) repository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Analytics save(Analytics analytics) {
        return repository.save(analytics);
    }

}

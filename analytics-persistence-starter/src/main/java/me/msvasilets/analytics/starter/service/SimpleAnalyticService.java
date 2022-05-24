package me.msvasilets.analytics.starter.service;

import lombok.RequiredArgsConstructor;
import me.msvasilets.analytics.starter.domain.Analytics;
import me.msvasilets.analytics.starter.domain.AnalyticsRepository;

@RequiredArgsConstructor
public class SimpleAnalyticService implements AnalyticService {
    private final AnalyticsRepository repository;

    @Override
    public Analytics findById(String id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Analytics save(Analytics analytics) {
        return repository.save(analytics);
    }
}

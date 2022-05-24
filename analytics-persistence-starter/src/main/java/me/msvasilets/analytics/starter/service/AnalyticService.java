package me.msvasilets.analytics.starter.service;

import me.msvasilets.analytics.starter.domain.Analytics;

public interface AnalyticService {

    Analytics findById(String id);

    Analytics save(Analytics analytics);

}

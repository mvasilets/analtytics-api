package ru.clevertec.starterapp.service;

import ru.clevertec.starterapp.dto.AnalyticsDTO;
import ru.clevertec.starterapp.entity.AnalyticsEntry;

import java.util.List;

public interface AnalyticService {
    AnalyticsDTO findById(String id);

    List<AnalyticsDTO> filterByType(String type);

    AnalyticsEntry addNew(AnalyticsDTO analyticsDTO);
}

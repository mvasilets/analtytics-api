package ru.clevertec.starterapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.clevertec.starterapp.entity.AnalyticsEntry;
import ru.clevertec.starterapp.entity.AnalyticsEntryType;

import java.util.List;

public interface AnalyticsRepository extends MongoRepository<AnalyticsEntry, String> {
    List<AnalyticsEntry> findAllByType(AnalyticsEntryType type);
}

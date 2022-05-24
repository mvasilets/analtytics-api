package me.msvasilets.starterapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.msvasilets.analytics.starter.domain.Analytics;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnalyticsEntry implements Analytics {

    private String id;

    private LocalDateTime createdAt;

    private AnalyticsEntryType type;

    private Map<String, Object> additionalData;
}

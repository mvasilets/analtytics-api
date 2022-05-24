package me.msvasilets.analytics.starter.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collation = "analytics")
public interface Analytics {
    @Id
    String getId();

    Map<String, Object> getAdditionalData();

    void setAdditionalData(Map<String, Object> additionalData);

    LocalDateTime getCreatedAt();

    void setCreatedAt(LocalDateTime createdAt);
}

package me.msvasilets.starterapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.msvasilets.starterapp.entity.AnalyticsEntryType;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnalyticsDTO {

    private String id;

    private LocalDateTime createdAt;

    private AnalyticsEntryType type;

    private Map<String, String> additionalData;

}

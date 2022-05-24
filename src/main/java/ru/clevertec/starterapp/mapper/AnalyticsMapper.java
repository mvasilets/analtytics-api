package ru.clevertec.starterapp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.clevertec.starterapp.dto.AnalyticsDTO;
import ru.clevertec.starterapp.entity.AnalyticsEntry;

@Mapper(componentModel = "spring")
public interface AnalyticsMapper {

    AnalyticsDTO toDTO(AnalyticsEntry entry);

    AnalyticsEntry toEntity(AnalyticsDTO dto);

}

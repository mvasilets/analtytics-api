package ru.clevertec.starterapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.clevertec.starterapp.dto.AnalyticsDTO;
import ru.clevertec.starterapp.entity.AnalyticsEntry;
import ru.clevertec.starterapp.service.AnalyticService;

import java.util.List;

@RestController
@RequestMapping("analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final AnalyticService analyticService;

    @GetMapping("{id}")
    public AnalyticsDTO findById(@PathVariable("id") String id) {
        return analyticService.findById(id);
    }

    @GetMapping("filter")
    public List<AnalyticsDTO> findByType(@RequestParam("type") String type) {
        return analyticService.filterByType(type);
    }

    @PostMapping
    public AnalyticsEntry addNewEntry(@RequestBody AnalyticsDTO analyticsDTO) {
        return analyticService.addNew(analyticsDTO);
    }

}

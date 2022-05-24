package me.msvasilets.starterapp.controller;

import lombok.RequiredArgsConstructor;
import me.msvasilets.analytics.starter.domain.Analytics;
import me.msvasilets.analytics.starter.service.AnalyticService;
import me.msvasilets.starterapp.entity.AnalyticsEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("analytics")
@RequiredArgsConstructor
public class AnalyticsController {

    private final AnalyticService analyticService;

    @GetMapping("{id}")
    public Analytics findById(@PathVariable("id") String id) {
        return analyticService.findById(id);
    }

    @PostMapping
    public Analytics addNewEntry(@RequestBody AnalyticsEntry analytics) {
        return analyticService.save(analytics);
    }

}

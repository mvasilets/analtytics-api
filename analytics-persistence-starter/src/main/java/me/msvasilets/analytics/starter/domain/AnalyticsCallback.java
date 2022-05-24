package me.msvasilets.analytics.starter.domain;

import org.bson.Document;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveCallback;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AnalyticsCallback implements BeforeSaveCallback<Analytics> {

    @Override
    public Analytics onBeforeSave(Analytics entity, Document document, String collection) {
        entity.setCreatedAt(LocalDateTime.now());
        return entity;
    }

}

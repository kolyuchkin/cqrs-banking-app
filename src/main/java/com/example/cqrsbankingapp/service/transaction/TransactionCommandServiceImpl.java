package com.example.cqrsbankingapp.service.transaction;

import com.example.cqrsbankingapp.domain.model.Transaction;
import com.example.cqrsbankingapp.events.TransactionCreateEvent;
import com.example.cqrsbankingapp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionCommandServiceImpl
        implements TransactionCommandService {

    private final EventService eventService;

    @Override
    public void create(
            final Transaction object
    ) {
        TransactionCreateEvent event = new TransactionCreateEvent(object);
        eventService.create(event);
    }

}

package com.example.cqrsbankingapp.events;

import com.example.cqrsbankingapp.domain.aggregate.Aggregate;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ClientCreateEvent extends AbstractEvent {

    public ClientCreateEvent(
            final Object payload
    ) {
        super(null, EventType.CLIENT_CREATE, payload);
    }

    @Override
    public void apply(
            final Aggregate aggregate
    ) {
        //TODO implement
    }

}

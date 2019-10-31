package com.blueprint.mapper;

import org.mapstruct.Mapper;

import com.blueprint.domain.Subscriber;
import com.blueprint.dto.SubscriberDTO;

@Mapper(componentModel = "spring", uses = { AddressMapper.class, AdvisorMapper.class, MovementMapper.class })
public interface SubscriberMapper {

    SubscriberDTO toDto(Subscriber subscriber);

    Subscriber toModel(SubscriberDTO subscriberDTO);
}

package com.blueprint.mapper;

import org.mapstruct.Mapper;

import com.blueprint.domain.Movement;
import com.blueprint.dto.MovementDTO;

@Mapper(componentModel = "spring", uses = {AdvisorMapper.class})
public interface MovementMapper {

    MovementDTO toDto(Movement movement);

    Movement toModel(MovementDTO movementsDTO);
}
